package crm.repository.product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Tuple;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.persistence.criteria.Selection;
import crm.model.product.Product;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@AllArgsConstructor
public class IProductRepositoryCustom implements ProductRepositoryCustom{

    private final EntityManager entityManager;

    //Этот метод предназначен для получения страницы продуктов, которые содержат только переданные поля в запросе
    @Override
    public Page<Map<String, Object>> getProductsByFieldsCustom(List<String> fields, Pageable pageable) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        // Основной запрос
        CriteriaQuery<Tuple> cq = cb.createTupleQuery();
        Root<Product> root = cq.from(Product.class);

        List<Selection<?>> selections = new ArrayList<>();
        for (String field : fields) {
            selections.add(root.get(field).alias(field));
        }
        cq.multiselect(selections);

        // Создаем запрос для получения данных с учетом пагинации
        TypedQuery<Tuple> query = entityManager.createQuery(cq);
        query.setFirstResult((int) pageable.getOffset()); // смещение
        query.setMaxResults(pageable.getPageSize());      // размер страницы

        List<Tuple> results = query.getResultList();

        // Преобразуем Tuple в список Map
        List<Map<String, Object>> resultList = new ArrayList<>();
        for (Tuple tuple : results) {
            Map<String, Object> map = new HashMap<>();
            for (String field : fields) {
                map.put(field, tuple.get(field));
            }
            resultList.add(map);
        }

        // Получение общего количества элементов
        CriteriaQuery<Long> countQuery = cb.createQuery(Long.class);
        Root<Product> countRoot = countQuery.from(Product.class);
        countQuery.select(cb.count(countRoot));

        Long totalElements = entityManager.createQuery(countQuery).getSingleResult();

        return new PageImpl<>(resultList, pageable, totalElements);
    }
}

package crm.repository.product;

import crm.model.product.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Tuple;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.persistence.criteria.Selection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

/**
 * RepositoryCustomImpl - This class contains methods for requests custom.
 * Used for customized returns Product fields.
 */
@Repository
@AllArgsConstructor
public class ProductRepositoryCustomImpl implements ProductRepositoryCustom {

  private final EntityManager entityManager;

  // Этот метод предназначен для получения страницы продуктов,
  // которые
  // содержат только переданные поля в запросе
  @Override
  public Page<Map<String, Object>> findProducts(List<String> fields, Pageable pg) {
    CriteriaBuilder cb = entityManager.getCriteriaBuilder();

    // Основной запрос
    CriteriaQuery<Tuple> cq = cb.createTupleQuery();
    Root<Product> root = cq.from(Product.class);

    List<Selection<?>> selections = new ArrayList<>();
    for (String fd : fields) {
      selections.add(root.get(fd).alias(fd));
    }
    cq.multiselect(selections);

    // Создаем запрос для получения данных с учетом пагинации
    TypedQuery<Tuple> query = entityManager.createQuery(cq);
    query.setFirstResult((int) pg.getOffset()); // смещение
    query.setMaxResults(pg.getPageSize());      // размер страницы

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

    return new PageImpl<>(resultList, pg, totalElements);
  }
}

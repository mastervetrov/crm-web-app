package crm.repository.product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ProductRepositoryCustom {
    Page<Map<String, Object>> getProductsByFieldsCustom(List<String> fields, Pageable pageable);
}

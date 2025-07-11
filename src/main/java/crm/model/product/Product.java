package crm.model.product;

import crm.request.product.ProductRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * Entity product.
 * Contains product data.
 *
 * @see crm.service.product.Productservice
 * @see crm.repository.product.ProductRepository
 * @see crm.mapper.product.ProductMapper
 * @see ProductRequest
 * @see crm.dto.product.ProductDto
 */
@Entity
@Table(name = "product")
@Getter
@Setter
public class Product {
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name", columnDefinition = "varchar(255)", nullable = false)
  private String name;

  @Column(name = "description", columnDefinition = "TEXT")
  private String description;

  @Column(name = "retail_price", nullable = false)
  private BigDecimal retailPrice;

  @Column(name = "dealer_price", nullable = false)
  private BigDecimal dealerPrice;

  @Column(name = "partner_price", nullable = false)
  private BigDecimal partnerPrice;

  @Column(name = "count")
  private Integer count;

  @Column(name = "is_new", nullable = false)
  private boolean isNew;

  @Column(name = "is_hit", nullable = false)
  private boolean isHit;

  @Column(name = "picture")
  private String picture;

  @CreationTimestamp
  @Column(name = "created_at", nullable = false)
  private LocalDateTime createdAt;

  @UpdateTimestamp
  @Column(name = "updated_at", nullable = false)
  private LocalDateTime updatedAt;

  //  private List<Review> reviews; список отзывов
  //  private Double averageRating;
  //  private Category category; категория
  //  private Set<Tag> tags; тэги
  //  private String sku; уникальный ид товара (артикул)
  //  private boolean isActive; активен ли товар (в продаже или нет)
  //  private boolean isAvailable; доступен ли товар на складе
  //  private BigDecimal weight; вес (для доставки)
  //  private String dimensions; размеры (для доставки)
  //  BigDecimal discountPrice; цена со скидкой
  //  LocalDateTime discountStartDate; и discountEndDate; цена старта скидки и конца
  //  String brand; бренд\
  @Override
  public String toString() {
    return "Product{"
        + "id=" + id
        + ", name='" + name + '\''
        + ", description='" + description + '\''
        + ", retailPrice=" + retailPrice
        + ", dealerPrice=" + dealerPrice
        + ", partnerPrice=" + partnerPrice
        + ", count=" + count
        + ", isNew=" + isNew
        + ", isHit=" + isHit
        + ", picture='" + picture
        + '\''
        + ", createdAt=" + createdAt
        + ", updatedAt=" + updatedAt
        + '}';
  }
}

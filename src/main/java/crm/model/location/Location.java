package crm.model.location;

import crm.request.location.LocationRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity location.
 * Contains location data.
 *
 * @see crm.dto.location.LocationDto
 * @see LocationRequest
 * @see crm.service.location.LocationService
 * @see crm.repository.LocationRepository
 */
@Getter
@Setter
@Entity
@Table(name = "location")
public class Location {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "color")
  private String color;

  @Column(name = "address")
  private String address;

  @Column(name = "phone_number")
  private String phoneNumber;

}

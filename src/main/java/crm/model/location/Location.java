package crm.model.location;

import crm.model.contractor.Contractor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entity location.
 * Contains location data.
 *
 * @see crm.dto.location.LocationDto
 * @see crm.request.location.LocationUpsertRequest
 * @see crm.service.location.LocationSvc
 * @see crm.repository.LocationRepository
 */
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

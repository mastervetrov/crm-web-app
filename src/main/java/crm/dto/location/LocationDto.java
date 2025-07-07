package crm.dto.location;

import crm.service.location.LocationSvc;
import lombok.Data;

/**
 * Response Dto - contains location data.
 * Used for return to the controller
 *
 * @see LocationSvc
 *
 */
@Data
public class LocationDto {

  private Long id;
  private String name;
  private String color;
  private String address;
  private String phoneNumber;

}

package crm.request.location;

import lombok.Data;

/**
 * Request - contains location fields.
 * Used for update and create location.
 * todo supplement to the javadoc controller
 *
 * @see crm.service.location.LocationService
 */
@Data
public class LocationRequest {
  private String name;
  private String color;
  private String address;
  private String phoneNumber;

}

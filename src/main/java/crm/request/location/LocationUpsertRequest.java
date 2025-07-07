package crm.request.location;

import crm.service.location.LocationSvc;
import lombok.Data;

/**
 * Request - contains location fields.
 * Used for update and create location.
 * todo supplement to the javadoc controller
 *
 * @see LocationSvc
 */
@Data
public class LocationUpsertRequest {
  private String name;
  private String color;
  private String address;
  private String phoneNumber;

}

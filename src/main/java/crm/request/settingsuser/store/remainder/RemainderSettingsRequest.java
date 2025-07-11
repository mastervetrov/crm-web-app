package crm.request.settingsuser.store.remainder;

import crm.dto.settingsuser.remainder.RemainderFieldDto;
import java.util.List;
import lombok.Data;

/**
 * REQUEST - contains field list displayed in table remainders.
 * Used for save and update remainder settings
 */
@Data
public class RemainderSettingsRequest {

  private List<RemainderFieldDto> displayedRemainderFieldList;

}

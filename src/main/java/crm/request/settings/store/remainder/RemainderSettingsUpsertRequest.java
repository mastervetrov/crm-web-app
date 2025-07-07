package crm.request.settings.store.remainder;

import crm.dto.settings.remainder.RemainderFieldDto;
import java.util.List;
import lombok.Data;

/**
 * REQUEST - contains field list displayed in table remainders.
 * Used for save and update remainder settings
 */
@Data
public class RemainderSettingsUpsertRequest {

  private List<RemainderFieldDto> displayedRemainderFieldList;

}

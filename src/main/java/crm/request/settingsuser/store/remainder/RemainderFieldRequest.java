package crm.request.settingsuser.store.remainder;

import crm.dto.settingsuser.remainder.RemainderSettingsDto;
import lombok.Data;

/**
 * REQUEST - contains fields parameters.
 * Used for
 * 1) initialize data
 * 2) create new display field
 */
@Data
public class RemainderFieldRequest {

  private String name;

  private String label;

  private boolean isVisible;

  private boolean isRequire;

  private Integer orderField;

  private RemainderSettingsDto remainderSettings;
}

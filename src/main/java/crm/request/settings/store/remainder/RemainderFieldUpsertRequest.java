package crm.request.settings.store.remainder;

import crm.dto.settings.remainder.RemainderSettingsDto;
import lombok.Data;

/**
 * REQUEST - contains fields parameters.
 * Used for
 * 1) initialize data
 * 2) create new display field
 */
@Data
public class RemainderFieldUpsertRequest {

  private String name;

  private String label;

  private boolean isVisible;

  private boolean isRequire;

  private Integer orderField;

  private RemainderSettingsDto remainderSettings;
}

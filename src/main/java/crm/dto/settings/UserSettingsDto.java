package crm.dto.settings;

import crm.dto.settings.response.store.remainder.RemainderSettingsDto;
import lombok.Data;

@Data
public class UserSettingsDto {

    private Long id;

    private RemainderSettingsDto remainderSettings;

    //Предполагается, что класс будет содержать множество настроек

}

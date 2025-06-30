package crm.dto.settings.response.store.remainder;

import lombok.Data;

import java.util.List;

@Data
public class RemainderSettingsDto {

    private Long id;

    private List<DisplayedRemainderFieldDto> displayedRemainderFieldList;

}

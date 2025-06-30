package crm.dto.settings.response.store.remainder;

import lombok.Data;

@Data
public class DisplayedRemainderFieldDto {

    private Long id;

    private String name;

    private String label;

    private boolean isVisible;

    private boolean isRequire;

    private Integer order;

}

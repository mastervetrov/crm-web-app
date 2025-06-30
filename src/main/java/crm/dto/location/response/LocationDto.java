package crm.dto.location.response;

import lombok.Data;

@Data
public class LocationDto {

    private Long id;
    private String name;
    private String color;
    private String address;
    private String phoneNumber;

}

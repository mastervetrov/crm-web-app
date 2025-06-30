package crm.dto.location.request;

import lombok.Data;

@Data
public class LocationUpsertRequest {
    private String name;
    private String color;
    private String address;
    private String phoneNumber;

}

package crm.startup.settingsuser.store.remainder;

import crm.dto.settingsuser.remainder.RemainderSettingsDto;
import crm.request.settingsuser.store.remainder.RemainderFieldRequest;
import crm.service.settingsuser.store.remainder.RemainderFieldService;
import crm.service.settingsuser.store.remainder.RemainderSettingsService;
import crm.startup.DatabaseSeeder;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Initialize RemainderField and RemainderSettings entities after run app.
 *
 * @see crm.model.settingsuser.store.remainder.RemainderField
 * @see crm.model.settingsuser.store.remainder.RemainderSettings
 * @see RemainderFieldService
 */
@Component
@AllArgsConstructor
public class RemainderFieldInitializer implements DatabaseSeeder {

  private final RemainderFieldService service;
  private final RemainderSettingsService settingsService;

  @Override
  public void initialize() {

    RemainderFieldRequest fieldDto1 = new RemainderFieldRequest();
    fieldDto1.setName("id");
    fieldDto1.setLabel("код");
    fieldDto1.setVisible(true);
    fieldDto1.setRequire(true);
    fieldDto1.setOrderField(1);

    List<RemainderFieldRequest> fieldDtoList = new ArrayList<>();
    fieldDtoList.add(fieldDto1);

    RemainderFieldRequest fieldDto2 = new RemainderFieldRequest();
    fieldDto2.setName("name");
    fieldDto2.setLabel("имя");
    fieldDto2.setVisible(true);
    fieldDto2.setRequire(true);
    fieldDto2.setOrderField(2);


    fieldDtoList.add(fieldDto2);

    RemainderFieldRequest fieldDto3 = new RemainderFieldRequest();
    fieldDto3.setName("description");
    fieldDto3.setLabel("описание");
    fieldDto3.setVisible(true);
    fieldDto3.setRequire(true);
    fieldDto3.setOrderField(3);


    fieldDtoList.add(fieldDto3);

    RemainderFieldRequest fieldDto4 = new RemainderFieldRequest();
    fieldDto4.setName("retailPrice");
    fieldDto4.setLabel("розничная цена");
    fieldDto4.setVisible(true);
    fieldDto4.setRequire(true);
    fieldDto4.setOrderField(4);


    fieldDtoList.add(fieldDto4);

    RemainderFieldRequest fieldDto5 = new RemainderFieldRequest();
    fieldDto5.setName("dealerPrice");
    fieldDto5.setLabel("дилерская цена");
    fieldDto5.setVisible(true);
    fieldDto5.setRequire(true);
    fieldDto5.setOrderField(5);


    fieldDtoList.add(fieldDto5);

    RemainderFieldRequest fieldDto6 = new RemainderFieldRequest();
    fieldDto6.setName("partnerPrice");
    fieldDto6.setLabel("партнерская цена");
    fieldDto6.setVisible(true);
    fieldDto6.setRequire(true);
    fieldDto6.setOrderField(6);


    fieldDtoList.add(fieldDto6);

    RemainderFieldRequest fieldDto7 = new RemainderFieldRequest();
    fieldDto7.setName("count");
    fieldDto7.setLabel("количество");
    fieldDto7.setVisible(true);
    fieldDto7.setRequire(true);
    fieldDto7.setOrderField(7);


    fieldDtoList.add(fieldDto7);

    RemainderFieldRequest fieldDto8 = new RemainderFieldRequest();
    fieldDto8.setName("isNew");
    fieldDto8.setLabel("новинка");
    fieldDto8.setVisible(true);
    fieldDto8.setRequire(true);
    fieldDto8.setOrderField(8);


    fieldDtoList.add(fieldDto8);

    RemainderFieldRequest fieldDto9 = new RemainderFieldRequest();
    fieldDto9.setName("isHit");
    fieldDto9.setLabel("хит");
    fieldDto9.setVisible(true);
    fieldDto9.setRequire(true);
    fieldDto9.setOrderField(9);


    fieldDtoList.add(fieldDto9);

    RemainderFieldRequest fieldDto10 = new RemainderFieldRequest();
    fieldDto10.setName("picture");
    fieldDto10.setLabel("изображение");
    fieldDto10.setVisible(true);
    fieldDto10.setRequire(true);
    fieldDto10.setOrderField(10);


    fieldDtoList.add(fieldDto10);

    RemainderFieldRequest fieldDto11 = new RemainderFieldRequest();
    fieldDto11.setName("category");
    fieldDto11.setLabel("категория");
    fieldDto11.setVisible(true);
    fieldDto11.setRequire(true);
    fieldDto11.setOrderField(11);


    fieldDtoList.add(fieldDto11);

    RemainderFieldRequest fieldDto12 = new RemainderFieldRequest();
    fieldDto12.setName("createdUt");
    fieldDto12.setLabel("создано");
    fieldDto12.setVisible(true);
    fieldDto12.setRequire(true);
    fieldDto12.setOrderField(12);


    fieldDtoList.add(fieldDto12);

    RemainderFieldRequest fieldDto13 = new RemainderFieldRequest();
    fieldDto13.setName("updatedAt");
    fieldDto13.setLabel("обновлено");
    fieldDto13.setVisible(true);
    fieldDto13.setRequire(true);
    fieldDto13.setOrderField(13);

    fieldDtoList.add(fieldDto13);

    RemainderSettingsDto remainderSettingsDto = (RemainderSettingsDto) settingsService.findById(1L);
    fieldDtoList.forEach(x -> x.setRemainderSettings(remainderSettingsDto));
    fieldDtoList.forEach(service::save);
  }
}

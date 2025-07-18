package crm.startup.settings.store.remainder;

import crm.dto.settings.remainder.RemainderSettingsDto;
import crm.request.settings.store.remainder.RemainderFieldUpsertRequest;
import crm.service.settings.store.remainder.RemainderFieldSvc;
import crm.service.settings.store.remainder.RemainderSettingsSvc;
import crm.startup.DatabaseSeeder;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Initialize RemainderField and RemainderSettings entities after run app.
 *
 * @see crm.model.settings.store.remainder.RemainderField
 * @see crm.model.settings.store.remainder.RemainderSettings
 * @see RemainderFieldSvc
 */
@Component
@AllArgsConstructor
public class RemainderFieldInitializer implements DatabaseSeeder {

  private final RemainderFieldSvc service;
  private final RemainderSettingsSvc settingsService;

  @Override
  public void initialize() {

    RemainderFieldUpsertRequest fieldDto1 = new RemainderFieldUpsertRequest();
    fieldDto1.setName("id");
    fieldDto1.setLabel("код");
    fieldDto1.setVisible(true);
    fieldDto1.setRequire(true);
    fieldDto1.setOrderField(1);

    List<RemainderFieldUpsertRequest> fieldDtoList = new ArrayList<>();
    fieldDtoList.add(fieldDto1);

    RemainderFieldUpsertRequest fieldDto2 = new RemainderFieldUpsertRequest();
    fieldDto2.setName("name");
    fieldDto2.setLabel("имя");
    fieldDto2.setVisible(true);
    fieldDto2.setRequire(true);
    fieldDto2.setOrderField(2);


    fieldDtoList.add(fieldDto2);

    RemainderFieldUpsertRequest fieldDto3 = new RemainderFieldUpsertRequest();
    fieldDto3.setName("description");
    fieldDto3.setLabel("описание");
    fieldDto3.setVisible(true);
    fieldDto3.setRequire(true);
    fieldDto3.setOrderField(3);


    fieldDtoList.add(fieldDto3);

    RemainderFieldUpsertRequest fieldDto4 = new RemainderFieldUpsertRequest();
    fieldDto4.setName("retailPrice");
    fieldDto4.setLabel("розничная цена");
    fieldDto4.setVisible(true);
    fieldDto4.setRequire(true);
    fieldDto4.setOrderField(4);


    fieldDtoList.add(fieldDto4);

    RemainderFieldUpsertRequest fieldDto5 = new RemainderFieldUpsertRequest();
    fieldDto5.setName("dealerPrice");
    fieldDto5.setLabel("дилерская цена");
    fieldDto5.setVisible(true);
    fieldDto5.setRequire(true);
    fieldDto5.setOrderField(5);


    fieldDtoList.add(fieldDto5);

    RemainderFieldUpsertRequest fieldDto6 = new RemainderFieldUpsertRequest();
    fieldDto6.setName("partnerPrice");
    fieldDto6.setLabel("партнерская цена");
    fieldDto6.setVisible(true);
    fieldDto6.setRequire(true);
    fieldDto6.setOrderField(6);


    fieldDtoList.add(fieldDto6);

    RemainderFieldUpsertRequest fieldDto7 = new RemainderFieldUpsertRequest();
    fieldDto7.setName("count");
    fieldDto7.setLabel("количество");
    fieldDto7.setVisible(true);
    fieldDto7.setRequire(true);
    fieldDto7.setOrderField(7);


    fieldDtoList.add(fieldDto7);

    RemainderFieldUpsertRequest fieldDto8 = new RemainderFieldUpsertRequest();
    fieldDto8.setName("isNew");
    fieldDto8.setLabel("новинка");
    fieldDto8.setVisible(true);
    fieldDto8.setRequire(true);
    fieldDto8.setOrderField(8);


    fieldDtoList.add(fieldDto8);

    RemainderFieldUpsertRequest fieldDto9 = new RemainderFieldUpsertRequest();
    fieldDto9.setName("isHit");
    fieldDto9.setLabel("хит");
    fieldDto9.setVisible(true);
    fieldDto9.setRequire(true);
    fieldDto9.setOrderField(9);


    fieldDtoList.add(fieldDto9);

    RemainderFieldUpsertRequest fieldDto10 = new RemainderFieldUpsertRequest();
    fieldDto10.setName("picture");
    fieldDto10.setLabel("изображение");
    fieldDto10.setVisible(true);
    fieldDto10.setRequire(true);
    fieldDto10.setOrderField(10);


    fieldDtoList.add(fieldDto10);

    RemainderFieldUpsertRequest fieldDto11 = new RemainderFieldUpsertRequest();
    fieldDto11.setName("category");
    fieldDto11.setLabel("категория");
    fieldDto11.setVisible(true);
    fieldDto11.setRequire(true);
    fieldDto11.setOrderField(11);


    fieldDtoList.add(fieldDto11);

    RemainderFieldUpsertRequest fieldDto12 = new RemainderFieldUpsertRequest();
    fieldDto12.setName("createdUt");
    fieldDto12.setLabel("создано");
    fieldDto12.setVisible(true);
    fieldDto12.setRequire(true);
    fieldDto12.setOrderField(12);


    fieldDtoList.add(fieldDto12);

    RemainderFieldUpsertRequest fieldDto13 = new RemainderFieldUpsertRequest();
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

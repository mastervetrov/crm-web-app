package crm.service.settings.store.remainder;

import crm.dto.settings.request.store.remainder.DisplayedRemainderFieldUpsertRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DisplayedRemainderFieldService<DisplayedRemainderFieldDto> {

    List<DisplayedRemainderFieldDto> findAll();

    DisplayedRemainderFieldDto findById(Long id);

    DisplayedRemainderFieldDto save(DisplayedRemainderFieldUpsertRequest request);

    DisplayedRemainderFieldDto updateById(Long id, DisplayedRemainderFieldUpsertRequest request);

}

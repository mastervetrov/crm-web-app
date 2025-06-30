package crm.service.settings.store.remainder;

import crm.dto.settings.request.store.remainder.DisplayedRemainderFieldUpsertRequest;
import crm.dto.settings.response.store.remainder.DisplayedRemainderFieldDto;
import crm.mapper.settings.store.remainder.DisplayedRemainderFieldMapper;
import crm.repository.settings.store.remainder.DisplayedRemainderFieldRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DisplayedRemainderFieldServiceImpl implements DisplayedRemainderFieldService<DisplayedRemainderFieldDto>{

    private final DisplayedRemainderFieldRepository repository;
    private final DisplayedRemainderFieldMapper mapper;

    @Override
    public List<DisplayedRemainderFieldDto> findAll() {
        return mapper.repository.findAll();
    }

    @Override
    public DisplayedRemainderFieldDto findById(Long id) {
        return null;
    }

    @Override
    public DisplayedRemainderFieldDto save(DisplayedRemainderFieldUpsertRequest request) {
        return null;
    }

    @Override
    public DisplayedRemainderFieldDto updateById(Long id, DisplayedRemainderFieldUpsertRequest request) {
        return null;
    }
}

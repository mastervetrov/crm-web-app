package crm.service.settings.general;

import crm.dto.settings.general.CurrencyDto;
import crm.mapper.settings.general.CurrencyMapper;
import crm.model.settings.general.Currency;
import crm.repository.settings.general.CurrencyRepository;
import crm.request.settings.general.CurrencyRequest;
import crm.service.CrudService;
import org.springframework.stereotype.Service;

/**
 * Service CRUD for Currency.
 *
 * @see CrudService
 * @see CurrencyRequest
 * @see Currency
 * @see CurrencyDto
 * @see CurrencyMapper
 * @see CurrencyRepository
 */
@Service
public class CurrencyService extends CrudService<
    CurrencyRequest,
    Currency,
    CurrencyDto,
    CurrencyMapper,
    CurrencyRepository
    > {

  /**
   * Constructor super.
   *
   * @param mapper mapper {@link CurrencyMapper}
   * @param repository repository {@link CurrencyRepository}
   */
  public CurrencyService(CurrencyMapper mapper, CurrencyRepository repository) {
    super(mapper, repository);
  }

  @Override
  protected Long getEntityId(Currency entity) {
    return entity.getId();
  }
}

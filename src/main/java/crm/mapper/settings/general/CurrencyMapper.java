package crm.mapper.settings.general;

import crm.dto.settings.general.CurrencyDto;
import crm.mapper.BaseMapper;
import crm.model.settings.general.Currency;
import crm.request.settings.general.CurrencyRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * Mapper for entity {@link Currency}.
 *
 * @see Currency
 * @see CurrencyDto
 * @see CurrencyRequest
 * @see crm.service.settings.general.CurrencyService
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CurrencyMapper extends BaseMapper<CurrencyRequest, Currency, CurrencyDto> {}

package crm.mapper.settings.general;

import crm.dto.settings.general.CompanyDto;
import crm.mapper.BaseMapper;
import crm.model.settings.general.Company;
import crm.request.settings.general.CompanyRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * Mapper for entity {@link Company}.
 *
 * @see Company
 * @see CompanyDto
 * @see CompanyRequest
 * @see crm.service.settings.general.CompanyService
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CompanyMapper extends BaseMapper<CompanyRequest, Company, CompanyDto> {}

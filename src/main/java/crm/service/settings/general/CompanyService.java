package crm.service.settings.general;

import crm.dto.settings.general.CompanyDto;
import crm.mapper.settings.general.CompanyMapper;
import crm.model.settings.general.Company;
import crm.repository.settings.general.CompanyRepository;
import crm.request.settings.general.CompanyRequest;
import crm.service.CrudService;
import org.springframework.stereotype.Service;

/**
 * Company CRUD service.
 *
 * @see CrudService
 * @see CompanyRequest
 * @see Company
 * @see CompanyDto
 * @see CompanyMapper
 * @see CompanyRepository
 */
@Service
public class CompanyService extends CrudService<
    CompanyRequest,
    Company,
    CompanyDto,
    CompanyMapper,
    CompanyRepository
    > {

  /**
   * Constructor super.
   *
   * @param mapper mapper {@link CompanyMapper}
   * @param repository repository {@link CompanyRepository}
   */
  public CompanyService(CompanyMapper mapper, CompanyRepository repository) {
    super(mapper, repository);
  }

  @Override
  protected Long getEntityId(Company entity) {
    return entity.getId();
  }
}

package crm.repository.settings.general;

import crm.model.settings.general.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository Company entity.
 *
 * @see crm.service.settings.general.CompanyService
 * @see Company
 */
@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}

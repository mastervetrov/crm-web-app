package crm.repository.settings.general;

import crm.model.settings.general.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository Currency entity.
 *
 * @see crm.service.settings.general.CurrencyService
 * @see Currency
 */
@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}

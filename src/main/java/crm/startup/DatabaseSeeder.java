package crm.startup;

import org.springframework.stereotype.Component;

/**
 * Interface performs data initialize.
 */
@Component
public interface DatabaseSeeder {
  /**
   * Method initialize.
   */
  void initialize();
}

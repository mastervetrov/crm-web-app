package crm.model.contractor;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
 * Entity private contractor.
 * This is child entity of {@link Contractor}
 */
@Entity
@DiscriminatorValue("PRIVATE")
public class PrivateContractor extends Contractor {
  private String passportSerialNumber;
  private String issuedByWhom;
  private String dateOfIssue;
  private String unitCode;
  private String dateBirthday;
  private String placeOfBirth;
  private String taxpayerIdentificationNumber;
}

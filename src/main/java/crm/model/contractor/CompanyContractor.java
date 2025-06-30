package crm.model.contractor;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("COMPANY")
public class CompanyContractor extends Contractor{

    //ДАННЫЕ ПО КОМПАНИИ
    private String taxpayerIdentificationNumber; //ИНН
    private String theReasonCodeForRegistration; //КПП
    private String director; //директор
    private String contract; //договор

    //БАНКОВСКИЕ РЕКВИЗИТЫ
    private String nameOfTheBank; //наименование банка
    private String bankIdentificationCode; //БИК
    private String swift; //swift
    private String correspondenceAccount; //кор. счет
    private String settlementAccount; //рассчетчный счет

}

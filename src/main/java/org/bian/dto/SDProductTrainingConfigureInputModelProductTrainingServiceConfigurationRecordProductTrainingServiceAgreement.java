package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceAgreement
 */
public class SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceAgreement   {
  private String productTrainingServiceAgreementReference = null;

  private String productTrainingServiceUserReference = null;

  private String productTrainingServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return productTrainingServiceAgreementReference
  **/

  public String getProductTrainingServiceAgreementReference() {
    return productTrainingServiceAgreementReference;
  }

  public void setProductTrainingServiceAgreementReference(String productTrainingServiceAgreementReference) {
    this.productTrainingServiceAgreementReference = productTrainingServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return productTrainingServiceUserReference
  **/

  public String getProductTrainingServiceUserReference() {
    return productTrainingServiceUserReference;
  }

  public void setProductTrainingServiceUserReference(String productTrainingServiceUserReference) {
    this.productTrainingServiceUserReference = productTrainingServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return productTrainingServiceAgreementTermsandConditions
  **/

  public String getProductTrainingServiceAgreementTermsandConditions() {
    return productTrainingServiceAgreementTermsandConditions;
  }

  public void setProductTrainingServiceAgreementTermsandConditions(String productTrainingServiceAgreementTermsandConditions) {
    this.productTrainingServiceAgreementTermsandConditions = productTrainingServiceAgreementTermsandConditions;
  }


}


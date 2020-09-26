package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDProductTrainingRetrieveOutputModelProductTrainingOfferedServiceProductTrainingServiceRecordProductTrainingServicePoliciesandGuidelines
 */
public class SDProductTrainingRetrieveOutputModelProductTrainingOfferedServiceProductTrainingServiceRecordProductTrainingServicePoliciesandGuidelines   {
  private String productTrainingServiceEligibility = null;

  private String productTrainingServiceIntendedUses = null;

  private String productTrainingServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return productTrainingServiceEligibility
  **/

  public String getProductTrainingServiceEligibility() {
    return productTrainingServiceEligibility;
  }

  public void setProductTrainingServiceEligibility(String productTrainingServiceEligibility) {
    this.productTrainingServiceEligibility = productTrainingServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return productTrainingServiceIntendedUses
  **/

  public String getProductTrainingServiceIntendedUses() {
    return productTrainingServiceIntendedUses;
  }

  public void setProductTrainingServiceIntendedUses(String productTrainingServiceIntendedUses) {
    this.productTrainingServiceIntendedUses = productTrainingServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return productTrainingServicePricingandTerms
  **/

  public String getProductTrainingServicePricingandTerms() {
    return productTrainingServicePricingandTerms;
  }

  public void setProductTrainingServicePricingandTerms(String productTrainingServicePricingandTerms) {
    this.productTrainingServicePricingandTerms = productTrainingServicePricingandTerms;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceSubscription
 */
public class SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceSubscription   {
  private String productTrainingServiceSubscriberReference = null;

  private String productTrainingServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return productTrainingServiceSubscriberReference
  **/

  public String getProductTrainingServiceSubscriberReference() {
    return productTrainingServiceSubscriberReference;
  }

  public void setProductTrainingServiceSubscriberReference(String productTrainingServiceSubscriberReference) {
    this.productTrainingServiceSubscriberReference = productTrainingServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return productTrainingServiceSubscriberAccessProfile
  **/

  public String getProductTrainingServiceSubscriberAccessProfile() {
    return productTrainingServiceSubscriberAccessProfile;
  }

  public void setProductTrainingServiceSubscriberAccessProfile(String productTrainingServiceSubscriberAccessProfile) {
    this.productTrainingServiceSubscriberAccessProfile = productTrainingServiceSubscriberAccessProfile;
  }


}


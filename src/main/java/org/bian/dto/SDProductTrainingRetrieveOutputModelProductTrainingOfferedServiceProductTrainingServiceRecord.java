package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductTrainingRetrieveOutputModelProductTrainingOfferedServiceProductTrainingServiceRecordProductTrainingServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDProductTrainingRetrieveOutputModelProductTrainingOfferedServiceProductTrainingServiceRecord
 */
public class SDProductTrainingRetrieveOutputModelProductTrainingOfferedServiceProductTrainingServiceRecord   {
  private String productTrainingServiceType = null;

  private String productTrainingServiceVersion = null;

  private String productTrainingServiceDescription = null;

  private SDProductTrainingRetrieveOutputModelProductTrainingOfferedServiceProductTrainingServiceRecordProductTrainingServicePoliciesandGuidelines productTrainingServicePoliciesandGuidelines = null;

  private String productTrainingServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return productTrainingServiceType
  **/

  public String getProductTrainingServiceType() {
    return productTrainingServiceType;
  }

  public void setProductTrainingServiceType(String productTrainingServiceType) {
    this.productTrainingServiceType = productTrainingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return productTrainingServiceVersion
  **/

  public String getProductTrainingServiceVersion() {
    return productTrainingServiceVersion;
  }

  public void setProductTrainingServiceVersion(String productTrainingServiceVersion) {
    this.productTrainingServiceVersion = productTrainingServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return productTrainingServiceDescription
  **/

  public String getProductTrainingServiceDescription() {
    return productTrainingServiceDescription;
  }

  public void setProductTrainingServiceDescription(String productTrainingServiceDescription) {
    this.productTrainingServiceDescription = productTrainingServiceDescription;
  }


  /**
   * Get productTrainingServicePoliciesandGuidelines
   * @return productTrainingServicePoliciesandGuidelines
  **/

  public SDProductTrainingRetrieveOutputModelProductTrainingOfferedServiceProductTrainingServiceRecordProductTrainingServicePoliciesandGuidelines getProductTrainingServicePoliciesandGuidelines() {
    return productTrainingServicePoliciesandGuidelines;
  }

  public void setProductTrainingServicePoliciesandGuidelines(SDProductTrainingRetrieveOutputModelProductTrainingOfferedServiceProductTrainingServiceRecordProductTrainingServicePoliciesandGuidelines productTrainingServicePoliciesandGuidelines) {
    this.productTrainingServicePoliciesandGuidelines = productTrainingServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return productTrainingServiceSchedule
  **/

  public String getProductTrainingServiceSchedule() {
    return productTrainingServiceSchedule;
  }

  public void setProductTrainingServiceSchedule(String productTrainingServiceSchedule) {
    this.productTrainingServiceSchedule = productTrainingServiceSchedule;
  }


}


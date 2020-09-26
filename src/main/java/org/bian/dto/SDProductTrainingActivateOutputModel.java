package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductTrainingActivateOutputModelProductTrainingServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDProductTrainingActivateOutputModel
 */
public class SDProductTrainingActivateOutputModel   {
  private String productTrainingActivationActionTaskReference = null;

  private Object productTrainingActivationActionTaskRecord = null;

  private String productTrainingServicingSessionReference = null;

  private Object productTrainingServicingSessionRecord = null;

  private SDProductTrainingActivateOutputModelProductTrainingServiceConfigurationRecord productTrainingServiceConfigurationRecord = null;

  private String productTrainingServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return productTrainingActivationActionTaskReference
  **/

  public String getProductTrainingActivationActionTaskReference() {
    return productTrainingActivationActionTaskReference;
  }

  public void setProductTrainingActivationActionTaskReference(String productTrainingActivationActionTaskReference) {
    this.productTrainingActivationActionTaskReference = productTrainingActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return productTrainingActivationActionTaskRecord
  **/

  public Object getProductTrainingActivationActionTaskRecord() {
    return productTrainingActivationActionTaskRecord;
  }

  public void setProductTrainingActivationActionTaskRecord(Object productTrainingActivationActionTaskRecord) {
    this.productTrainingActivationActionTaskRecord = productTrainingActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return productTrainingServicingSessionReference
  **/

  public String getProductTrainingServicingSessionReference() {
    return productTrainingServicingSessionReference;
  }

  public void setProductTrainingServicingSessionReference(String productTrainingServicingSessionReference) {
    this.productTrainingServicingSessionReference = productTrainingServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return productTrainingServicingSessionRecord
  **/

  public Object getProductTrainingServicingSessionRecord() {
    return productTrainingServicingSessionRecord;
  }

  public void setProductTrainingServicingSessionRecord(Object productTrainingServicingSessionRecord) {
    this.productTrainingServicingSessionRecord = productTrainingServicingSessionRecord;
  }


  /**
   * Get productTrainingServiceConfigurationRecord
   * @return productTrainingServiceConfigurationRecord
  **/

  public SDProductTrainingActivateOutputModelProductTrainingServiceConfigurationRecord getProductTrainingServiceConfigurationRecord() {
    return productTrainingServiceConfigurationRecord;
  }

  public void setProductTrainingServiceConfigurationRecord(SDProductTrainingActivateOutputModelProductTrainingServiceConfigurationRecord productTrainingServiceConfigurationRecord) {
    this.productTrainingServiceConfigurationRecord = productTrainingServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return productTrainingServicingSessionStatus
  **/

  public String getProductTrainingServicingSessionStatus() {
    return productTrainingServicingSessionStatus;
  }

  public void setProductTrainingServicingSessionStatus(String productTrainingServicingSessionStatus) {
    this.productTrainingServicingSessionStatus = productTrainingServicingSessionStatus;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductTrainingConfigureOutputModelProductTrainingServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDProductTrainingConfigureOutputModel
 */
public class SDProductTrainingConfigureOutputModel   {
  private String productTrainingConfigurationActionTaskReference = null;

  private Object productTrainingConfigurationActionTaskRecord = null;

  private SDProductTrainingConfigureOutputModelProductTrainingServiceConfigurationRecord productTrainingServiceConfigurationRecord = null;

  private String productTrainingServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return productTrainingConfigurationActionTaskReference
  **/

  public String getProductTrainingConfigurationActionTaskReference() {
    return productTrainingConfigurationActionTaskReference;
  }

  public void setProductTrainingConfigurationActionTaskReference(String productTrainingConfigurationActionTaskReference) {
    this.productTrainingConfigurationActionTaskReference = productTrainingConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return productTrainingConfigurationActionTaskRecord
  **/

  public Object getProductTrainingConfigurationActionTaskRecord() {
    return productTrainingConfigurationActionTaskRecord;
  }

  public void setProductTrainingConfigurationActionTaskRecord(Object productTrainingConfigurationActionTaskRecord) {
    this.productTrainingConfigurationActionTaskRecord = productTrainingConfigurationActionTaskRecord;
  }


  /**
   * Get productTrainingServiceConfigurationRecord
   * @return productTrainingServiceConfigurationRecord
  **/

  public SDProductTrainingConfigureOutputModelProductTrainingServiceConfigurationRecord getProductTrainingServiceConfigurationRecord() {
    return productTrainingServiceConfigurationRecord;
  }

  public void setProductTrainingServiceConfigurationRecord(SDProductTrainingConfigureOutputModelProductTrainingServiceConfigurationRecord productTrainingServiceConfigurationRecord) {
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


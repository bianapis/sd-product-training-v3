package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDProductTrainingConfigureInputModel
 */
public class SDProductTrainingConfigureInputModel   {
  private Object productTrainingConfigurationActionTaskRecord = null;

  private String productTrainingServicingSessionReference = null;

  private String productTrainingServiceReference = null;

  private SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecord productTrainingServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return productTrainingServiceReference
  **/

  public String getProductTrainingServiceReference() {
    return productTrainingServiceReference;
  }

  public void setProductTrainingServiceReference(String productTrainingServiceReference) {
    this.productTrainingServiceReference = productTrainingServiceReference;
  }


  /**
   * Get productTrainingServiceConfigurationRecord
   * @return productTrainingServiceConfigurationRecord
  **/

  public SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecord getProductTrainingServiceConfigurationRecord() {
    return productTrainingServiceConfigurationRecord;
  }

  public void setProductTrainingServiceConfigurationRecord(SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecord productTrainingServiceConfigurationRecord) {
    this.productTrainingServiceConfigurationRecord = productTrainingServiceConfigurationRecord;
  }


}


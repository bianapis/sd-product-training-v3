package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductTrainingActivateInputModelProductTrainingServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDProductTrainingActivateInputModel
 */
public class SDProductTrainingActivateInputModel   {
  private Object productTrainingActivationActionTaskRecord = null;

  private String productTrainingCenterReference = null;

  private String productTrainingServiceReference = null;

  private SDProductTrainingActivateInputModelProductTrainingServiceConfigurationRecord productTrainingServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return productTrainingCenterReference
  **/

  public String getProductTrainingCenterReference() {
    return productTrainingCenterReference;
  }

  public void setProductTrainingCenterReference(String productTrainingCenterReference) {
    this.productTrainingCenterReference = productTrainingCenterReference;
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

  public SDProductTrainingActivateInputModelProductTrainingServiceConfigurationRecord getProductTrainingServiceConfigurationRecord() {
    return productTrainingServiceConfigurationRecord;
  }

  public void setProductTrainingServiceConfigurationRecord(SDProductTrainingActivateInputModelProductTrainingServiceConfigurationRecord productTrainingServiceConfigurationRecord) {
    this.productTrainingServiceConfigurationRecord = productTrainingServiceConfigurationRecord;
  }


}


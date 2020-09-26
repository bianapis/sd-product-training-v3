package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductTrainingActivateInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDProductTrainingActivateInputModelProductTrainingServiceConfigurationRecord
 */
public class SDProductTrainingActivateInputModelProductTrainingServiceConfigurationRecord   {
  private String productTrainingServiceConfigurationSettingReference = null;

  private String productTrainingServiceConfigurationSettingType = null;

  private SDProductTrainingActivateInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceConfigurationSetup productTrainingServiceConfigurationSetup = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return productTrainingServiceConfigurationSettingReference
  **/

  public String getProductTrainingServiceConfigurationSettingReference() {
    return productTrainingServiceConfigurationSettingReference;
  }

  public void setProductTrainingServiceConfigurationSettingReference(String productTrainingServiceConfigurationSettingReference) {
    this.productTrainingServiceConfigurationSettingReference = productTrainingServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return productTrainingServiceConfigurationSettingType
  **/

  public String getProductTrainingServiceConfigurationSettingType() {
    return productTrainingServiceConfigurationSettingType;
  }

  public void setProductTrainingServiceConfigurationSettingType(String productTrainingServiceConfigurationSettingType) {
    this.productTrainingServiceConfigurationSettingType = productTrainingServiceConfigurationSettingType;
  }


  /**
   * Get productTrainingServiceConfigurationSetup
   * @return productTrainingServiceConfigurationSetup
  **/

  public SDProductTrainingActivateInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceConfigurationSetup getProductTrainingServiceConfigurationSetup() {
    return productTrainingServiceConfigurationSetup;
  }

  public void setProductTrainingServiceConfigurationSetup(SDProductTrainingActivateInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceConfigurationSetup productTrainingServiceConfigurationSetup) {
    this.productTrainingServiceConfigurationSetup = productTrainingServiceConfigurationSetup;
  }


}


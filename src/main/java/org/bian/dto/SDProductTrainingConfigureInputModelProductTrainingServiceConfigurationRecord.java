package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceAgreement;
import org.bian.dto.SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceConfigurationSetup;
import org.bian.dto.SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecord
 */
public class SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecord   {
  private String productTrainingServiceConfigurationSettingReference = null;

  private String productTrainingServiceConfigurationSettingType = null;

  private SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceConfigurationSetup productTrainingServiceConfigurationSetup = null;

  private SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceSubscription productTrainingServiceSubscription = null;

  private SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceAgreement productTrainingServiceAgreement = null;


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

  public SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceConfigurationSetup getProductTrainingServiceConfigurationSetup() {
    return productTrainingServiceConfigurationSetup;
  }

  public void setProductTrainingServiceConfigurationSetup(SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceConfigurationSetup productTrainingServiceConfigurationSetup) {
    this.productTrainingServiceConfigurationSetup = productTrainingServiceConfigurationSetup;
  }


  /**
   * Get productTrainingServiceSubscription
   * @return productTrainingServiceSubscription
  **/

  public SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceSubscription getProductTrainingServiceSubscription() {
    return productTrainingServiceSubscription;
  }

  public void setProductTrainingServiceSubscription(SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceSubscription productTrainingServiceSubscription) {
    this.productTrainingServiceSubscription = productTrainingServiceSubscription;
  }


  /**
   * Get productTrainingServiceAgreement
   * @return productTrainingServiceAgreement
  **/

  public SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceAgreement getProductTrainingServiceAgreement() {
    return productTrainingServiceAgreement;
  }

  public void setProductTrainingServiceAgreement(SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceAgreement productTrainingServiceAgreement) {
    this.productTrainingServiceAgreement = productTrainingServiceAgreement;
  }


}


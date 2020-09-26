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
 * SDProductTrainingConfigureOutputModelProductTrainingServiceConfigurationRecord
 */
public class SDProductTrainingConfigureOutputModelProductTrainingServiceConfigurationRecord   {
  private String productTrainingServiceConfigurationSettingDescription = null;

  private SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceConfigurationSetup productTrainingServiceConfigurationSetup = null;

  private SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceSubscription productTrainingServiceSubscription = null;

  private SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceAgreement productTrainingServiceAgreement = null;

  private String productTrainingServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return productTrainingServiceConfigurationSettingDescription
  **/

  public String getProductTrainingServiceConfigurationSettingDescription() {
    return productTrainingServiceConfigurationSettingDescription;
  }

  public void setProductTrainingServiceConfigurationSettingDescription(String productTrainingServiceConfigurationSettingDescription) {
    this.productTrainingServiceConfigurationSettingDescription = productTrainingServiceConfigurationSettingDescription;
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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return productTrainingServiceStatus
  **/

  public String getProductTrainingServiceStatus() {
    return productTrainingServiceStatus;
  }

  public void setProductTrainingServiceStatus(String productTrainingServiceStatus) {
    this.productTrainingServiceStatus = productTrainingServiceStatus;
  }


}


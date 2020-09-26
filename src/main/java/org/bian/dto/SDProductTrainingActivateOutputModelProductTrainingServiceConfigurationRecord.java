package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductTrainingActivateInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceConfigurationSetup;
import org.bian.dto.SDProductTrainingActivateOutputModelProductTrainingServiceConfigurationRecordProductTrainingServiceAgreement;
import org.bian.dto.SDProductTrainingActivateOutputModelProductTrainingServiceConfigurationRecordProductTrainingServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDProductTrainingActivateOutputModelProductTrainingServiceConfigurationRecord
 */
public class SDProductTrainingActivateOutputModelProductTrainingServiceConfigurationRecord   {
  private String productTrainingServiceConfigurationSettingReference = null;

  private String productTrainingServiceConfigurationSettingDescription = null;

  private SDProductTrainingActivateInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceConfigurationSetup productTrainingServiceConfigurationSetup = null;

  private SDProductTrainingActivateOutputModelProductTrainingServiceConfigurationRecordProductTrainingServiceSubscription productTrainingServiceSubscription = null;

  private SDProductTrainingActivateOutputModelProductTrainingServiceConfigurationRecordProductTrainingServiceAgreement productTrainingServiceAgreement = null;

  private String productTrainingServiceStatus = null;


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

  public SDProductTrainingActivateInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceConfigurationSetup getProductTrainingServiceConfigurationSetup() {
    return productTrainingServiceConfigurationSetup;
  }

  public void setProductTrainingServiceConfigurationSetup(SDProductTrainingActivateInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceConfigurationSetup productTrainingServiceConfigurationSetup) {
    this.productTrainingServiceConfigurationSetup = productTrainingServiceConfigurationSetup;
  }


  /**
   * Get productTrainingServiceSubscription
   * @return productTrainingServiceSubscription
  **/

  public SDProductTrainingActivateOutputModelProductTrainingServiceConfigurationRecordProductTrainingServiceSubscription getProductTrainingServiceSubscription() {
    return productTrainingServiceSubscription;
  }

  public void setProductTrainingServiceSubscription(SDProductTrainingActivateOutputModelProductTrainingServiceConfigurationRecordProductTrainingServiceSubscription productTrainingServiceSubscription) {
    this.productTrainingServiceSubscription = productTrainingServiceSubscription;
  }


  /**
   * Get productTrainingServiceAgreement
   * @return productTrainingServiceAgreement
  **/

  public SDProductTrainingActivateOutputModelProductTrainingServiceConfigurationRecordProductTrainingServiceAgreement getProductTrainingServiceAgreement() {
    return productTrainingServiceAgreement;
  }

  public void setProductTrainingServiceAgreement(SDProductTrainingActivateOutputModelProductTrainingServiceConfigurationRecordProductTrainingServiceAgreement productTrainingServiceAgreement) {
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


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceConfigurationSetup
 */
public class SDProductTrainingConfigureInputModelProductTrainingServiceConfigurationRecordProductTrainingServiceConfigurationSetup   {
  private String productTrainingServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  
   * @return productTrainingServiceConfigurationParameter
  **/

  public String getProductTrainingServiceConfigurationParameter() {
    return productTrainingServiceConfigurationParameter;
  }

  public void setProductTrainingServiceConfigurationParameter(String productTrainingServiceConfigurationParameter) {
    this.productTrainingServiceConfigurationParameter = productTrainingServiceConfigurationParameter;
  }


}


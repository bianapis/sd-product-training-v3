package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceDeliveryRetrieveInputModelServiceDeliveryInstanceAnalysis
 */
public class BQServiceDeliveryRetrieveInputModelServiceDeliveryInstanceAnalysis   {
  private String serviceDeliveryInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return serviceDeliveryInstanceAnalysisReference
  **/

  public String getServiceDeliveryInstanceAnalysisReference() {
    return serviceDeliveryInstanceAnalysisReference;
  }

  public void setServiceDeliveryInstanceAnalysisReference(String serviceDeliveryInstanceAnalysisReference) {
    this.serviceDeliveryInstanceAnalysisReference = serviceDeliveryInstanceAnalysisReference;
  }


}


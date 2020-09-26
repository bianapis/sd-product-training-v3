package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceDeliveryRetrieveInputModelServiceDeliveryInstanceReport
 */
public class BQServiceDeliveryRetrieveInputModelServiceDeliveryInstanceReport   {
  private String serviceDeliveryInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return serviceDeliveryInstanceReportReference
  **/

  public String getServiceDeliveryInstanceReportReference() {
    return serviceDeliveryInstanceReportReference;
  }

  public void setServiceDeliveryInstanceReportReference(String serviceDeliveryInstanceReportReference) {
    this.serviceDeliveryInstanceReportReference = serviceDeliveryInstanceReportReference;
  }


}


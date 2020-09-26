package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceDeliveryRetrieveInputModelServiceDeliveryInstanceAnalysis;
import org.bian.dto.BQServiceDeliveryRetrieveInputModelServiceDeliveryInstanceReport;

import javax.validation.Valid;
  
/**
 * BQServiceDeliveryRetrieveInputModel
 */
public class BQServiceDeliveryRetrieveInputModel   {
  private Object serviceDeliveryRetrieveActionTaskRecord = null;

  private String serviceDeliveryRetrieveActionRequest = null;

  private BQServiceDeliveryRetrieveInputModelServiceDeliveryInstanceReport serviceDeliveryInstanceReport = null;

  private BQServiceDeliveryRetrieveInputModelServiceDeliveryInstanceAnalysis serviceDeliveryInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return serviceDeliveryRetrieveActionTaskRecord
  **/

  public Object getServiceDeliveryRetrieveActionTaskRecord() {
    return serviceDeliveryRetrieveActionTaskRecord;
  }

  public void setServiceDeliveryRetrieveActionTaskRecord(Object serviceDeliveryRetrieveActionTaskRecord) {
    this.serviceDeliveryRetrieveActionTaskRecord = serviceDeliveryRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return serviceDeliveryRetrieveActionRequest
  **/

  public String getServiceDeliveryRetrieveActionRequest() {
    return serviceDeliveryRetrieveActionRequest;
  }

  public void setServiceDeliveryRetrieveActionRequest(String serviceDeliveryRetrieveActionRequest) {
    this.serviceDeliveryRetrieveActionRequest = serviceDeliveryRetrieveActionRequest;
  }


  /**
   * Get serviceDeliveryInstanceReport
   * @return serviceDeliveryInstanceReport
  **/

  public BQServiceDeliveryRetrieveInputModelServiceDeliveryInstanceReport getServiceDeliveryInstanceReport() {
    return serviceDeliveryInstanceReport;
  }

  public void setServiceDeliveryInstanceReport(BQServiceDeliveryRetrieveInputModelServiceDeliveryInstanceReport serviceDeliveryInstanceReport) {
    this.serviceDeliveryInstanceReport = serviceDeliveryInstanceReport;
  }


  /**
   * Get serviceDeliveryInstanceAnalysis
   * @return serviceDeliveryInstanceAnalysis
  **/

  public BQServiceDeliveryRetrieveInputModelServiceDeliveryInstanceAnalysis getServiceDeliveryInstanceAnalysis() {
    return serviceDeliveryInstanceAnalysis;
  }

  public void setServiceDeliveryInstanceAnalysis(BQServiceDeliveryRetrieveInputModelServiceDeliveryInstanceAnalysis serviceDeliveryInstanceAnalysis) {
    this.serviceDeliveryInstanceAnalysis = serviceDeliveryInstanceAnalysis;
  }


}


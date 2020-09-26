package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceSchedulingRetrieveInputModelServiceSchedulingInstanceAnalysis;
import org.bian.dto.BQServiceSchedulingRetrieveInputModelServiceSchedulingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQServiceSchedulingRetrieveInputModel
 */
public class BQServiceSchedulingRetrieveInputModel   {
  private Object serviceSchedulingRetrieveActionTaskRecord = null;

  private String serviceSchedulingRetrieveActionRequest = null;

  private BQServiceSchedulingRetrieveInputModelServiceSchedulingInstanceReport serviceSchedulingInstanceReport = null;

  private BQServiceSchedulingRetrieveInputModelServiceSchedulingInstanceAnalysis serviceSchedulingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return serviceSchedulingRetrieveActionTaskRecord
  **/

  public Object getServiceSchedulingRetrieveActionTaskRecord() {
    return serviceSchedulingRetrieveActionTaskRecord;
  }

  public void setServiceSchedulingRetrieveActionTaskRecord(Object serviceSchedulingRetrieveActionTaskRecord) {
    this.serviceSchedulingRetrieveActionTaskRecord = serviceSchedulingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return serviceSchedulingRetrieveActionRequest
  **/

  public String getServiceSchedulingRetrieveActionRequest() {
    return serviceSchedulingRetrieveActionRequest;
  }

  public void setServiceSchedulingRetrieveActionRequest(String serviceSchedulingRetrieveActionRequest) {
    this.serviceSchedulingRetrieveActionRequest = serviceSchedulingRetrieveActionRequest;
  }


  /**
   * Get serviceSchedulingInstanceReport
   * @return serviceSchedulingInstanceReport
  **/

  public BQServiceSchedulingRetrieveInputModelServiceSchedulingInstanceReport getServiceSchedulingInstanceReport() {
    return serviceSchedulingInstanceReport;
  }

  public void setServiceSchedulingInstanceReport(BQServiceSchedulingRetrieveInputModelServiceSchedulingInstanceReport serviceSchedulingInstanceReport) {
    this.serviceSchedulingInstanceReport = serviceSchedulingInstanceReport;
  }


  /**
   * Get serviceSchedulingInstanceAnalysis
   * @return serviceSchedulingInstanceAnalysis
  **/

  public BQServiceSchedulingRetrieveInputModelServiceSchedulingInstanceAnalysis getServiceSchedulingInstanceAnalysis() {
    return serviceSchedulingInstanceAnalysis;
  }

  public void setServiceSchedulingInstanceAnalysis(BQServiceSchedulingRetrieveInputModelServiceSchedulingInstanceAnalysis serviceSchedulingInstanceAnalysis) {
    this.serviceSchedulingInstanceAnalysis = serviceSchedulingInstanceAnalysis;
  }


}


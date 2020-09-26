package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceEvaluationRetrieveInputModelServiceEvaluationInstanceAnalysis;
import org.bian.dto.BQServiceEvaluationRetrieveInputModelServiceEvaluationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQServiceEvaluationRetrieveInputModel
 */
public class BQServiceEvaluationRetrieveInputModel   {
  private Object serviceEvaluationRetrieveActionTaskRecord = null;

  private String serviceEvaluationRetrieveActionRequest = null;

  private BQServiceEvaluationRetrieveInputModelServiceEvaluationInstanceReport serviceEvaluationInstanceReport = null;

  private BQServiceEvaluationRetrieveInputModelServiceEvaluationInstanceAnalysis serviceEvaluationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return serviceEvaluationRetrieveActionTaskRecord
  **/

  public Object getServiceEvaluationRetrieveActionTaskRecord() {
    return serviceEvaluationRetrieveActionTaskRecord;
  }

  public void setServiceEvaluationRetrieveActionTaskRecord(Object serviceEvaluationRetrieveActionTaskRecord) {
    this.serviceEvaluationRetrieveActionTaskRecord = serviceEvaluationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return serviceEvaluationRetrieveActionRequest
  **/

  public String getServiceEvaluationRetrieveActionRequest() {
    return serviceEvaluationRetrieveActionRequest;
  }

  public void setServiceEvaluationRetrieveActionRequest(String serviceEvaluationRetrieveActionRequest) {
    this.serviceEvaluationRetrieveActionRequest = serviceEvaluationRetrieveActionRequest;
  }


  /**
   * Get serviceEvaluationInstanceReport
   * @return serviceEvaluationInstanceReport
  **/

  public BQServiceEvaluationRetrieveInputModelServiceEvaluationInstanceReport getServiceEvaluationInstanceReport() {
    return serviceEvaluationInstanceReport;
  }

  public void setServiceEvaluationInstanceReport(BQServiceEvaluationRetrieveInputModelServiceEvaluationInstanceReport serviceEvaluationInstanceReport) {
    this.serviceEvaluationInstanceReport = serviceEvaluationInstanceReport;
  }


  /**
   * Get serviceEvaluationInstanceAnalysis
   * @return serviceEvaluationInstanceAnalysis
  **/

  public BQServiceEvaluationRetrieveInputModelServiceEvaluationInstanceAnalysis getServiceEvaluationInstanceAnalysis() {
    return serviceEvaluationInstanceAnalysis;
  }

  public void setServiceEvaluationInstanceAnalysis(BQServiceEvaluationRetrieveInputModelServiceEvaluationInstanceAnalysis serviceEvaluationInstanceAnalysis) {
    this.serviceEvaluationInstanceAnalysis = serviceEvaluationInstanceAnalysis;
  }


}


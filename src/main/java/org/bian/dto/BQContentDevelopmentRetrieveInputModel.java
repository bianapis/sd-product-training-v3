package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContentDevelopmentRetrieveInputModelContentDevelopmentInstanceAnalysis;
import org.bian.dto.BQContentDevelopmentRetrieveInputModelContentDevelopmentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQContentDevelopmentRetrieveInputModel
 */
public class BQContentDevelopmentRetrieveInputModel   {
  private Object contentDevelopmentRetrieveActionTaskRecord = null;

  private String contentDevelopmentRetrieveActionRequest = null;

  private BQContentDevelopmentRetrieveInputModelContentDevelopmentInstanceReport contentDevelopmentInstanceReport = null;

  private BQContentDevelopmentRetrieveInputModelContentDevelopmentInstanceAnalysis contentDevelopmentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return contentDevelopmentRetrieveActionTaskRecord
  **/

  public Object getContentDevelopmentRetrieveActionTaskRecord() {
    return contentDevelopmentRetrieveActionTaskRecord;
  }

  public void setContentDevelopmentRetrieveActionTaskRecord(Object contentDevelopmentRetrieveActionTaskRecord) {
    this.contentDevelopmentRetrieveActionTaskRecord = contentDevelopmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return contentDevelopmentRetrieveActionRequest
  **/

  public String getContentDevelopmentRetrieveActionRequest() {
    return contentDevelopmentRetrieveActionRequest;
  }

  public void setContentDevelopmentRetrieveActionRequest(String contentDevelopmentRetrieveActionRequest) {
    this.contentDevelopmentRetrieveActionRequest = contentDevelopmentRetrieveActionRequest;
  }


  /**
   * Get contentDevelopmentInstanceReport
   * @return contentDevelopmentInstanceReport
  **/

  public BQContentDevelopmentRetrieveInputModelContentDevelopmentInstanceReport getContentDevelopmentInstanceReport() {
    return contentDevelopmentInstanceReport;
  }

  public void setContentDevelopmentInstanceReport(BQContentDevelopmentRetrieveInputModelContentDevelopmentInstanceReport contentDevelopmentInstanceReport) {
    this.contentDevelopmentInstanceReport = contentDevelopmentInstanceReport;
  }


  /**
   * Get contentDevelopmentInstanceAnalysis
   * @return contentDevelopmentInstanceAnalysis
  **/

  public BQContentDevelopmentRetrieveInputModelContentDevelopmentInstanceAnalysis getContentDevelopmentInstanceAnalysis() {
    return contentDevelopmentInstanceAnalysis;
  }

  public void setContentDevelopmentInstanceAnalysis(BQContentDevelopmentRetrieveInputModelContentDevelopmentInstanceAnalysis contentDevelopmentInstanceAnalysis) {
    this.contentDevelopmentInstanceAnalysis = contentDevelopmentInstanceAnalysis;
  }


}


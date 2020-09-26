package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQContentDevelopmentRetrieveOutputModelContentDevelopmentInstanceAnalysis
 */
public class BQContentDevelopmentRetrieveOutputModelContentDevelopmentInstanceAnalysis   {
  private Object contentDevelopmentInstanceAnalysisRecord = null;

  private String contentDevelopmentInstanceAnalysisReportType = null;

  private String contentDevelopmentInstanceAnalysisParameters = null;

  private Object contentDevelopmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return contentDevelopmentInstanceAnalysisRecord
  **/

  public Object getContentDevelopmentInstanceAnalysisRecord() {
    return contentDevelopmentInstanceAnalysisRecord;
  }

  public void setContentDevelopmentInstanceAnalysisRecord(Object contentDevelopmentInstanceAnalysisRecord) {
    this.contentDevelopmentInstanceAnalysisRecord = contentDevelopmentInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return contentDevelopmentInstanceAnalysisReportType
  **/

  public String getContentDevelopmentInstanceAnalysisReportType() {
    return contentDevelopmentInstanceAnalysisReportType;
  }

  public void setContentDevelopmentInstanceAnalysisReportType(String contentDevelopmentInstanceAnalysisReportType) {
    this.contentDevelopmentInstanceAnalysisReportType = contentDevelopmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return contentDevelopmentInstanceAnalysisParameters
  **/

  public String getContentDevelopmentInstanceAnalysisParameters() {
    return contentDevelopmentInstanceAnalysisParameters;
  }

  public void setContentDevelopmentInstanceAnalysisParameters(String contentDevelopmentInstanceAnalysisParameters) {
    this.contentDevelopmentInstanceAnalysisParameters = contentDevelopmentInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return contentDevelopmentInstanceAnalysisReport
  **/

  public Object getContentDevelopmentInstanceAnalysisReport() {
    return contentDevelopmentInstanceAnalysisReport;
  }

  public void setContentDevelopmentInstanceAnalysisReport(Object contentDevelopmentInstanceAnalysisReport) {
    this.contentDevelopmentInstanceAnalysisReport = contentDevelopmentInstanceAnalysisReport;
  }


}


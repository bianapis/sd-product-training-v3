package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceEvaluationRetrieveOutputModelServiceEvaluationInstanceAnalysis
 */
public class BQServiceEvaluationRetrieveOutputModelServiceEvaluationInstanceAnalysis   {
  private Object serviceEvaluationInstanceAnalysisRecord = null;

  private String serviceEvaluationInstanceAnalysisReportType = null;

  private String serviceEvaluationInstanceAnalysisParameters = null;

  private Object serviceEvaluationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return serviceEvaluationInstanceAnalysisRecord
  **/

  public Object getServiceEvaluationInstanceAnalysisRecord() {
    return serviceEvaluationInstanceAnalysisRecord;
  }

  public void setServiceEvaluationInstanceAnalysisRecord(Object serviceEvaluationInstanceAnalysisRecord) {
    this.serviceEvaluationInstanceAnalysisRecord = serviceEvaluationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return serviceEvaluationInstanceAnalysisReportType
  **/

  public String getServiceEvaluationInstanceAnalysisReportType() {
    return serviceEvaluationInstanceAnalysisReportType;
  }

  public void setServiceEvaluationInstanceAnalysisReportType(String serviceEvaluationInstanceAnalysisReportType) {
    this.serviceEvaluationInstanceAnalysisReportType = serviceEvaluationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return serviceEvaluationInstanceAnalysisParameters
  **/

  public String getServiceEvaluationInstanceAnalysisParameters() {
    return serviceEvaluationInstanceAnalysisParameters;
  }

  public void setServiceEvaluationInstanceAnalysisParameters(String serviceEvaluationInstanceAnalysisParameters) {
    this.serviceEvaluationInstanceAnalysisParameters = serviceEvaluationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return serviceEvaluationInstanceAnalysisReport
  **/

  public Object getServiceEvaluationInstanceAnalysisReport() {
    return serviceEvaluationInstanceAnalysisReport;
  }

  public void setServiceEvaluationInstanceAnalysisReport(Object serviceEvaluationInstanceAnalysisReport) {
    this.serviceEvaluationInstanceAnalysisReport = serviceEvaluationInstanceAnalysisReport;
  }


}


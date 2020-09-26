package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceSchedulingRetrieveOutputModelServiceSchedulingInstanceAnalysis
 */
public class BQServiceSchedulingRetrieveOutputModelServiceSchedulingInstanceAnalysis   {
  private Object serviceSchedulingInstanceAnalysisRecord = null;

  private String serviceSchedulingInstanceAnalysisReportType = null;

  private String serviceSchedulingInstanceAnalysisParameters = null;

  private Object serviceSchedulingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return serviceSchedulingInstanceAnalysisRecord
  **/

  public Object getServiceSchedulingInstanceAnalysisRecord() {
    return serviceSchedulingInstanceAnalysisRecord;
  }

  public void setServiceSchedulingInstanceAnalysisRecord(Object serviceSchedulingInstanceAnalysisRecord) {
    this.serviceSchedulingInstanceAnalysisRecord = serviceSchedulingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return serviceSchedulingInstanceAnalysisReportType
  **/

  public String getServiceSchedulingInstanceAnalysisReportType() {
    return serviceSchedulingInstanceAnalysisReportType;
  }

  public void setServiceSchedulingInstanceAnalysisReportType(String serviceSchedulingInstanceAnalysisReportType) {
    this.serviceSchedulingInstanceAnalysisReportType = serviceSchedulingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return serviceSchedulingInstanceAnalysisParameters
  **/

  public String getServiceSchedulingInstanceAnalysisParameters() {
    return serviceSchedulingInstanceAnalysisParameters;
  }

  public void setServiceSchedulingInstanceAnalysisParameters(String serviceSchedulingInstanceAnalysisParameters) {
    this.serviceSchedulingInstanceAnalysisParameters = serviceSchedulingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return serviceSchedulingInstanceAnalysisReport
  **/

  public Object getServiceSchedulingInstanceAnalysisReport() {
    return serviceSchedulingInstanceAnalysisReport;
  }

  public void setServiceSchedulingInstanceAnalysisReport(Object serviceSchedulingInstanceAnalysisReport) {
    this.serviceSchedulingInstanceAnalysisReport = serviceSchedulingInstanceAnalysisReport;
  }


}


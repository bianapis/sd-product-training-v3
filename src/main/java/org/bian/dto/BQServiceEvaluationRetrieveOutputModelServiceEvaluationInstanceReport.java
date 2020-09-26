package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceEvaluationRetrieveOutputModelServiceEvaluationInstanceReport
 */
public class BQServiceEvaluationRetrieveOutputModelServiceEvaluationInstanceReport   {
  private Object serviceEvaluationInstanceReportRecord = null;

  private String serviceEvaluationInstanceReportType = null;

  private String serviceEvaluationInstanceReportParameters = null;

  private Object serviceEvaluationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return serviceEvaluationInstanceReportRecord
  **/

  public Object getServiceEvaluationInstanceReportRecord() {
    return serviceEvaluationInstanceReportRecord;
  }

  public void setServiceEvaluationInstanceReportRecord(Object serviceEvaluationInstanceReportRecord) {
    this.serviceEvaluationInstanceReportRecord = serviceEvaluationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return serviceEvaluationInstanceReportType
  **/

  public String getServiceEvaluationInstanceReportType() {
    return serviceEvaluationInstanceReportType;
  }

  public void setServiceEvaluationInstanceReportType(String serviceEvaluationInstanceReportType) {
    this.serviceEvaluationInstanceReportType = serviceEvaluationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return serviceEvaluationInstanceReportParameters
  **/

  public String getServiceEvaluationInstanceReportParameters() {
    return serviceEvaluationInstanceReportParameters;
  }

  public void setServiceEvaluationInstanceReportParameters(String serviceEvaluationInstanceReportParameters) {
    this.serviceEvaluationInstanceReportParameters = serviceEvaluationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return serviceEvaluationInstanceReport
  **/

  public Object getServiceEvaluationInstanceReport() {
    return serviceEvaluationInstanceReport;
  }

  public void setServiceEvaluationInstanceReport(Object serviceEvaluationInstanceReport) {
    this.serviceEvaluationInstanceReport = serviceEvaluationInstanceReport;
  }


}


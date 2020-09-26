package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceSchedulingRetrieveOutputModelServiceSchedulingInstanceReport
 */
public class BQServiceSchedulingRetrieveOutputModelServiceSchedulingInstanceReport   {
  private Object serviceSchedulingInstanceReportRecord = null;

  private String serviceSchedulingInstanceReportType = null;

  private String serviceSchedulingInstanceReportParameters = null;

  private Object serviceSchedulingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return serviceSchedulingInstanceReportRecord
  **/

  public Object getServiceSchedulingInstanceReportRecord() {
    return serviceSchedulingInstanceReportRecord;
  }

  public void setServiceSchedulingInstanceReportRecord(Object serviceSchedulingInstanceReportRecord) {
    this.serviceSchedulingInstanceReportRecord = serviceSchedulingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return serviceSchedulingInstanceReportType
  **/

  public String getServiceSchedulingInstanceReportType() {
    return serviceSchedulingInstanceReportType;
  }

  public void setServiceSchedulingInstanceReportType(String serviceSchedulingInstanceReportType) {
    this.serviceSchedulingInstanceReportType = serviceSchedulingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return serviceSchedulingInstanceReportParameters
  **/

  public String getServiceSchedulingInstanceReportParameters() {
    return serviceSchedulingInstanceReportParameters;
  }

  public void setServiceSchedulingInstanceReportParameters(String serviceSchedulingInstanceReportParameters) {
    this.serviceSchedulingInstanceReportParameters = serviceSchedulingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return serviceSchedulingInstanceReport
  **/

  public Object getServiceSchedulingInstanceReport() {
    return serviceSchedulingInstanceReport;
  }

  public void setServiceSchedulingInstanceReport(Object serviceSchedulingInstanceReport) {
    this.serviceSchedulingInstanceReport = serviceSchedulingInstanceReport;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceDeliveryRetrieveOutputModelServiceDeliveryInstanceAnalysis
 */
public class BQServiceDeliveryRetrieveOutputModelServiceDeliveryInstanceAnalysis   {
  private Object serviceDeliveryInstanceAnalysisRecord = null;

  private String serviceDeliveryInstanceAnalysisReportType = null;

  private String serviceDeliveryInstanceAnalysisParameters = null;

  private Object serviceDeliveryInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return serviceDeliveryInstanceAnalysisRecord
  **/

  public Object getServiceDeliveryInstanceAnalysisRecord() {
    return serviceDeliveryInstanceAnalysisRecord;
  }

  public void setServiceDeliveryInstanceAnalysisRecord(Object serviceDeliveryInstanceAnalysisRecord) {
    this.serviceDeliveryInstanceAnalysisRecord = serviceDeliveryInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return serviceDeliveryInstanceAnalysisReportType
  **/

  public String getServiceDeliveryInstanceAnalysisReportType() {
    return serviceDeliveryInstanceAnalysisReportType;
  }

  public void setServiceDeliveryInstanceAnalysisReportType(String serviceDeliveryInstanceAnalysisReportType) {
    this.serviceDeliveryInstanceAnalysisReportType = serviceDeliveryInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return serviceDeliveryInstanceAnalysisParameters
  **/

  public String getServiceDeliveryInstanceAnalysisParameters() {
    return serviceDeliveryInstanceAnalysisParameters;
  }

  public void setServiceDeliveryInstanceAnalysisParameters(String serviceDeliveryInstanceAnalysisParameters) {
    this.serviceDeliveryInstanceAnalysisParameters = serviceDeliveryInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return serviceDeliveryInstanceAnalysisReport
  **/

  public Object getServiceDeliveryInstanceAnalysisReport() {
    return serviceDeliveryInstanceAnalysisReport;
  }

  public void setServiceDeliveryInstanceAnalysisReport(Object serviceDeliveryInstanceAnalysisReport) {
    this.serviceDeliveryInstanceAnalysisReport = serviceDeliveryInstanceAnalysisReport;
  }


}


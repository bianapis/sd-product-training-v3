package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceDeliveryRetrieveOutputModelServiceDeliveryInstanceReport
 */
public class BQServiceDeliveryRetrieveOutputModelServiceDeliveryInstanceReport   {
  private Object serviceDeliveryInstanceReportRecord = null;

  private String serviceDeliveryInstanceReportType = null;

  private String serviceDeliveryInstanceReportParameters = null;

  private Object serviceDeliveryInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return serviceDeliveryInstanceReportRecord
  **/

  public Object getServiceDeliveryInstanceReportRecord() {
    return serviceDeliveryInstanceReportRecord;
  }

  public void setServiceDeliveryInstanceReportRecord(Object serviceDeliveryInstanceReportRecord) {
    this.serviceDeliveryInstanceReportRecord = serviceDeliveryInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return serviceDeliveryInstanceReportType
  **/

  public String getServiceDeliveryInstanceReportType() {
    return serviceDeliveryInstanceReportType;
  }

  public void setServiceDeliveryInstanceReportType(String serviceDeliveryInstanceReportType) {
    this.serviceDeliveryInstanceReportType = serviceDeliveryInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return serviceDeliveryInstanceReportParameters
  **/

  public String getServiceDeliveryInstanceReportParameters() {
    return serviceDeliveryInstanceReportParameters;
  }

  public void setServiceDeliveryInstanceReportParameters(String serviceDeliveryInstanceReportParameters) {
    this.serviceDeliveryInstanceReportParameters = serviceDeliveryInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return serviceDeliveryInstanceReport
  **/

  public Object getServiceDeliveryInstanceReport() {
    return serviceDeliveryInstanceReport;
  }

  public void setServiceDeliveryInstanceReport(Object serviceDeliveryInstanceReport) {
    this.serviceDeliveryInstanceReport = serviceDeliveryInstanceReport;
  }


}


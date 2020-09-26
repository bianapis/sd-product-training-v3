package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQContentDevelopmentExchangeOutputModel
 */
public class BQContentDevelopmentExchangeOutputModel   {
  private String contentDevelopmentPreconditions = null;

  private String contentDevelopmentBusinessUnitEmployeeReference = null;

  private String contentDevelopmentWorkSchedule = null;

  private String contentDevelopmentPostconditions = null;

  private String contentDevelopmentContentDevelopmentServiceType = null;

  private String contentDevelopmentContentDevelopmentServiceDescription = null;

  private String contentDevelopmentContentDevelopmentServiceInputsandOuputs = null;

  private String contentDevelopmentContentDevelopmentServiceWorkProduct = null;

  private String contentDevelopmentContentDevelopmentServiceName = null;

  private String contentDevelopmentExchangeActionTaskReference = null;

  private Object contentDevelopmentExchangeActionTaskRecord = null;

  private String contentDevelopmentExchangeActionResponse = null;

  private String contentDevelopmentInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the initiation of the workstep 
   * @return contentDevelopmentPreconditions
  **/

  public String getContentDevelopmentPreconditions() {
    return contentDevelopmentPreconditions;
  }

  public void setContentDevelopmentPreconditions(String contentDevelopmentPreconditions) {
    this.contentDevelopmentPreconditions = contentDevelopmentPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for the workstep 
   * @return contentDevelopmentBusinessUnitEmployeeReference
  **/

  public String getContentDevelopmentBusinessUnitEmployeeReference() {
    return contentDevelopmentBusinessUnitEmployeeReference;
  }

  public void setContentDevelopmentBusinessUnitEmployeeReference(String contentDevelopmentBusinessUnitEmployeeReference) {
    this.contentDevelopmentBusinessUnitEmployeeReference = contentDevelopmentBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones making up the workstep 
   * @return contentDevelopmentWorkSchedule
  **/

  public String getContentDevelopmentWorkSchedule() {
    return contentDevelopmentWorkSchedule;
  }

  public void setContentDevelopmentWorkSchedule(String contentDevelopmentWorkSchedule) {
    this.contentDevelopmentWorkSchedule = contentDevelopmentWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and reference to subsequent actions that may be triggered on completion of the workstep 
   * @return contentDevelopmentPostconditions
  **/

  public String getContentDevelopmentPostconditions() {
    return contentDevelopmentPostconditions;
  }

  public void setContentDevelopmentPostconditions(String contentDevelopmentPostconditions) {
    this.contentDevelopmentPostconditions = contentDevelopmentPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return contentDevelopmentContentDevelopmentServiceType
  **/

  public String getContentDevelopmentContentDevelopmentServiceType() {
    return contentDevelopmentContentDevelopmentServiceType;
  }

  public void setContentDevelopmentContentDevelopmentServiceType(String contentDevelopmentContentDevelopmentServiceType) {
    this.contentDevelopmentContentDevelopmentServiceType = contentDevelopmentContentDevelopmentServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return contentDevelopmentContentDevelopmentServiceDescription
  **/

  public String getContentDevelopmentContentDevelopmentServiceDescription() {
    return contentDevelopmentContentDevelopmentServiceDescription;
  }

  public void setContentDevelopmentContentDevelopmentServiceDescription(String contentDevelopmentContentDevelopmentServiceDescription) {
    this.contentDevelopmentContentDevelopmentServiceDescription = contentDevelopmentContentDevelopmentServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return contentDevelopmentContentDevelopmentServiceInputsandOuputs
  **/

  public String getContentDevelopmentContentDevelopmentServiceInputsandOuputs() {
    return contentDevelopmentContentDevelopmentServiceInputsandOuputs;
  }

  public void setContentDevelopmentContentDevelopmentServiceInputsandOuputs(String contentDevelopmentContentDevelopmentServiceInputsandOuputs) {
    this.contentDevelopmentContentDevelopmentServiceInputsandOuputs = contentDevelopmentContentDevelopmentServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return contentDevelopmentContentDevelopmentServiceWorkProduct
  **/

  public String getContentDevelopmentContentDevelopmentServiceWorkProduct() {
    return contentDevelopmentContentDevelopmentServiceWorkProduct;
  }

  public void setContentDevelopmentContentDevelopmentServiceWorkProduct(String contentDevelopmentContentDevelopmentServiceWorkProduct) {
    this.contentDevelopmentContentDevelopmentServiceWorkProduct = contentDevelopmentContentDevelopmentServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return contentDevelopmentContentDevelopmentServiceName
  **/

  public String getContentDevelopmentContentDevelopmentServiceName() {
    return contentDevelopmentContentDevelopmentServiceName;
  }

  public void setContentDevelopmentContentDevelopmentServiceName(String contentDevelopmentContentDevelopmentServiceName) {
    this.contentDevelopmentContentDevelopmentServiceName = contentDevelopmentContentDevelopmentServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Content Development instance exchange service call 
   * @return contentDevelopmentExchangeActionTaskReference
  **/

  public String getContentDevelopmentExchangeActionTaskReference() {
    return contentDevelopmentExchangeActionTaskReference;
  }

  public void setContentDevelopmentExchangeActionTaskReference(String contentDevelopmentExchangeActionTaskReference) {
    this.contentDevelopmentExchangeActionTaskReference = contentDevelopmentExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return contentDevelopmentExchangeActionTaskRecord
  **/

  public Object getContentDevelopmentExchangeActionTaskRecord() {
    return contentDevelopmentExchangeActionTaskRecord;
  }

  public void setContentDevelopmentExchangeActionTaskRecord(Object contentDevelopmentExchangeActionTaskRecord) {
    this.contentDevelopmentExchangeActionTaskRecord = contentDevelopmentExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return contentDevelopmentExchangeActionResponse
  **/

  public String getContentDevelopmentExchangeActionResponse() {
    return contentDevelopmentExchangeActionResponse;
  }

  public void setContentDevelopmentExchangeActionResponse(String contentDevelopmentExchangeActionResponse) {
    this.contentDevelopmentExchangeActionResponse = contentDevelopmentExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Content Development instance (e.g. accepted, rejected, verified) 
   * @return contentDevelopmentInstanceStatus
  **/

  public String getContentDevelopmentInstanceStatus() {
    return contentDevelopmentInstanceStatus;
  }

  public void setContentDevelopmentInstanceStatus(String contentDevelopmentInstanceStatus) {
    this.contentDevelopmentInstanceStatus = contentDevelopmentInstanceStatus;
  }


}


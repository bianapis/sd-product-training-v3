package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceDeliveryExchangeOutputModel
 */
public class BQServiceDeliveryExchangeOutputModel   {
  private String serviceDeliveryPreconditions = null;

  private String serviceDeliveryBusinessUnitEmployeeReference = null;

  private String serviceDeliveryWorkSchedule = null;

  private String serviceDeliveryPostconditions = null;

  private String serviceDeliveryServiceDeliveryServiceType = null;

  private String serviceDeliveryServiceDeliveryServiceDescription = null;

  private String serviceDeliveryServiceDeliveryServiceInputsandOuputs = null;

  private String serviceDeliveryServiceDeliveryServiceWorkProduct = null;

  private String serviceDeliveryServiceDeliveryServiceName = null;

  private String serviceDeliveryExchangeActionTaskReference = null;

  private Object serviceDeliveryExchangeActionTaskRecord = null;

  private String serviceDeliveryExchangeActionResponse = null;

  private String serviceDeliveryInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the initiation of the workstep 
   * @return serviceDeliveryPreconditions
  **/

  public String getServiceDeliveryPreconditions() {
    return serviceDeliveryPreconditions;
  }

  public void setServiceDeliveryPreconditions(String serviceDeliveryPreconditions) {
    this.serviceDeliveryPreconditions = serviceDeliveryPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for the workstep 
   * @return serviceDeliveryBusinessUnitEmployeeReference
  **/

  public String getServiceDeliveryBusinessUnitEmployeeReference() {
    return serviceDeliveryBusinessUnitEmployeeReference;
  }

  public void setServiceDeliveryBusinessUnitEmployeeReference(String serviceDeliveryBusinessUnitEmployeeReference) {
    this.serviceDeliveryBusinessUnitEmployeeReference = serviceDeliveryBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones making up the workstep 
   * @return serviceDeliveryWorkSchedule
  **/

  public String getServiceDeliveryWorkSchedule() {
    return serviceDeliveryWorkSchedule;
  }

  public void setServiceDeliveryWorkSchedule(String serviceDeliveryWorkSchedule) {
    this.serviceDeliveryWorkSchedule = serviceDeliveryWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and reference to subsequent actions that may be triggered on completion of the workstep 
   * @return serviceDeliveryPostconditions
  **/

  public String getServiceDeliveryPostconditions() {
    return serviceDeliveryPostconditions;
  }

  public void setServiceDeliveryPostconditions(String serviceDeliveryPostconditions) {
    this.serviceDeliveryPostconditions = serviceDeliveryPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return serviceDeliveryServiceDeliveryServiceType
  **/

  public String getServiceDeliveryServiceDeliveryServiceType() {
    return serviceDeliveryServiceDeliveryServiceType;
  }

  public void setServiceDeliveryServiceDeliveryServiceType(String serviceDeliveryServiceDeliveryServiceType) {
    this.serviceDeliveryServiceDeliveryServiceType = serviceDeliveryServiceDeliveryServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return serviceDeliveryServiceDeliveryServiceDescription
  **/

  public String getServiceDeliveryServiceDeliveryServiceDescription() {
    return serviceDeliveryServiceDeliveryServiceDescription;
  }

  public void setServiceDeliveryServiceDeliveryServiceDescription(String serviceDeliveryServiceDeliveryServiceDescription) {
    this.serviceDeliveryServiceDeliveryServiceDescription = serviceDeliveryServiceDeliveryServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return serviceDeliveryServiceDeliveryServiceInputsandOuputs
  **/

  public String getServiceDeliveryServiceDeliveryServiceInputsandOuputs() {
    return serviceDeliveryServiceDeliveryServiceInputsandOuputs;
  }

  public void setServiceDeliveryServiceDeliveryServiceInputsandOuputs(String serviceDeliveryServiceDeliveryServiceInputsandOuputs) {
    this.serviceDeliveryServiceDeliveryServiceInputsandOuputs = serviceDeliveryServiceDeliveryServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return serviceDeliveryServiceDeliveryServiceWorkProduct
  **/

  public String getServiceDeliveryServiceDeliveryServiceWorkProduct() {
    return serviceDeliveryServiceDeliveryServiceWorkProduct;
  }

  public void setServiceDeliveryServiceDeliveryServiceWorkProduct(String serviceDeliveryServiceDeliveryServiceWorkProduct) {
    this.serviceDeliveryServiceDeliveryServiceWorkProduct = serviceDeliveryServiceDeliveryServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return serviceDeliveryServiceDeliveryServiceName
  **/

  public String getServiceDeliveryServiceDeliveryServiceName() {
    return serviceDeliveryServiceDeliveryServiceName;
  }

  public void setServiceDeliveryServiceDeliveryServiceName(String serviceDeliveryServiceDeliveryServiceName) {
    this.serviceDeliveryServiceDeliveryServiceName = serviceDeliveryServiceDeliveryServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Service Delivery instance exchange service call 
   * @return serviceDeliveryExchangeActionTaskReference
  **/

  public String getServiceDeliveryExchangeActionTaskReference() {
    return serviceDeliveryExchangeActionTaskReference;
  }

  public void setServiceDeliveryExchangeActionTaskReference(String serviceDeliveryExchangeActionTaskReference) {
    this.serviceDeliveryExchangeActionTaskReference = serviceDeliveryExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return serviceDeliveryExchangeActionTaskRecord
  **/

  public Object getServiceDeliveryExchangeActionTaskRecord() {
    return serviceDeliveryExchangeActionTaskRecord;
  }

  public void setServiceDeliveryExchangeActionTaskRecord(Object serviceDeliveryExchangeActionTaskRecord) {
    this.serviceDeliveryExchangeActionTaskRecord = serviceDeliveryExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return serviceDeliveryExchangeActionResponse
  **/

  public String getServiceDeliveryExchangeActionResponse() {
    return serviceDeliveryExchangeActionResponse;
  }

  public void setServiceDeliveryExchangeActionResponse(String serviceDeliveryExchangeActionResponse) {
    this.serviceDeliveryExchangeActionResponse = serviceDeliveryExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Service Delivery instance (e.g. accepted, rejected, verified) 
   * @return serviceDeliveryInstanceStatus
  **/

  public String getServiceDeliveryInstanceStatus() {
    return serviceDeliveryInstanceStatus;
  }

  public void setServiceDeliveryInstanceStatus(String serviceDeliveryInstanceStatus) {
    this.serviceDeliveryInstanceStatus = serviceDeliveryInstanceStatus;
  }


}


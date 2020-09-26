package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceEvaluationUpdateOutputModel
 */
public class BQServiceEvaluationUpdateOutputModel   {
  private String serviceEvaluationPreconditions = null;

  private String serviceEvaluationBusinessUnitEmployeeReference = null;

  private String serviceEvaluationWorkSchedule = null;

  private String serviceEvaluationPostconditions = null;

  private String serviceEvaluationServiceEvaluationServiceType = null;

  private String serviceEvaluationServiceEvaluationServiceDescription = null;

  private String serviceEvaluationServiceEvaluationServiceInputsandOuputs = null;

  private String serviceEvaluationServiceEvaluationServiceWorkProduct = null;

  private String serviceEvaluationUpdateActionTaskReference = null;

  private Object serviceEvaluationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the initiation of the workstep 
   * @return serviceEvaluationPreconditions
  **/

  public String getServiceEvaluationPreconditions() {
    return serviceEvaluationPreconditions;
  }

  public void setServiceEvaluationPreconditions(String serviceEvaluationPreconditions) {
    this.serviceEvaluationPreconditions = serviceEvaluationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for the workstep 
   * @return serviceEvaluationBusinessUnitEmployeeReference
  **/

  public String getServiceEvaluationBusinessUnitEmployeeReference() {
    return serviceEvaluationBusinessUnitEmployeeReference;
  }

  public void setServiceEvaluationBusinessUnitEmployeeReference(String serviceEvaluationBusinessUnitEmployeeReference) {
    this.serviceEvaluationBusinessUnitEmployeeReference = serviceEvaluationBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones making up the workstep 
   * @return serviceEvaluationWorkSchedule
  **/

  public String getServiceEvaluationWorkSchedule() {
    return serviceEvaluationWorkSchedule;
  }

  public void setServiceEvaluationWorkSchedule(String serviceEvaluationWorkSchedule) {
    this.serviceEvaluationWorkSchedule = serviceEvaluationWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and reference to subsequent actions that may be triggered on completion of the workstep 
   * @return serviceEvaluationPostconditions
  **/

  public String getServiceEvaluationPostconditions() {
    return serviceEvaluationPostconditions;
  }

  public void setServiceEvaluationPostconditions(String serviceEvaluationPostconditions) {
    this.serviceEvaluationPostconditions = serviceEvaluationPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return serviceEvaluationServiceEvaluationServiceType
  **/

  public String getServiceEvaluationServiceEvaluationServiceType() {
    return serviceEvaluationServiceEvaluationServiceType;
  }

  public void setServiceEvaluationServiceEvaluationServiceType(String serviceEvaluationServiceEvaluationServiceType) {
    this.serviceEvaluationServiceEvaluationServiceType = serviceEvaluationServiceEvaluationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return serviceEvaluationServiceEvaluationServiceDescription
  **/

  public String getServiceEvaluationServiceEvaluationServiceDescription() {
    return serviceEvaluationServiceEvaluationServiceDescription;
  }

  public void setServiceEvaluationServiceEvaluationServiceDescription(String serviceEvaluationServiceEvaluationServiceDescription) {
    this.serviceEvaluationServiceEvaluationServiceDescription = serviceEvaluationServiceEvaluationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return serviceEvaluationServiceEvaluationServiceInputsandOuputs
  **/

  public String getServiceEvaluationServiceEvaluationServiceInputsandOuputs() {
    return serviceEvaluationServiceEvaluationServiceInputsandOuputs;
  }

  public void setServiceEvaluationServiceEvaluationServiceInputsandOuputs(String serviceEvaluationServiceEvaluationServiceInputsandOuputs) {
    this.serviceEvaluationServiceEvaluationServiceInputsandOuputs = serviceEvaluationServiceEvaluationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return serviceEvaluationServiceEvaluationServiceWorkProduct
  **/

  public String getServiceEvaluationServiceEvaluationServiceWorkProduct() {
    return serviceEvaluationServiceEvaluationServiceWorkProduct;
  }

  public void setServiceEvaluationServiceEvaluationServiceWorkProduct(String serviceEvaluationServiceEvaluationServiceWorkProduct) {
    this.serviceEvaluationServiceEvaluationServiceWorkProduct = serviceEvaluationServiceEvaluationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return serviceEvaluationUpdateActionTaskReference
  **/

  public String getServiceEvaluationUpdateActionTaskReference() {
    return serviceEvaluationUpdateActionTaskReference;
  }

  public void setServiceEvaluationUpdateActionTaskReference(String serviceEvaluationUpdateActionTaskReference) {
    this.serviceEvaluationUpdateActionTaskReference = serviceEvaluationUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return serviceEvaluationUpdateActionTaskRecord
  **/

  public Object getServiceEvaluationUpdateActionTaskRecord() {
    return serviceEvaluationUpdateActionTaskRecord;
  }

  public void setServiceEvaluationUpdateActionTaskRecord(Object serviceEvaluationUpdateActionTaskRecord) {
    this.serviceEvaluationUpdateActionTaskRecord = serviceEvaluationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}


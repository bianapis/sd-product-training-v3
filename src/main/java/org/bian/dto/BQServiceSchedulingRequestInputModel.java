package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductTrainingProcedureRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQServiceSchedulingRequestInputModel
 */
public class BQServiceSchedulingRequestInputModel   {
  private String productTrainingProcedureInstanceReference = null;

  private String serviceSchedulingInstanceReference = null;

  private String serviceSchedulingPreconditions = null;

  private String serviceSchedulingBusinessUnitEmployeeReference = null;

  private String serviceSchedulingWorkSchedule = null;

  private String serviceSchedulingPostconditions = null;

  private String serviceSchedulingServiceSchedulingServiceType = null;

  private String serviceSchedulingServiceSchedulingServiceDescription = null;

  private String serviceSchedulingServiceSchedulingServiceInputsandOuputs = null;

  private String serviceSchedulingServiceSchedulingServiceWorkProduct = null;

  private String serviceSchedulingServiceSchedulingServiceName = null;

  private Object serviceSchedulingRequestActionTaskRecord = null;

  private CRProductTrainingProcedureRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Product Training Procedure instance 
   * @return productTrainingProcedureInstanceReference
  **/

  public String getProductTrainingProcedureInstanceReference() {
    return productTrainingProcedureInstanceReference;
  }

  public void setProductTrainingProcedureInstanceReference(String productTrainingProcedureInstanceReference) {
    this.productTrainingProcedureInstanceReference = productTrainingProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Service Scheduling instance 
   * @return serviceSchedulingInstanceReference
  **/

  public String getServiceSchedulingInstanceReference() {
    return serviceSchedulingInstanceReference;
  }

  public void setServiceSchedulingInstanceReference(String serviceSchedulingInstanceReference) {
    this.serviceSchedulingInstanceReference = serviceSchedulingInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation and or tasks that need to be completed prior to the initiation of the workstep 
   * @return serviceSchedulingPreconditions
  **/

  public String getServiceSchedulingPreconditions() {
    return serviceSchedulingPreconditions;
  }

  public void setServiceSchedulingPreconditions(String serviceSchedulingPreconditions) {
    this.serviceSchedulingPreconditions = serviceSchedulingPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for the workstep 
   * @return serviceSchedulingBusinessUnitEmployeeReference
  **/

  public String getServiceSchedulingBusinessUnitEmployeeReference() {
    return serviceSchedulingBusinessUnitEmployeeReference;
  }

  public void setServiceSchedulingBusinessUnitEmployeeReference(String serviceSchedulingBusinessUnitEmployeeReference) {
    this.serviceSchedulingBusinessUnitEmployeeReference = serviceSchedulingBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones making up the workstep 
   * @return serviceSchedulingWorkSchedule
  **/

  public String getServiceSchedulingWorkSchedule() {
    return serviceSchedulingWorkSchedule;
  }

  public void setServiceSchedulingWorkSchedule(String serviceSchedulingWorkSchedule) {
    this.serviceSchedulingWorkSchedule = serviceSchedulingWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and reference to subsequent actions that may be triggered on completion of the workstep 
   * @return serviceSchedulingPostconditions
  **/

  public String getServiceSchedulingPostconditions() {
    return serviceSchedulingPostconditions;
  }

  public void setServiceSchedulingPostconditions(String serviceSchedulingPostconditions) {
    this.serviceSchedulingPostconditions = serviceSchedulingPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return serviceSchedulingServiceSchedulingServiceType
  **/

  public String getServiceSchedulingServiceSchedulingServiceType() {
    return serviceSchedulingServiceSchedulingServiceType;
  }

  public void setServiceSchedulingServiceSchedulingServiceType(String serviceSchedulingServiceSchedulingServiceType) {
    this.serviceSchedulingServiceSchedulingServiceType = serviceSchedulingServiceSchedulingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return serviceSchedulingServiceSchedulingServiceDescription
  **/

  public String getServiceSchedulingServiceSchedulingServiceDescription() {
    return serviceSchedulingServiceSchedulingServiceDescription;
  }

  public void setServiceSchedulingServiceSchedulingServiceDescription(String serviceSchedulingServiceSchedulingServiceDescription) {
    this.serviceSchedulingServiceSchedulingServiceDescription = serviceSchedulingServiceSchedulingServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return serviceSchedulingServiceSchedulingServiceInputsandOuputs
  **/

  public String getServiceSchedulingServiceSchedulingServiceInputsandOuputs() {
    return serviceSchedulingServiceSchedulingServiceInputsandOuputs;
  }

  public void setServiceSchedulingServiceSchedulingServiceInputsandOuputs(String serviceSchedulingServiceSchedulingServiceInputsandOuputs) {
    this.serviceSchedulingServiceSchedulingServiceInputsandOuputs = serviceSchedulingServiceSchedulingServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return serviceSchedulingServiceSchedulingServiceWorkProduct
  **/

  public String getServiceSchedulingServiceSchedulingServiceWorkProduct() {
    return serviceSchedulingServiceSchedulingServiceWorkProduct;
  }

  public void setServiceSchedulingServiceSchedulingServiceWorkProduct(String serviceSchedulingServiceSchedulingServiceWorkProduct) {
    this.serviceSchedulingServiceSchedulingServiceWorkProduct = serviceSchedulingServiceSchedulingServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return serviceSchedulingServiceSchedulingServiceName
  **/

  public String getServiceSchedulingServiceSchedulingServiceName() {
    return serviceSchedulingServiceSchedulingServiceName;
  }

  public void setServiceSchedulingServiceSchedulingServiceName(String serviceSchedulingServiceSchedulingServiceName) {
    this.serviceSchedulingServiceSchedulingServiceName = serviceSchedulingServiceSchedulingServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return serviceSchedulingRequestActionTaskRecord
  **/

  public Object getServiceSchedulingRequestActionTaskRecord() {
    return serviceSchedulingRequestActionTaskRecord;
  }

  public void setServiceSchedulingRequestActionTaskRecord(Object serviceSchedulingRequestActionTaskRecord) {
    this.serviceSchedulingRequestActionTaskRecord = serviceSchedulingRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRProductTrainingProcedureRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRProductTrainingProcedureRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}


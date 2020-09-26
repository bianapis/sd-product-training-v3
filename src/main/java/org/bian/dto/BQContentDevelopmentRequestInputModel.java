package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductTrainingProcedureRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQContentDevelopmentRequestInputModel
 */
public class BQContentDevelopmentRequestInputModel   {
  private String productTrainingProcedureInstanceReference = null;

  private String contentDevelopmentInstanceReference = null;

  private String contentDevelopmentPreconditions = null;

  private String contentDevelopmentBusinessUnitEmployeeReference = null;

  private String contentDevelopmentWorkSchedule = null;

  private String contentDevelopmentPostconditions = null;

  private String contentDevelopmentContentDevelopmentServiceType = null;

  private String contentDevelopmentContentDevelopmentServiceDescription = null;

  private String contentDevelopmentContentDevelopmentServiceInputsandOuputs = null;

  private String contentDevelopmentContentDevelopmentServiceWorkProduct = null;

  private String contentDevelopmentContentDevelopmentServiceName = null;

  private Object contentDevelopmentRequestActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Content Development instance 
   * @return contentDevelopmentInstanceReference
  **/

  public String getContentDevelopmentInstanceReference() {
    return contentDevelopmentInstanceReference;
  }

  public void setContentDevelopmentInstanceReference(String contentDevelopmentInstanceReference) {
    this.contentDevelopmentInstanceReference = contentDevelopmentInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return contentDevelopmentRequestActionTaskRecord
  **/

  public Object getContentDevelopmentRequestActionTaskRecord() {
    return contentDevelopmentRequestActionTaskRecord;
  }

  public void setContentDevelopmentRequestActionTaskRecord(Object contentDevelopmentRequestActionTaskRecord) {
    this.contentDevelopmentRequestActionTaskRecord = contentDevelopmentRequestActionTaskRecord;
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


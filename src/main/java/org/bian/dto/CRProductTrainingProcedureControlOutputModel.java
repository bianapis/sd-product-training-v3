package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductTrainingProcedureControlOutputModel
 */
public class CRProductTrainingProcedureControlOutputModel   {
  private String productTrainingProcedureParameterType = null;

  private String productTrainingProcedureSelectedOption = null;

  private String productTrainingProcedureRequest = null;

  private String productTrainingProcedureSchedule = null;

  private String productTrainingProcedureStatus = null;

  private String productTrainingProcedureControlActionTaskReference = null;

  private Object productTrainingProcedureControlActionTaskRecord = null;

  private String productTrainingProcedureControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between Procedures according to the type of business services and/or type of concern defined within Product Training Procedure 
   * @return productTrainingProcedureParameterType
  **/

  public String getProductTrainingProcedureParameterType() {
    return productTrainingProcedureParameterType;
  }

  public void setProductTrainingProcedureParameterType(String productTrainingProcedureParameterType) {
    this.productTrainingProcedureParameterType = productTrainingProcedureParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of Product Training Procedure 
   * @return productTrainingProcedureSelectedOption
  **/

  public String getProductTrainingProcedureSelectedOption() {
    return productTrainingProcedureSelectedOption;
  }

  public void setProductTrainingProcedureSelectedOption(String productTrainingProcedureSelectedOption) {
    this.productTrainingProcedureSelectedOption = productTrainingProcedureSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Request to process ProductTraining 
   * @return productTrainingProcedureRequest
  **/

  public String getProductTrainingProcedureRequest() {
    return productTrainingProcedureRequest;
  }

  public void setProductTrainingProcedureRequest(String productTrainingProcedureRequest) {
    this.productTrainingProcedureRequest = productTrainingProcedureRequest;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timetable to process ProductTraining 
   * @return productTrainingProcedureSchedule
  **/

  public String getProductTrainingProcedureSchedule() {
    return productTrainingProcedureSchedule;
  }

  public void setProductTrainingProcedureSchedule(String productTrainingProcedureSchedule) {
    this.productTrainingProcedureSchedule = productTrainingProcedureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Product Training Procedure 
   * @return productTrainingProcedureStatus
  **/

  public String getProductTrainingProcedureStatus() {
    return productTrainingProcedureStatus;
  }

  public void setProductTrainingProcedureStatus(String productTrainingProcedureStatus) {
    this.productTrainingProcedureStatus = productTrainingProcedureStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Training Procedure instance control processing service call 
   * @return productTrainingProcedureControlActionTaskReference
  **/

  public String getProductTrainingProcedureControlActionTaskReference() {
    return productTrainingProcedureControlActionTaskReference;
  }

  public void setProductTrainingProcedureControlActionTaskReference(String productTrainingProcedureControlActionTaskReference) {
    this.productTrainingProcedureControlActionTaskReference = productTrainingProcedureControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return productTrainingProcedureControlActionTaskRecord
  **/

  public Object getProductTrainingProcedureControlActionTaskRecord() {
    return productTrainingProcedureControlActionTaskRecord;
  }

  public void setProductTrainingProcedureControlActionTaskRecord(Object productTrainingProcedureControlActionTaskRecord) {
    this.productTrainingProcedureControlActionTaskRecord = productTrainingProcedureControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return productTrainingProcedureControlActionResponse
  **/

  public String getProductTrainingProcedureControlActionResponse() {
    return productTrainingProcedureControlActionResponse;
  }

  public void setProductTrainingProcedureControlActionResponse(String productTrainingProcedureControlActionResponse) {
    this.productTrainingProcedureControlActionResponse = productTrainingProcedureControlActionResponse;
  }


}


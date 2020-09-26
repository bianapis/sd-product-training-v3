package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductTrainingProcedureRetrieveOutputModelProductTrainingProcedureInstanceAnalysis;
import org.bian.dto.CRProductTrainingProcedureRetrieveOutputModelProductTrainingProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProductTrainingProcedureRetrieveOutputModel
 */
public class CRProductTrainingProcedureRetrieveOutputModel   {
  private String productTrainingProcedureParameterType = null;

  private String productTrainingProcedureSelectedOption = null;

  private String productTrainingProcedureRequest = null;

  private String productTrainingProcedureSchedule = null;

  private String productTrainingProcedureStatus = null;

  private String productTrainingProcedureReference = null;

  private String productTrainingProcedureBusinessUnitReference = null;

  private String productTrainingProcedureServiceProviderReference = null;

  private String productTrainingProcedureFinancialFacilityReference = null;

  private String productTrainingProcedureEmployeeReference = null;

  private String productTrainingProcedureCustomerReference = null;

  private String productTrainingProcedureType = null;

  private String productTrainingProcedureServiceProviderSchedule = null;

  private String productTrainingProcedureServiceType = null;

  private String productTrainingProcedureProductandServiceType = null;

  private String productTrainingProcedureProductandServiceInstance = null;

  private String productTrainingProcedureTransactionType = null;

  private String productTrainingProcedureFinancialTransactionArrangement = null;

  private String productTrainingProcedureCustomerAgreementReference = null;

  private String productTrainingProcedureRetrieveActionTaskReference = null;

  private Object productTrainingProcedureRetrieveActionTaskRecord = null;

  private String productTrainingProcedureRetrieveActionResponse = null;

  private CRProductTrainingProcedureRetrieveOutputModelProductTrainingProcedureInstanceReportRecord productTrainingProcedureInstanceReportRecord = null;

  private CRProductTrainingProcedureRetrieveOutputModelProductTrainingProcedureInstanceAnalysis productTrainingProcedureInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who is involved in Product Training Procedure 
   * @return productTrainingProcedureReference
  **/

  public String getProductTrainingProcedureReference() {
    return productTrainingProcedureReference;
  }

  public void setProductTrainingProcedureReference(String productTrainingProcedureReference) {
    this.productTrainingProcedureReference = productTrainingProcedureReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the business unit which is involved in Product Training Procedure 
   * @return productTrainingProcedureBusinessUnitReference
  **/

  public String getProductTrainingProcedureBusinessUnitReference() {
    return productTrainingProcedureBusinessUnitReference;
  }

  public void setProductTrainingProcedureBusinessUnitReference(String productTrainingProcedureBusinessUnitReference) {
    this.productTrainingProcedureBusinessUnitReference = productTrainingProcedureBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who is the service provider of Product Training Procedure 
   * @return productTrainingProcedureServiceProviderReference
  **/

  public String getProductTrainingProcedureServiceProviderReference() {
    return productTrainingProcedureServiceProviderReference;
  }

  public void setProductTrainingProcedureServiceProviderReference(String productTrainingProcedureServiceProviderReference) {
    this.productTrainingProcedureServiceProviderReference = productTrainingProcedureServiceProviderReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Financial Facility related to Product Training Procedure  
   * @return productTrainingProcedureFinancialFacilityReference
  **/

  public String getProductTrainingProcedureFinancialFacilityReference() {
    return productTrainingProcedureFinancialFacilityReference;
  }

  public void setProductTrainingProcedureFinancialFacilityReference(String productTrainingProcedureFinancialFacilityReference) {
    this.productTrainingProcedureFinancialFacilityReference = productTrainingProcedureFinancialFacilityReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the employee who is involved in Product Training Procedure 
   * @return productTrainingProcedureEmployeeReference
  **/

  public String getProductTrainingProcedureEmployeeReference() {
    return productTrainingProcedureEmployeeReference;
  }

  public void setProductTrainingProcedureEmployeeReference(String productTrainingProcedureEmployeeReference) {
    this.productTrainingProcedureEmployeeReference = productTrainingProcedureEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer who is involved in Product Training Procedure 
   * @return productTrainingProcedureCustomerReference
  **/

  public String getProductTrainingProcedureCustomerReference() {
    return productTrainingProcedureCustomerReference;
  }

  public void setProductTrainingProcedureCustomerReference(String productTrainingProcedureCustomerReference) {
    this.productTrainingProcedureCustomerReference = productTrainingProcedureCustomerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between the type of process undertaken within Product Training Procedure 
   * @return productTrainingProcedureType
  **/

  public String getProductTrainingProcedureType() {
    return productTrainingProcedureType;
  }

  public void setProductTrainingProcedureType(String productTrainingProcedureType) {
    this.productTrainingProcedureType = productTrainingProcedureType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule according to which the service provider will process the Product Training Procedure 
   * @return productTrainingProcedureServiceProviderSchedule
  **/

  public String getProductTrainingProcedureServiceProviderSchedule() {
    return productTrainingProcedureServiceProviderSchedule;
  }

  public void setProductTrainingProcedureServiceProviderSchedule(String productTrainingProcedureServiceProviderSchedule) {
    this.productTrainingProcedureServiceProviderSchedule = productTrainingProcedureServiceProviderSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between the type of services in Product Training Procedure  
   * @return productTrainingProcedureServiceType
  **/

  public String getProductTrainingProcedureServiceType() {
    return productTrainingProcedureServiceType;
  }

  public void setProductTrainingProcedureServiceType(String productTrainingProcedureServiceType) {
    this.productTrainingProcedureServiceType = productTrainingProcedureServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between the type of products/services related to Product Training Procedure  
   * @return productTrainingProcedureProductandServiceType
  **/

  public String getProductTrainingProcedureProductandServiceType() {
    return productTrainingProcedureProductandServiceType;
  }

  public void setProductTrainingProcedureProductandServiceType(String productTrainingProcedureProductandServiceType) {
    this.productTrainingProcedureProductandServiceType = productTrainingProcedureProductandServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the product or service that is related to Product Training Procedure 
   * @return productTrainingProcedureProductandServiceInstance
  **/

  public String getProductTrainingProcedureProductandServiceInstance() {
    return productTrainingProcedureProductandServiceInstance;
  }

  public void setProductTrainingProcedureProductandServiceInstance(String productTrainingProcedureProductandServiceInstance) {
    this.productTrainingProcedureProductandServiceInstance = productTrainingProcedureProductandServiceInstance;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between the type of transactions in Product Training Procedure  
   * @return productTrainingProcedureTransactionType
  **/

  public String getProductTrainingProcedureTransactionType() {
    return productTrainingProcedureTransactionType;
  }

  public void setProductTrainingProcedureTransactionType(String productTrainingProcedureTransactionType) {
    this.productTrainingProcedureTransactionType = productTrainingProcedureTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the Financial Transaction Arrangement that is related to Product Training Procedure  
   * @return productTrainingProcedureFinancialTransactionArrangement
  **/

  public String getProductTrainingProcedureFinancialTransactionArrangement() {
    return productTrainingProcedureFinancialTransactionArrangement;
  }

  public void setProductTrainingProcedureFinancialTransactionArrangement(String productTrainingProcedureFinancialTransactionArrangement) {
    this.productTrainingProcedureFinancialTransactionArrangement = productTrainingProcedureFinancialTransactionArrangement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Agreement that is related to Product Training Procedure  
   * @return productTrainingProcedureCustomerAgreementReference
  **/

  public String getProductTrainingProcedureCustomerAgreementReference() {
    return productTrainingProcedureCustomerAgreementReference;
  }

  public void setProductTrainingProcedureCustomerAgreementReference(String productTrainingProcedureCustomerAgreementReference) {
    this.productTrainingProcedureCustomerAgreementReference = productTrainingProcedureCustomerAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Training Procedure instance retrieve service call 
   * @return productTrainingProcedureRetrieveActionTaskReference
  **/

  public String getProductTrainingProcedureRetrieveActionTaskReference() {
    return productTrainingProcedureRetrieveActionTaskReference;
  }

  public void setProductTrainingProcedureRetrieveActionTaskReference(String productTrainingProcedureRetrieveActionTaskReference) {
    this.productTrainingProcedureRetrieveActionTaskReference = productTrainingProcedureRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productTrainingProcedureRetrieveActionTaskRecord
  **/

  public Object getProductTrainingProcedureRetrieveActionTaskRecord() {
    return productTrainingProcedureRetrieveActionTaskRecord;
  }

  public void setProductTrainingProcedureRetrieveActionTaskRecord(Object productTrainingProcedureRetrieveActionTaskRecord) {
    this.productTrainingProcedureRetrieveActionTaskRecord = productTrainingProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productTrainingProcedureRetrieveActionResponse
  **/

  public String getProductTrainingProcedureRetrieveActionResponse() {
    return productTrainingProcedureRetrieveActionResponse;
  }

  public void setProductTrainingProcedureRetrieveActionResponse(String productTrainingProcedureRetrieveActionResponse) {
    this.productTrainingProcedureRetrieveActionResponse = productTrainingProcedureRetrieveActionResponse;
  }


  /**
   * Get productTrainingProcedureInstanceReportRecord
   * @return productTrainingProcedureInstanceReportRecord
  **/

  public CRProductTrainingProcedureRetrieveOutputModelProductTrainingProcedureInstanceReportRecord getProductTrainingProcedureInstanceReportRecord() {
    return productTrainingProcedureInstanceReportRecord;
  }

  public void setProductTrainingProcedureInstanceReportRecord(CRProductTrainingProcedureRetrieveOutputModelProductTrainingProcedureInstanceReportRecord productTrainingProcedureInstanceReportRecord) {
    this.productTrainingProcedureInstanceReportRecord = productTrainingProcedureInstanceReportRecord;
  }


  /**
   * Get productTrainingProcedureInstanceAnalysis
   * @return productTrainingProcedureInstanceAnalysis
  **/

  public CRProductTrainingProcedureRetrieveOutputModelProductTrainingProcedureInstanceAnalysis getProductTrainingProcedureInstanceAnalysis() {
    return productTrainingProcedureInstanceAnalysis;
  }

  public void setProductTrainingProcedureInstanceAnalysis(CRProductTrainingProcedureRetrieveOutputModelProductTrainingProcedureInstanceAnalysis productTrainingProcedureInstanceAnalysis) {
    this.productTrainingProcedureInstanceAnalysis = productTrainingProcedureInstanceAnalysis;
  }


}


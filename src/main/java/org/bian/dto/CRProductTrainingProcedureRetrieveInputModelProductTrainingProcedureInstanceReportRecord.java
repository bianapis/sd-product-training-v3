package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductTrainingProcedureRetrieveInputModelProductTrainingProcedureInstanceReportRecord
 */
public class CRProductTrainingProcedureRetrieveInputModelProductTrainingProcedureInstanceReportRecord   {
  private String productTrainingProcedureInstanceReportReference = null;

  private String productTrainingProcedureInstanceReportType = null;

  private String productTrainingProcedureInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return productTrainingProcedureInstanceReportReference
  **/

  public String getProductTrainingProcedureInstanceReportReference() {
    return productTrainingProcedureInstanceReportReference;
  }

  public void setProductTrainingProcedureInstanceReportReference(String productTrainingProcedureInstanceReportReference) {
    this.productTrainingProcedureInstanceReportReference = productTrainingProcedureInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productTrainingProcedureInstanceReportType
  **/

  public String getProductTrainingProcedureInstanceReportType() {
    return productTrainingProcedureInstanceReportType;
  }

  public void setProductTrainingProcedureInstanceReportType(String productTrainingProcedureInstanceReportType) {
    this.productTrainingProcedureInstanceReportType = productTrainingProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productTrainingProcedureInstanceReportParameters
  **/

  public String getProductTrainingProcedureInstanceReportParameters() {
    return productTrainingProcedureInstanceReportParameters;
  }

  public void setProductTrainingProcedureInstanceReportParameters(String productTrainingProcedureInstanceReportParameters) {
    this.productTrainingProcedureInstanceReportParameters = productTrainingProcedureInstanceReportParameters;
  }


}


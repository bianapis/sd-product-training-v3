package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductTrainingProcedureRetrieveInputModelProductTrainingProcedureInstanceAnalysis
 */
public class CRProductTrainingProcedureRetrieveInputModelProductTrainingProcedureInstanceAnalysis   {
  private String productTrainingProcedureInstanceAnalysisReference = null;

  private String productTrainingProcedureInstanceAnalysisReportType = null;

  private String productTrainingProcedureInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return productTrainingProcedureInstanceAnalysisReference
  **/

  public String getProductTrainingProcedureInstanceAnalysisReference() {
    return productTrainingProcedureInstanceAnalysisReference;
  }

  public void setProductTrainingProcedureInstanceAnalysisReference(String productTrainingProcedureInstanceAnalysisReference) {
    this.productTrainingProcedureInstanceAnalysisReference = productTrainingProcedureInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productTrainingProcedureInstanceAnalysisReportType
  **/

  public String getProductTrainingProcedureInstanceAnalysisReportType() {
    return productTrainingProcedureInstanceAnalysisReportType;
  }

  public void setProductTrainingProcedureInstanceAnalysisReportType(String productTrainingProcedureInstanceAnalysisReportType) {
    this.productTrainingProcedureInstanceAnalysisReportType = productTrainingProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productTrainingProcedureInstanceAnalysisParameters
  **/

  public String getProductTrainingProcedureInstanceAnalysisParameters() {
    return productTrainingProcedureInstanceAnalysisParameters;
  }

  public void setProductTrainingProcedureInstanceAnalysisParameters(String productTrainingProcedureInstanceAnalysisParameters) {
    this.productTrainingProcedureInstanceAnalysisParameters = productTrainingProcedureInstanceAnalysisParameters;
  }


}


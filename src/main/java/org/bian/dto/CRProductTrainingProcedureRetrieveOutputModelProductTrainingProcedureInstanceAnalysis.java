package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductTrainingProcedureRetrieveOutputModelProductTrainingProcedureInstanceAnalysis
 */
public class CRProductTrainingProcedureRetrieveOutputModelProductTrainingProcedureInstanceAnalysis   {
  private String productTrainingProcedureInstanceAnalysisData = null;

  private String productTrainingProcedureInstanceAnalysisReportType = null;

  private Object productTrainingProcedureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productTrainingProcedureInstanceAnalysisData
  **/

  public String getProductTrainingProcedureInstanceAnalysisData() {
    return productTrainingProcedureInstanceAnalysisData;
  }

  public void setProductTrainingProcedureInstanceAnalysisData(String productTrainingProcedureInstanceAnalysisData) {
    this.productTrainingProcedureInstanceAnalysisData = productTrainingProcedureInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return productTrainingProcedureInstanceAnalysisReport
  **/

  public Object getProductTrainingProcedureInstanceAnalysisReport() {
    return productTrainingProcedureInstanceAnalysisReport;
  }

  public void setProductTrainingProcedureInstanceAnalysisReport(Object productTrainingProcedureInstanceAnalysisReport) {
    this.productTrainingProcedureInstanceAnalysisReport = productTrainingProcedureInstanceAnalysisReport;
  }


}


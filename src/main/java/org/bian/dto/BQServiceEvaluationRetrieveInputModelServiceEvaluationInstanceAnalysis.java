package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceEvaluationRetrieveInputModelServiceEvaluationInstanceAnalysis
 */
public class BQServiceEvaluationRetrieveInputModelServiceEvaluationInstanceAnalysis   {
  private String serviceEvaluationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return serviceEvaluationInstanceAnalysisReference
  **/

  public String getServiceEvaluationInstanceAnalysisReference() {
    return serviceEvaluationInstanceAnalysisReference;
  }

  public void setServiceEvaluationInstanceAnalysisReference(String serviceEvaluationInstanceAnalysisReference) {
    this.serviceEvaluationInstanceAnalysisReference = serviceEvaluationInstanceAnalysisReference;
  }


}


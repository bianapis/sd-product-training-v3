package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServiceSchedulingRetrieveInputModelServiceSchedulingInstanceAnalysis
 */
public class BQServiceSchedulingRetrieveInputModelServiceSchedulingInstanceAnalysis   {
  private String serviceSchedulingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return serviceSchedulingInstanceAnalysisReference
  **/

  public String getServiceSchedulingInstanceAnalysisReference() {
    return serviceSchedulingInstanceAnalysisReference;
  }

  public void setServiceSchedulingInstanceAnalysisReference(String serviceSchedulingInstanceAnalysisReference) {
    this.serviceSchedulingInstanceAnalysisReference = serviceSchedulingInstanceAnalysisReference;
  }


}


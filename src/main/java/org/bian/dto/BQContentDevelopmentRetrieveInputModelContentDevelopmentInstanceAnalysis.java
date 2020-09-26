package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQContentDevelopmentRetrieveInputModelContentDevelopmentInstanceAnalysis
 */
public class BQContentDevelopmentRetrieveInputModelContentDevelopmentInstanceAnalysis   {
  private String contentDevelopmentInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return contentDevelopmentInstanceAnalysisReference
  **/

  public String getContentDevelopmentInstanceAnalysisReference() {
    return contentDevelopmentInstanceAnalysisReference;
  }

  public void setContentDevelopmentInstanceAnalysisReference(String contentDevelopmentInstanceAnalysisReference) {
    this.contentDevelopmentInstanceAnalysisReference = contentDevelopmentInstanceAnalysisReference;
  }


}


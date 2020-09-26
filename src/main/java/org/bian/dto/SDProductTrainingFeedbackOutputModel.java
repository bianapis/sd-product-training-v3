package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductTrainingFeedbackOutputModelProductTrainingFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDProductTrainingFeedbackOutputModel
 */
public class SDProductTrainingFeedbackOutputModel   {
  private String productTrainingFeedbackActionTaskReference = null;

  private Object productTrainingFeedbackActionTaskRecord = null;

  private SDProductTrainingFeedbackOutputModelProductTrainingFeedbackActionRecord productTrainingFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return productTrainingFeedbackActionTaskReference
  **/

  public String getProductTrainingFeedbackActionTaskReference() {
    return productTrainingFeedbackActionTaskReference;
  }

  public void setProductTrainingFeedbackActionTaskReference(String productTrainingFeedbackActionTaskReference) {
    this.productTrainingFeedbackActionTaskReference = productTrainingFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return productTrainingFeedbackActionTaskRecord
  **/

  public Object getProductTrainingFeedbackActionTaskRecord() {
    return productTrainingFeedbackActionTaskRecord;
  }

  public void setProductTrainingFeedbackActionTaskRecord(Object productTrainingFeedbackActionTaskRecord) {
    this.productTrainingFeedbackActionTaskRecord = productTrainingFeedbackActionTaskRecord;
  }


  /**
   * Get productTrainingFeedbackActionRecord
   * @return productTrainingFeedbackActionRecord
  **/

  public SDProductTrainingFeedbackOutputModelProductTrainingFeedbackActionRecord getProductTrainingFeedbackActionRecord() {
    return productTrainingFeedbackActionRecord;
  }

  public void setProductTrainingFeedbackActionRecord(SDProductTrainingFeedbackOutputModelProductTrainingFeedbackActionRecord productTrainingFeedbackActionRecord) {
    this.productTrainingFeedbackActionRecord = productTrainingFeedbackActionRecord;
  }


}


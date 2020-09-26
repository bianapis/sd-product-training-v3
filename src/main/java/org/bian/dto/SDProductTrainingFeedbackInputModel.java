package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductTrainingFeedbackInputModelProductTrainingFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDProductTrainingFeedbackInputModel
 */
public class SDProductTrainingFeedbackInputModel   {
  private Object productTrainingFeedbackActionTaskRecord = null;

  private SDProductTrainingFeedbackInputModelProductTrainingFeedbackActionRecord productTrainingFeedbackActionRecord = null;


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

  public SDProductTrainingFeedbackInputModelProductTrainingFeedbackActionRecord getProductTrainingFeedbackActionRecord() {
    return productTrainingFeedbackActionRecord;
  }

  public void setProductTrainingFeedbackActionRecord(SDProductTrainingFeedbackInputModelProductTrainingFeedbackActionRecord productTrainingFeedbackActionRecord) {
    this.productTrainingFeedbackActionRecord = productTrainingFeedbackActionRecord;
  }


}


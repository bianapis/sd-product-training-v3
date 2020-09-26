package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductTrainingRetrieveInputModelProductTrainingOfferedService;
import org.bian.dto.SDProductTrainingRetrieveInputModelProductTrainingRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDProductTrainingRetrieveInputModel
 */
public class SDProductTrainingRetrieveInputModel   {
  private Object productTrainingRetrieveActionTaskRecord = null;

  private String productTrainingRetrieveActionRequest = null;

  private SDProductTrainingRetrieveInputModelProductTrainingRetrieveActionRecord productTrainingRetrieveActionRecord = null;

  private SDProductTrainingRetrieveInputModelProductTrainingOfferedService productTrainingOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productTrainingRetrieveActionTaskRecord
  **/

  public Object getProductTrainingRetrieveActionTaskRecord() {
    return productTrainingRetrieveActionTaskRecord;
  }

  public void setProductTrainingRetrieveActionTaskRecord(Object productTrainingRetrieveActionTaskRecord) {
    this.productTrainingRetrieveActionTaskRecord = productTrainingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productTrainingRetrieveActionRequest
  **/

  public String getProductTrainingRetrieveActionRequest() {
    return productTrainingRetrieveActionRequest;
  }

  public void setProductTrainingRetrieveActionRequest(String productTrainingRetrieveActionRequest) {
    this.productTrainingRetrieveActionRequest = productTrainingRetrieveActionRequest;
  }


  /**
   * Get productTrainingRetrieveActionRecord
   * @return productTrainingRetrieveActionRecord
  **/

  public SDProductTrainingRetrieveInputModelProductTrainingRetrieveActionRecord getProductTrainingRetrieveActionRecord() {
    return productTrainingRetrieveActionRecord;
  }

  public void setProductTrainingRetrieveActionRecord(SDProductTrainingRetrieveInputModelProductTrainingRetrieveActionRecord productTrainingRetrieveActionRecord) {
    this.productTrainingRetrieveActionRecord = productTrainingRetrieveActionRecord;
  }


  /**
   * Get productTrainingOfferedService
   * @return productTrainingOfferedService
  **/

  public SDProductTrainingRetrieveInputModelProductTrainingOfferedService getProductTrainingOfferedService() {
    return productTrainingOfferedService;
  }

  public void setProductTrainingOfferedService(SDProductTrainingRetrieveInputModelProductTrainingOfferedService productTrainingOfferedService) {
    this.productTrainingOfferedService = productTrainingOfferedService;
  }


}


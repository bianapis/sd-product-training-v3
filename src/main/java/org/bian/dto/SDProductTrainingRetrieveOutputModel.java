package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductTrainingRetrieveOutputModelProductTrainingOfferedService;
import org.bian.dto.SDProductTrainingRetrieveOutputModelProductTrainingRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDProductTrainingRetrieveOutputModel
 */
public class SDProductTrainingRetrieveOutputModel   {
  private String productTrainingRetrieveActionTaskReference = null;

  private Object productTrainingRetrieveActionTaskRecord = null;

  private String productTrainingRetrieveActionResponse = null;

  private SDProductTrainingRetrieveOutputModelProductTrainingRetrieveActionRecord productTrainingRetrieveActionRecord = null;

  private SDProductTrainingRetrieveOutputModelProductTrainingOfferedService productTrainingOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return productTrainingRetrieveActionTaskReference
  **/

  public String getProductTrainingRetrieveActionTaskReference() {
    return productTrainingRetrieveActionTaskReference;
  }

  public void setProductTrainingRetrieveActionTaskReference(String productTrainingRetrieveActionTaskReference) {
    this.productTrainingRetrieveActionTaskReference = productTrainingRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productTrainingRetrieveActionResponse
  **/

  public String getProductTrainingRetrieveActionResponse() {
    return productTrainingRetrieveActionResponse;
  }

  public void setProductTrainingRetrieveActionResponse(String productTrainingRetrieveActionResponse) {
    this.productTrainingRetrieveActionResponse = productTrainingRetrieveActionResponse;
  }


  /**
   * Get productTrainingRetrieveActionRecord
   * @return productTrainingRetrieveActionRecord
  **/

  public SDProductTrainingRetrieveOutputModelProductTrainingRetrieveActionRecord getProductTrainingRetrieveActionRecord() {
    return productTrainingRetrieveActionRecord;
  }

  public void setProductTrainingRetrieveActionRecord(SDProductTrainingRetrieveOutputModelProductTrainingRetrieveActionRecord productTrainingRetrieveActionRecord) {
    this.productTrainingRetrieveActionRecord = productTrainingRetrieveActionRecord;
  }


  /**
   * Get productTrainingOfferedService
   * @return productTrainingOfferedService
  **/

  public SDProductTrainingRetrieveOutputModelProductTrainingOfferedService getProductTrainingOfferedService() {
    return productTrainingOfferedService;
  }

  public void setProductTrainingOfferedService(SDProductTrainingRetrieveOutputModelProductTrainingOfferedService productTrainingOfferedService) {
    this.productTrainingOfferedService = productTrainingOfferedService;
  }


}


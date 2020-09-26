package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductTrainingRetrieveOutputModelProductTrainingOfferedServiceProductTrainingServiceRecord;

import javax.validation.Valid;
  
/**
 * SDProductTrainingRetrieveOutputModelProductTrainingOfferedService
 */
public class SDProductTrainingRetrieveOutputModelProductTrainingOfferedService   {
  private String productTrainingServiceReference = null;

  private SDProductTrainingRetrieveOutputModelProductTrainingOfferedServiceProductTrainingServiceRecord productTrainingServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return productTrainingServiceReference
  **/

  public String getProductTrainingServiceReference() {
    return productTrainingServiceReference;
  }

  public void setProductTrainingServiceReference(String productTrainingServiceReference) {
    this.productTrainingServiceReference = productTrainingServiceReference;
  }


  /**
   * Get productTrainingServiceRecord
   * @return productTrainingServiceRecord
  **/

  public SDProductTrainingRetrieveOutputModelProductTrainingOfferedServiceProductTrainingServiceRecord getProductTrainingServiceRecord() {
    return productTrainingServiceRecord;
  }

  public void setProductTrainingServiceRecord(SDProductTrainingRetrieveOutputModelProductTrainingOfferedServiceProductTrainingServiceRecord productTrainingServiceRecord) {
    this.productTrainingServiceRecord = productTrainingServiceRecord;
  }


}


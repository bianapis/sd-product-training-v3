package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductTrainingProcedureRetrieveInputModelProductTrainingProcedureInstanceAnalysis;
import org.bian.dto.CRProductTrainingProcedureRetrieveInputModelProductTrainingProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProductTrainingProcedureRetrieveInputModel
 */
public class CRProductTrainingProcedureRetrieveInputModel   {
  private Object productTrainingProcedureRetrieveActionTaskRecord = null;

  private String productTrainingProcedureRetrieveActionRequest = null;

  private CRProductTrainingProcedureRetrieveInputModelProductTrainingProcedureInstanceReportRecord productTrainingProcedureInstanceReportRecord = null;

  private CRProductTrainingProcedureRetrieveInputModelProductTrainingProcedureInstanceAnalysis productTrainingProcedureInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productTrainingProcedureRetrieveActionTaskRecord
  **/

  public Object getProductTrainingProcedureRetrieveActionTaskRecord() {
    return productTrainingProcedureRetrieveActionTaskRecord;
  }

  public void setProductTrainingProcedureRetrieveActionTaskRecord(Object productTrainingProcedureRetrieveActionTaskRecord) {
    this.productTrainingProcedureRetrieveActionTaskRecord = productTrainingProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productTrainingProcedureRetrieveActionRequest
  **/

  public String getProductTrainingProcedureRetrieveActionRequest() {
    return productTrainingProcedureRetrieveActionRequest;
  }

  public void setProductTrainingProcedureRetrieveActionRequest(String productTrainingProcedureRetrieveActionRequest) {
    this.productTrainingProcedureRetrieveActionRequest = productTrainingProcedureRetrieveActionRequest;
  }


  /**
   * Get productTrainingProcedureInstanceReportRecord
   * @return productTrainingProcedureInstanceReportRecord
  **/

  public CRProductTrainingProcedureRetrieveInputModelProductTrainingProcedureInstanceReportRecord getProductTrainingProcedureInstanceReportRecord() {
    return productTrainingProcedureInstanceReportRecord;
  }

  public void setProductTrainingProcedureInstanceReportRecord(CRProductTrainingProcedureRetrieveInputModelProductTrainingProcedureInstanceReportRecord productTrainingProcedureInstanceReportRecord) {
    this.productTrainingProcedureInstanceReportRecord = productTrainingProcedureInstanceReportRecord;
  }


  /**
   * Get productTrainingProcedureInstanceAnalysis
   * @return productTrainingProcedureInstanceAnalysis
  **/

  public CRProductTrainingProcedureRetrieveInputModelProductTrainingProcedureInstanceAnalysis getProductTrainingProcedureInstanceAnalysis() {
    return productTrainingProcedureInstanceAnalysis;
  }

  public void setProductTrainingProcedureInstanceAnalysis(CRProductTrainingProcedureRetrieveInputModelProductTrainingProcedureInstanceAnalysis productTrainingProcedureInstanceAnalysis) {
    this.productTrainingProcedureInstanceAnalysis = productTrainingProcedureInstanceAnalysis;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductTrainingRetrieveOutputModelProductTrainingRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDProductTrainingRetrieveOutputModelProductTrainingRetrieveActionRecordProductTrainingActivityAnalysis;
import org.bian.dto.SDProductTrainingRetrieveOutputModelProductTrainingRetrieveActionRecordProductTrainingPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDProductTrainingRetrieveOutputModelProductTrainingRetrieveActionRecord
 */
public class SDProductTrainingRetrieveOutputModelProductTrainingRetrieveActionRecord   {
  private SDProductTrainingRetrieveOutputModelProductTrainingRetrieveActionRecordProductTrainingActivityAnalysis productTrainingActivityAnalysis = null;

  private SDProductTrainingRetrieveOutputModelProductTrainingRetrieveActionRecordProductTrainingPerformanceAnalysis productTrainingPerformanceAnalysis = null;

  private SDProductTrainingRetrieveOutputModelProductTrainingRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get productTrainingActivityAnalysis
   * @return productTrainingActivityAnalysis
  **/

  public SDProductTrainingRetrieveOutputModelProductTrainingRetrieveActionRecordProductTrainingActivityAnalysis getProductTrainingActivityAnalysis() {
    return productTrainingActivityAnalysis;
  }

  public void setProductTrainingActivityAnalysis(SDProductTrainingRetrieveOutputModelProductTrainingRetrieveActionRecordProductTrainingActivityAnalysis productTrainingActivityAnalysis) {
    this.productTrainingActivityAnalysis = productTrainingActivityAnalysis;
  }


  /**
   * Get productTrainingPerformanceAnalysis
   * @return productTrainingPerformanceAnalysis
  **/

  public SDProductTrainingRetrieveOutputModelProductTrainingRetrieveActionRecordProductTrainingPerformanceAnalysis getProductTrainingPerformanceAnalysis() {
    return productTrainingPerformanceAnalysis;
  }

  public void setProductTrainingPerformanceAnalysis(SDProductTrainingRetrieveOutputModelProductTrainingRetrieveActionRecordProductTrainingPerformanceAnalysis productTrainingPerformanceAnalysis) {
    this.productTrainingPerformanceAnalysis = productTrainingPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDProductTrainingRetrieveOutputModelProductTrainingRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDProductTrainingRetrieveOutputModelProductTrainingRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}


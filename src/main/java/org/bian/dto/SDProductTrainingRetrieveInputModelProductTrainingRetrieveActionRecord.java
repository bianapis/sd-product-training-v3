package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductTrainingRetrieveInputModelProductTrainingRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDProductTrainingRetrieveInputModelProductTrainingRetrieveActionRecordProductTrainingActivityAnalysis;
import org.bian.dto.SDProductTrainingRetrieveInputModelProductTrainingRetrieveActionRecordProductTrainingPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDProductTrainingRetrieveInputModelProductTrainingRetrieveActionRecord
 */
public class SDProductTrainingRetrieveInputModelProductTrainingRetrieveActionRecord   {
  private SDProductTrainingRetrieveInputModelProductTrainingRetrieveActionRecordProductTrainingActivityAnalysis productTrainingActivityAnalysis = null;

  private SDProductTrainingRetrieveInputModelProductTrainingRetrieveActionRecordProductTrainingPerformanceAnalysis productTrainingPerformanceAnalysis = null;

  private SDProductTrainingRetrieveInputModelProductTrainingRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get productTrainingActivityAnalysis
   * @return productTrainingActivityAnalysis
  **/

  public SDProductTrainingRetrieveInputModelProductTrainingRetrieveActionRecordProductTrainingActivityAnalysis getProductTrainingActivityAnalysis() {
    return productTrainingActivityAnalysis;
  }

  public void setProductTrainingActivityAnalysis(SDProductTrainingRetrieveInputModelProductTrainingRetrieveActionRecordProductTrainingActivityAnalysis productTrainingActivityAnalysis) {
    this.productTrainingActivityAnalysis = productTrainingActivityAnalysis;
  }


  /**
   * Get productTrainingPerformanceAnalysis
   * @return productTrainingPerformanceAnalysis
  **/

  public SDProductTrainingRetrieveInputModelProductTrainingRetrieveActionRecordProductTrainingPerformanceAnalysis getProductTrainingPerformanceAnalysis() {
    return productTrainingPerformanceAnalysis;
  }

  public void setProductTrainingPerformanceAnalysis(SDProductTrainingRetrieveInputModelProductTrainingRetrieveActionRecordProductTrainingPerformanceAnalysis productTrainingPerformanceAnalysis) {
    this.productTrainingPerformanceAnalysis = productTrainingPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDProductTrainingRetrieveInputModelProductTrainingRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDProductTrainingRetrieveInputModelProductTrainingRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}


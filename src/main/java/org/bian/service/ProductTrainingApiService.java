/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ProductTrainingApiService {

	SDProductTrainingActivateOutputModel activate(SDProductTrainingActivateInputModel request);
	
	SDProductTrainingConfigureOutputModel configure(String sdReferenceId, SDProductTrainingConfigureInputModel request);
	
	CRProductTrainingProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRProductTrainingProcedureControlInputModel request);
	
	BQContentDevelopmentExchangeOutputModel exchangeContentdevelopment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQContentDevelopmentExchangeInputModel request);
	
	BQServiceDeliveryExchangeOutputModel exchangeServicedelivery(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceDeliveryExchangeInputModel request);
	
	BQServiceEvaluationExchangeOutputModel exchangeServiceevaluation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceEvaluationExchangeInputModel request);
	
	BQServiceSchedulingExchangeOutputModel exchangeServicescheduling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceSchedulingExchangeInputModel request);
	
	CRProductTrainingProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRProductTrainingProcedureExchangeInputModel request);
	
	BQServiceDeliveryExecuteOutputModel executeServicedelivery(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceDeliveryExecuteInputModel request);
	
	BQServiceSchedulingExecuteOutputModel executeServicescheduling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceSchedulingExecuteInputModel request);
	
	CRProductTrainingProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRProductTrainingProcedureExecuteInputModel request);
	
	SDProductTrainingFeedbackOutputModel feedback(String sdReferenceId, SDProductTrainingFeedbackInputModel request);
	
	CRProductTrainingProcedureInitiateOutputModel initiate(String sdReferenceId, CRProductTrainingProcedureInitiateInputModel request);
	
	BQContentDevelopmentInitiateOutputModel initiateContentdevelopment(String sdReferenceId, String crReferenceId, BQContentDevelopmentInitiateInputModel request);
	
	BQServiceDeliveryInitiateOutputModel initiateServicedelivery(String sdReferenceId, String crReferenceId, BQServiceDeliveryInitiateInputModel request);
	
	BQServiceSchedulingInitiateOutputModel initiateServicescheduling(String sdReferenceId, String crReferenceId, BQServiceSchedulingInitiateInputModel request);
	
	BQContentDevelopmentRequestOutputModel requestContentdevelopment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQContentDevelopmentRequestInputModel request);
	
	BQServiceDeliveryRequestOutputModel requestServicedelivery(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceDeliveryRequestInputModel request);
	
	BQServiceEvaluationRequestOutputModel requestServiceevaluation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceEvaluationRequestInputModel request);
	
	BQServiceSchedulingRequestOutputModel requestServicescheduling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceSchedulingRequestInputModel request);
	
	CRProductTrainingProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProductTrainingProcedureRequestInputModel request);
	
	CRProductTrainingProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQContentDevelopmentRetrieveOutputModel retrieveContentdevelopment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQServiceDeliveryRetrieveOutputModel retrieveServicedelivery(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQServiceEvaluationRetrieveOutputModel retrieveServiceevaluation(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQServiceSchedulingRetrieveOutputModel retrieveServicescheduling(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDProductTrainingRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRProductTrainingProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProductTrainingProcedureUpdateInputModel request);
	
	BQContentDevelopmentUpdateOutputModel updateContentdevelopment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQContentDevelopmentUpdateInputModel request);
	
	BQServiceDeliveryUpdateOutputModel updateServicedelivery(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceDeliveryUpdateInputModel request);
	
	BQServiceEvaluationUpdateOutputModel updateServiceevaluation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceEvaluationUpdateInputModel request);
	
	BQServiceSchedulingUpdateOutputModel updateServicescheduling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceSchedulingUpdateInputModel request);
	
}

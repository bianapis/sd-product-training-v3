/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ProductTrainingApiServiceImpl implements ProductTrainingApiService {

	public SDProductTrainingActivateOutputModel activate(SDProductTrainingActivateInputModel request){
		return JsonReader.read("activate-SDProductTrainingActivateOutputModel.json",new TypeReference<SDProductTrainingActivateOutputModel>(){});
	}
	
	public SDProductTrainingConfigureOutputModel configure(String sdReferenceId, SDProductTrainingConfigureInputModel request){
		return JsonReader.read("configure-SDProductTrainingConfigureOutputModel.json",new TypeReference<SDProductTrainingConfigureOutputModel>(){});
	}
	
	public CRProductTrainingProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRProductTrainingProcedureControlInputModel request){
		return JsonReader.read("control-CRProductTrainingProcedureControlOutputModel.json",new TypeReference<CRProductTrainingProcedureControlOutputModel>(){});
	}
	
	public BQContentDevelopmentExchangeOutputModel exchangeContentdevelopment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQContentDevelopmentExchangeInputModel request){
		return JsonReader.read("exchange-BQContentDevelopmentExchangeOutputModel.json",new TypeReference<BQContentDevelopmentExchangeOutputModel>(){});
	}
	
	public BQServiceDeliveryExchangeOutputModel exchangeServicedelivery(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceDeliveryExchangeInputModel request){
		return JsonReader.read("exchange-BQServiceDeliveryExchangeOutputModel.json",new TypeReference<BQServiceDeliveryExchangeOutputModel>(){});
	}
	
	public BQServiceEvaluationExchangeOutputModel exchangeServiceevaluation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceEvaluationExchangeInputModel request){
		return JsonReader.read("exchange-BQServiceEvaluationExchangeOutputModel.json",new TypeReference<BQServiceEvaluationExchangeOutputModel>(){});
	}
	
	public BQServiceSchedulingExchangeOutputModel exchangeServicescheduling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceSchedulingExchangeInputModel request){
		return JsonReader.read("exchange-BQServiceSchedulingExchangeOutputModel.json",new TypeReference<BQServiceSchedulingExchangeOutputModel>(){});
	}
	
	public CRProductTrainingProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRProductTrainingProcedureExchangeInputModel request){
		return JsonReader.read("exchange-CRProductTrainingProcedureExchangeOutputModel.json",new TypeReference<CRProductTrainingProcedureExchangeOutputModel>(){});
	}
	
	public BQServiceDeliveryExecuteOutputModel executeServicedelivery(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceDeliveryExecuteInputModel request){
		return JsonReader.read("execute-BQServiceDeliveryExecuteOutputModel.json",new TypeReference<BQServiceDeliveryExecuteOutputModel>(){});
	}
	
	public BQServiceSchedulingExecuteOutputModel executeServicescheduling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceSchedulingExecuteInputModel request){
		return JsonReader.read("execute-BQServiceSchedulingExecuteOutputModel.json",new TypeReference<BQServiceSchedulingExecuteOutputModel>(){});
	}
	
	public CRProductTrainingProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRProductTrainingProcedureExecuteInputModel request){
		return JsonReader.read("execute-CRProductTrainingProcedureExecuteOutputModel.json",new TypeReference<CRProductTrainingProcedureExecuteOutputModel>(){});
	}
	
	public SDProductTrainingFeedbackOutputModel feedback(String sdReferenceId, SDProductTrainingFeedbackInputModel request){
		return JsonReader.read("feedback-SDProductTrainingFeedbackOutputModel.json",new TypeReference<SDProductTrainingFeedbackOutputModel>(){});
	}
	
	public CRProductTrainingProcedureInitiateOutputModel initiate(String sdReferenceId, CRProductTrainingProcedureInitiateInputModel request){
		return JsonReader.read("initiate-CRProductTrainingProcedureInitiateOutputModel.json",new TypeReference<CRProductTrainingProcedureInitiateOutputModel>(){});
	}
	
	public BQContentDevelopmentInitiateOutputModel initiateContentdevelopment(String sdReferenceId, String crReferenceId, BQContentDevelopmentInitiateInputModel request){
		return JsonReader.read("initiate-BQContentDevelopmentInitiateOutputModel.json",new TypeReference<BQContentDevelopmentInitiateOutputModel>(){});
	}
	
	public BQServiceDeliveryInitiateOutputModel initiateServicedelivery(String sdReferenceId, String crReferenceId, BQServiceDeliveryInitiateInputModel request){
		return JsonReader.read("initiate-BQServiceDeliveryInitiateOutputModel.json",new TypeReference<BQServiceDeliveryInitiateOutputModel>(){});
	}
	
	public BQServiceSchedulingInitiateOutputModel initiateServicescheduling(String sdReferenceId, String crReferenceId, BQServiceSchedulingInitiateInputModel request){
		return JsonReader.read("initiate-BQServiceSchedulingInitiateOutputModel.json",new TypeReference<BQServiceSchedulingInitiateOutputModel>(){});
	}
	
	public BQContentDevelopmentRequestOutputModel requestContentdevelopment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQContentDevelopmentRequestInputModel request){
		return JsonReader.read("request-BQContentDevelopmentRequestOutputModel.json",new TypeReference<BQContentDevelopmentRequestOutputModel>(){});
	}
	
	public BQServiceDeliveryRequestOutputModel requestServicedelivery(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceDeliveryRequestInputModel request){
		return JsonReader.read("request-BQServiceDeliveryRequestOutputModel.json",new TypeReference<BQServiceDeliveryRequestOutputModel>(){});
	}
	
	public BQServiceEvaluationRequestOutputModel requestServiceevaluation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceEvaluationRequestInputModel request){
		return JsonReader.read("request-BQServiceEvaluationRequestOutputModel.json",new TypeReference<BQServiceEvaluationRequestOutputModel>(){});
	}
	
	public BQServiceSchedulingRequestOutputModel requestServicescheduling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceSchedulingRequestInputModel request){
		return JsonReader.read("request-BQServiceSchedulingRequestOutputModel.json",new TypeReference<BQServiceSchedulingRequestOutputModel>(){});
	}
	
	public CRProductTrainingProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProductTrainingProcedureRequestInputModel request){
		return JsonReader.read("request-CRProductTrainingProcedureRequestOutputModel.json",new TypeReference<CRProductTrainingProcedureRequestOutputModel>(){});
	}
	
	public CRProductTrainingProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRProductTrainingProcedureRetrieveOutputModel.json",new TypeReference<CRProductTrainingProcedureRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQContentDevelopmentRetrieveOutputModel retrieveContentdevelopment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQContentDevelopmentRetrieveOutputModel.json",new TypeReference<BQContentDevelopmentRetrieveOutputModel>(){});
	}
	
	public BQServiceDeliveryRetrieveOutputModel retrieveServicedelivery(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQServiceDeliveryRetrieveOutputModel.json",new TypeReference<BQServiceDeliveryRetrieveOutputModel>(){});
	}
	
	public BQServiceEvaluationRetrieveOutputModel retrieveServiceevaluation(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQServiceEvaluationRetrieveOutputModel.json",new TypeReference<BQServiceEvaluationRetrieveOutputModel>(){});
	}
	
	public BQServiceSchedulingRetrieveOutputModel retrieveServicescheduling(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQServiceSchedulingRetrieveOutputModel.json",new TypeReference<BQServiceSchedulingRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDProductTrainingRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDProductTrainingRetrieveOutputModel.json",new TypeReference<SDProductTrainingRetrieveOutputModel>(){});
	}
	
	public CRProductTrainingProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProductTrainingProcedureUpdateInputModel request){
		return JsonReader.read("update-CRProductTrainingProcedureUpdateOutputModel.json",new TypeReference<CRProductTrainingProcedureUpdateOutputModel>(){});
	}
	
	public BQContentDevelopmentUpdateOutputModel updateContentdevelopment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQContentDevelopmentUpdateInputModel request){
		return JsonReader.read("update-BQContentDevelopmentUpdateOutputModel.json",new TypeReference<BQContentDevelopmentUpdateOutputModel>(){});
	}
	
	public BQServiceDeliveryUpdateOutputModel updateServicedelivery(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceDeliveryUpdateInputModel request){
		return JsonReader.read("update-BQServiceDeliveryUpdateOutputModel.json",new TypeReference<BQServiceDeliveryUpdateOutputModel>(){});
	}
	
	public BQServiceEvaluationUpdateOutputModel updateServiceevaluation(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceEvaluationUpdateInputModel request){
		return JsonReader.read("update-BQServiceEvaluationUpdateOutputModel.json",new TypeReference<BQServiceEvaluationUpdateOutputModel>(){});
	}
	
	public BQServiceSchedulingUpdateOutputModel updateServicescheduling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceSchedulingUpdateInputModel request){
		return JsonReader.read("update-BQServiceSchedulingUpdateOutputModel.json",new TypeReference<BQServiceSchedulingUpdateOutputModel>(){});
	}
	
}

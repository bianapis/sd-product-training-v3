/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class ProductTrainingApiController {

	@Autowired
	ProductTrainingApiService service;
	
	@Process.Activate
	public BianResponse<SDProductTrainingActivateOutputModel> activate(@RequestBody BianRequest<SDProductTrainingActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Process.Configure
	public BianResponse<SDProductTrainingConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDProductTrainingConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Control
	public BianResponse<CRProductTrainingProcedureControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductTrainingProcedureControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("contentdevelopment")
	@Process.Exchange
	public BianResponse<BQContentDevelopmentExchangeOutputModel> exchangeContentdevelopment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQContentDevelopmentExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeContentdevelopment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicedelivery")
	@Process.Exchange
	public BianResponse<BQServiceDeliveryExchangeOutputModel> exchangeServicedelivery(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServiceDeliveryExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeServicedelivery(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("serviceevaluation")
	@Process.Exchange
	public BianResponse<BQServiceEvaluationExchangeOutputModel> exchangeServiceevaluation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServiceEvaluationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeServiceevaluation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicescheduling")
	@Process.Exchange
	public BianResponse<BQServiceSchedulingExchangeOutputModel> exchangeServicescheduling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServiceSchedulingExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeServicescheduling(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Exchange
	public BianResponse<CRProductTrainingProcedureExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductTrainingProcedureExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicedelivery")
	@Process.Execute
	public BianResponse<BQServiceDeliveryExecuteOutputModel> executeServicedelivery(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServiceDeliveryExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeServicedelivery(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicescheduling")
	@Process.Execute
	public BianResponse<BQServiceSchedulingExecuteOutputModel> executeServicescheduling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServiceSchedulingExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeServicescheduling(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Execute
	public BianResponse<CRProductTrainingProcedureExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductTrainingProcedureExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Feedback
	public BianResponse<SDProductTrainingFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDProductTrainingFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Initiate
	public BianResponse<CRProductTrainingProcedureInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRProductTrainingProcedureInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("contentdevelopment")
	@Process.Initiate
	public BianResponse<BQContentDevelopmentInitiateOutputModel> initiateContentdevelopment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQContentDevelopmentInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateContentdevelopment(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicedelivery")
	@Process.Initiate
	public BianResponse<BQServiceDeliveryInitiateOutputModel> initiateServicedelivery(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQServiceDeliveryInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateServicedelivery(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicescheduling")
	@Process.Initiate
	public BianResponse<BQServiceSchedulingInitiateOutputModel> initiateServicescheduling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQServiceSchedulingInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateServicescheduling(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("contentdevelopment")
	@Process.Request
	public BianResponse<BQContentDevelopmentRequestOutputModel> requestContentdevelopment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQContentDevelopmentRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestContentdevelopment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicedelivery")
	@Process.Request
	public BianResponse<BQServiceDeliveryRequestOutputModel> requestServicedelivery(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServiceDeliveryRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestServicedelivery(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("serviceevaluation")
	@Process.Request
	public BianResponse<BQServiceEvaluationRequestOutputModel> requestServiceevaluation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServiceEvaluationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestServiceevaluation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicescheduling")
	@Process.Request
	public BianResponse<BQServiceSchedulingRequestOutputModel> requestServicescheduling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServiceSchedulingRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestServicescheduling(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Process.Request
	public BianResponse<CRProductTrainingProcedureRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductTrainingProcedureRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Retrieve
	public BianResponse<CRProductTrainingProcedureRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("contentdevelopment")
	@Process.Retrieve
	public BianResponse<BQContentDevelopmentRetrieveOutputModel> retrieveContentdevelopment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveContentdevelopment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("servicedelivery")
	@Process.Retrieve
	public BianResponse<BQServiceDeliveryRetrieveOutputModel> retrieveServicedelivery(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveServicedelivery(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("serviceevaluation")
	@Process.Retrieve
	public BianResponse<BQServiceEvaluationRetrieveOutputModel> retrieveServiceevaluation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveServiceevaluation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("servicescheduling")
	@Process.Retrieve
	public BianResponse<BQServiceSchedulingRetrieveOutputModel> retrieveServicescheduling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveServicescheduling(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Process.RetrieveSD
	public BianResponse<SDProductTrainingRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Process.Update
	public BianResponse<CRProductTrainingProcedureUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductTrainingProcedureUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("contentdevelopment")
	@Process.Update
	public BianResponse<BQContentDevelopmentUpdateOutputModel> updateContentdevelopment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQContentDevelopmentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateContentdevelopment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicedelivery")
	@Process.Update
	public BianResponse<BQServiceDeliveryUpdateOutputModel> updateServicedelivery(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServiceDeliveryUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateServicedelivery(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("serviceevaluation")
	@Process.Update
	public BianResponse<BQServiceEvaluationUpdateOutputModel> updateServiceevaluation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServiceEvaluationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateServiceevaluation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicescheduling")
	@Process.Update
	public BianResponse<BQServiceSchedulingUpdateOutputModel> updateServicescheduling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServiceSchedulingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateServicescheduling(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}

package com.demo.api.service;

import com.demo.api.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.lang.Object;
import java.util.Arrays;


@Service
public class ThaiPostService {

    @Autowired
    RestTemplate restTemplate;

    public ResponseEntity<Object> getTrackingDetail(String tracking_no){

        com.demo.api.domain.RequestBody requestBody = new com.demo.api.domain.RequestBody();
        com.demo.api.domain.Object object = new com.demo.api.domain.Object();
        TrackingInput trackingInput = new TrackingInput();
        trackingInput.setTrackingNo(tracking_no.trim());
        object.setTrackingInput(trackingInput);
        requestBody.setObject(object);
        requestBody.setFlowName("Get Tracking Detail");

        return getThaiPostData(requestBody);
    }

    public ResponseEntity<Object> getTrackingList(String mobile_no){
        com.demo.api.domain.RequestBody requestBody = new com.demo.api.domain.RequestBody();
        com.demo.api.domain.Object object = new com.demo.api.domain.Object();
        TrackingListInput trackingInput = new TrackingListInput();
        trackingInput.setMobile(mobile_no.trim());
        object.setTrackingListInput(trackingInput);
        requestBody.setObject(object);
        requestBody.setFlowName("Get Tracking List");

        return getThaiPostData(requestBody);
    }


    private ResponseEntity<Object> getThaiPostData(RequestBody requestBody){

        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);
        requestHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<RequestBody> requestEntity = new HttpEntity<>(requestBody, requestHeaders);

        String url = "http://3.1.79.112:30614/MicroflowRest/DoAction";
        ResponseEntity<TrackingResponse> responseEntity;
        try {
            responseEntity = restTemplate.exchange(
                    url,
                    HttpMethod.POST,
                    requestEntity,
                    TrackingResponse.class
            );
        }catch (Exception ex){
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setResponseCode("500");
            errorResponse.setResponseStatus("ERROR");
            errorResponse.setException(ex.getMessage());
            return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        TrackingResponse trackingResponse = responseEntity.getBody();

        if(null != trackingResponse.getResponseObjectsMap().getTrackingOutput()
                && trackingResponse.getResponseObjectsMap().getTrackingOutput().size() >= 1) {
            return new ResponseEntity<>(trackingResponse, HttpStatus.OK);
        }else{
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setResponseCode(trackingResponse.getFlowName());
            errorResponse.setResponseStatus(trackingResponse.getResponseStatus());
            errorResponse.setException("Not found");
            return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
        }

    }

}

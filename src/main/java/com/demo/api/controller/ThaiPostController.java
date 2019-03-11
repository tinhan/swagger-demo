package com.demo.api.controller;

import com.demo.api.domain.ErrorResponse;
import com.demo.api.domain.TrackingResponse;
import com.demo.api.service.ThaiPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/ThaiPost")
public class ThaiPostController {

	@Autowired
	ThaiPostService thaiPostService;

	@ApiOperation(value = "Get Tracking Detail by tracking number", nickname = "Get Tracking Detail", response = List.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "SUCCESS", response = TrackingResponse.class),
			@ApiResponse(code = 403, message = "NOT_FOUND", response = ErrorResponse.class),
			@ApiResponse(code = 404, message = "NOT_FOUND", response = ErrorResponse.class),
			@ApiResponse(code = 500, message = "FAILURE", response = ErrorResponse.class) })
	@RequestMapping(value = "/tracking/{tracking_no}",method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Object> getTrackingDetail(@ApiParam("The tracking number") @PathVariable String tracking_no) {
		return thaiPostService.getTrackingDetail(tracking_no);
	}

	@ApiOperation(value = "Get Tracking List by mobile number", nickname = "Get Tracking List", response = List.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "SUCCESS", response = TrackingResponse.class),
			@ApiResponse(code = 403, message = "NOT_FOUND", response = ErrorResponse.class),
			@ApiResponse(code = 404, message = "NOT_FOUND", response = ErrorResponse.class),
			@ApiResponse(code = 500, message = "FAILURE", response = ErrorResponse.class) })
	@RequestMapping(value = "/customer/{mobile}/tracking_list", method = RequestMethod.GET,  produces = "application/json")
	public ResponseEntity<Object> getTrackingList(@ApiParam("mobile number format: XXXXXXXXXX") @PathVariable String mobile) {
		return thaiPostService.getTrackingList(mobile);
	}
	
}

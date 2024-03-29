package com.abus.tx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abus.tx.dto.FlightBookingAcknowledgement;
import com.abus.tx.dto.FlightBookingRequest;
import com.abus.tx.service.FlightBookingService;



@RestController
@RequestMapping("/api/v1")
public class FlightBookingController {
	

	@Autowired
	private FlightBookingService service;

	@PostMapping( value = "/bookFlightTicket")
	public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request) {
		return service.bookFlightTicket(request);
	}

}

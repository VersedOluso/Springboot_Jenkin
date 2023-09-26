package com.amdocs.springboot_jenkin.connector;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class display {
	
	@GetMapping("/get")
	public String show() {
		return "Name: Vedant Harischandre.	Unit:AQE	 Email:	VedantHarischandre@amdocs.com";
	}

}

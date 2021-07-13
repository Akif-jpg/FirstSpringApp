package com.kindsonthegenius.fleetap.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobTitleController {
	@GetMapping("/jobTitles")
	public String getJobTitles() {
		return "JobTitle";
	}
}
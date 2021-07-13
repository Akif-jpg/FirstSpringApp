package com.kindsonthegenius.fleetap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

		@GetMapping("/index")
		public String goHome() {
			return "index";
		}
		@GetMapping("/index.html")
		public String goHome2() {
			return "index";
		}
}

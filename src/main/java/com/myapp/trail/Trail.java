package com.myapp.trail;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Trail {
	@GetMapping(value="trail")
	public String trail() {
		return "deployment the project";
	}

}

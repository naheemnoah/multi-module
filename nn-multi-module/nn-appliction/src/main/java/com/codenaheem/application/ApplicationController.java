package com.codenaheem.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codenaheem.library.service.MyService;

@RestController
public class ApplicationController {
	
	private final MyService myService;
	
	public ApplicationController(MyService myService) {
	    this.myService = myService;
	  }

	  @GetMapping("/")
	  public String home() {
	    return myService.message();
	  }

}

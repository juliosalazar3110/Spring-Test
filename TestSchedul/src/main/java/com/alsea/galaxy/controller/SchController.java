package com.alsea.galaxy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alsea.galaxy.service.SchService;


@RestController
public class SchController {

	@Autowired
	private SchService schService;
	
	 @RequestMapping(value = "/a/" ,method = RequestMethod.GET)
	 public String welcome() {
		 System.out.println("=");
	       return schService.getValor();
	    }
}

package com.alsea.galaxy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alsea.galaxy.conf.ObjectBean;


@Service
public class SchService {

	@Autowired
	private ObjectBean objectBean;
	
	public String getValor() {
		return "valor "+objectBean.getProperty();
	}
}

package com.alsea.galaxy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.alsea.galaxy.conf.ObjectBean;

@Configuration
public class ConfiguracionBeans {

	@Bean
	public ObjectBean prototypeBean() {
		System.out.println("creacion del bean");
		return getPropiedadBean();
	}
	
	private ObjectBean getPropiedadBean() {
		return new ObjectBean("prototipo de bean");
	}

	
}

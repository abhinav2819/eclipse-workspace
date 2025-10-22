package com.springcore.noXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration()
public class JavaConfig_noXML {

	@Bean
	public Money getMoney() {
		return new Money();
	}
	//Hear we assigned the name of the bean as much we want different names(arrays)
	@Bean(name = {"comman_man","temp","voom"})
	public CommanMan getCommanMan() {
		// Creating a new commanMan object
		CommanMan commanMan = new CommanMan(getMoney());
		return commanMan;
	}
}

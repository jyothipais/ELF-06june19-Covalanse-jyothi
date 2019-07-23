package com.covalense.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.covalense.spring.bean.Dell;
import com.covalense.spring.bean.Hp;
import com.covalense.spring.interfaces.Laptop;

@Configuration
public class LaptopConfig {
	@Bean(name = "dell")
	public Laptop getdell() {
		return new Dell();
	}// End of getdell()

	@Bean(name = "hp")
	public Laptop getHP() {
		return new Hp();
	}// End of getHP()

}

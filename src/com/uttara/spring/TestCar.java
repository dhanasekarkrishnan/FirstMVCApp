package com.uttara.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();
	  Car c1 = (Car) ctx.getBean("nano");
	  c1.drive();
	}

}

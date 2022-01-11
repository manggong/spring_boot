package com.study.springboot.bean;

import org.springframework.stereotype.Component;

@Component("PrinterA")
public class PrinterA implements Printer {

	@Override
	public void print(String message) {
		System.out.println("Printer A: " + message);
	}

}

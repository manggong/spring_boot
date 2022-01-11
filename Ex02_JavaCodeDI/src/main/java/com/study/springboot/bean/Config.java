package com.study.springboot.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	// bean: Spring이 IoC 방식으로 관리하는 객체
	// BeanFactory: 스프링의 IoC를 담당하는 핵심 컨테이너
	// ApplicationContext: 빈 팩토리를 확장한 IoC 컨테이너
	
	@Bean
	public Member member1() {
		// Setter Injection (Setter 메소드를 이용한 의존성 주입 )
		Member member1 = new Member();
		member1.setName("김지환");
		member1.setNickname("백수킴");
		member1.setPrinter(new PrinterA());
		
		return member1;
	}
	
	@Bean(name="hello")
	public Member member2() {
		// Constructor Injection 
		return new Member("kim", "none", new PrinterA());
	}
	
	@Bean
	public PrinterA printerA() {
		return new PrinterA();
	}
	
	@Bean
	public PrinterB printerB() {
		return new PrinterB();
	}
}

package com.sist.anno01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:anno01.xml");
		
		Required required = (Required)ctx.getBean("required");//object 타입으로 ㅂ나환되기떄문에 형변환ㅇ...
		required.prn();
		
		ctx.close();

	}

}

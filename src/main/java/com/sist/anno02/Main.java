package com.sist.anno02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:anno02.xml");
		
		UseClass use = (UseClass)ctx.getBean("useclass");
		
		use.implcall();
		ctx.close();

	}

}

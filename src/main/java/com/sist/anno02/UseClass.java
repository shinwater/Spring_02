package com.sist.anno02;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

/*
 * @Autowired 애노테이션
 *  - 생성자, 필드(프로퍼티), 설정 메서드, 일반메서드에 지정 가능.
 *  - @Autowired 애노테이션은 타입을 이용해서 자동적으로 프로퍼티에 값을 설정 함..........
 *  - @Autowired(required=false)로 지정하면 해당 타입의 Bean 객체가 존재하지 않더라도 스프링을 예외를 발생시키지않음.
 *  		기본값은 @Autowired(required=true)
 *  - 해당 타입의 빈(Bean) 객체가 존재하지 않거나 또는 Bean 객체가 두개 이상 존재할 경우에는 예외 발생.
 */


@Data
public class UseClass {

	@Autowired
	private ImplClass impl;
	
	public void implcall() {
		this.impl.print();
	}
}

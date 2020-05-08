package com.sist.anno01;

public class Required {

	private int number;

	public int getNumber() {
		return number;
	}
	
	@org.springframework.beans.factory.annotation.Required 
	//설정 파일(xml)에서  number에 값을 설정하지 않을경우에 예외가 발생
	//메서드에서만 표시 가능(프로퍼티 표시 불가능)
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void prn() {
		System.out.println("number==>" +number);
	}
}

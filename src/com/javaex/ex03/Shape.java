package com.javaex.ex03;

public class Shape {
	// 변수 private으로 막혀 있어 triangle 클래스에서 fillColor, lineColor 못씀 
	// -> private을 protected로 바꾸기!
	protected String fillColor;
	protected String lineColor;

	
	//triangle class 생성자에서 부모 생성자 지정 안해줘서 부모 디폴트 생성자 들어가는데
	//Shape의 디폴트 생성자 삭제되어 없음. -> 디폴트 생성자 만들기
	public Shape() {		
	}
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	
	
	
	
	
	
}


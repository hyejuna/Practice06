package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User c01 = new Customer("jws", "j1234", "정우성", 1000);
		User c02 = new Customer("yjs", "y2345", "이효리", 2000);
		User e01 = new Employee("master", "m7788", "운영자", 5000000);
		
		User[] uArray = new User[3];
		uArray[0] = c01;
		uArray[1] = c02;
		uArray[2] = e01;
		
		for(int i=0; i<uArray.length; i++) {
			uArray[i].showInfo();
		}
		
		// 다운캐스팅 왜 안돼지??
		System.out.println(e01.getName()+ "의 월급은 " +((Employee)e01).getSalary()+ " 입니다.");
	}

}

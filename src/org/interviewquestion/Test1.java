package org.interviewquestion;

public class Test1 {
	private void test1() {
		System.out.println("print the emp details");
		
	}
	private void test1(String name) {
		System.out.println("emp name is"+name);
		
	}
	private void test1(String surname, int age) {
		System.out.println("emp surname is"+surname);
		System.out.println("emp age is"+age);
		
	}
	private void test1(int pincode, String addr) {
		System.out.println("emp pin code is"+pincode);
		System.out.println("emp address is"+addr);
		
	}
	public static void main(String[] args) {
		Test1 a=new Test1();
		a.test1();
		a.test1("vasanth");
		a.test1("a",25);
		a.test1(60019,"chennai");
	
	}
	
	
	

}

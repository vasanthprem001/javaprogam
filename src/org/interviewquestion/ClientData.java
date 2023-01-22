package org.interviewquestion;

public class ClientData implements Test2{
	@Override
	public void password() {
		System.out.println("emp password is 123455");
	}
	@Override
	public void id() {
		System.out.println("emp id is ece345");
	}
	@Override
	public void empName() {
		System.out.println("enter the empp name");
	}
	public static void main(String[] args) {
		ClientData b=new ClientData();
		b.empName();
		b.password();
		b.id();
	}
	
}

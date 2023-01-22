package org.Interviewprepartion;

public class CharCount {
	public static void main(String[] args) {
		String s="MadAM12$%14#";
		int Upper=0, Lower=0, Number=0, Special=0;
		for (int i = 0; i <s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				Upper++;
			}
				else if (Character.isLowerCase(c)) {
					Lower++;
				}
					else if (Character.isDigit(c)) {
						Number++;
						
					}else {
						Special++;
					}	
		}
		System.out.println("upper count"+Upper);
		System.out.println("lower count"+Lower);
		System.out.println("number Count"+Number);
		System.out.println("special count"+Special);
	}

}

package org.interviewquestion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String name="silent";
		String name1="listen";
		if (name.length()==name1.length()) {
			char[] arr = name.toCharArray();
			char[] brr = name1.toCharArray();
			Arrays.sort(arr);
			Arrays.sort(brr);
			if (Arrays.equals(arr, brr)) {
				System.out.println("Is an anagram");
			}
			else {
				System.out.println("not an anagram");
			}
			
		}
		else {
			System.out.println("not an anagram");

		}
			
	}

}


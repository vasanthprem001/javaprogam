package org.Interviewprepartion;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfWords {
	public static void main(String[] args) {
		String s="Greens";
		Map<Character,Integer> m=new LinkedHashMap<Character,Integer>();
		System.out.println(m);
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (m.containsKey(c)) {
				Integer count = m.get(c);
				m.put(c, count+1);
				
			} else {
				m.put(c,1);

			}
		}
		
		System.out.println(m);
	}

}

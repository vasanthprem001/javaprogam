package org.Interviewprepartion;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfWords1 {
	public static void main(String[] args) {
		String s="java is simple java is easy";
		Map<String, Integer> mp=new LinkedHashMap<String, Integer>();
		String[] split = s.split("");
		for (String c : split) {
			if (mp.containsKey(c)) {
				Integer count = mp.get(c);
				mp.put(c, count+1);
			}else {
				mp.put(c, 1);
			}
		}
		System.out.println(mp);
	}

}

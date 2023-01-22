package org.interviewquestion;

import java.util.*;
import java.util.Map.Entry;
public class ListTest {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(23);
		li.add(98);
		li.add(45);
		System.out.println(li);
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
			
		}
//		Map<Integer, String> m=new TreeMap<Integer, String>();
//		m.put(10, "name");
//		m.put(20, "age");
//		m.put(60, "surname");
//		m.put(40, "addr");
//		Set<Entry<Integer, String>> entrySet = m.entrySet();
//		for (Entry<Integer, String> entry : entrySet) {
//			System.out.println(entry);
//			}
//		Set<Integer> keySet = m.keySet();
//		System.out.println(keySet);
//		for (Integer integer : keySet) {
//			System.out.println(integer);
//			}
//		Collection<String> values = m.values();
//		System.out.println(values);
//		for (String string : values) {
//			System.out.println(string);
//		}
//		
		
		
//		Set<String> s=new TreeSet<String>();
//		s.add("name");
//		s.add("age");
//		s.add("addr");
//		s.add("id");
//		System.out.println(s);
//		for (String string : s) {
//			System.out.println(string);
//		}
		
	}

}

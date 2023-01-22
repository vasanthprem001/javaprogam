package org.userdefine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ListUserDefine extends UserDefine{
	public static void main(String[] args) {
		ListUserDefine a=new ListUserDefine();
		a.setId(100);
		a.setName("simbu");
		ListUserDefine b=new ListUserDefine();
		b.setId(200);
		b.setName("mathan");
//		List<UserDefine>li=new ArrayList<UserDefine>();
//		li.add(b);
//		li.add(a);
//		for (UserDefine userDefine : li) {
//			System.out.println(userDefine.getId());
//			System.out.println(userDefine.getName());
//			
//		}
		
	Map<String, UserDefine> m=new HashMap<String, UserDefine>();
		m.put("java", a);
		m.put("Api", b);
		Set<Entry<String, UserDefine>> entrySet = m.entrySet();
		System.out.println(entrySet);
		for (Entry<String, UserDefine> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getId());
			System.out.println(entry.getValue().getName());	
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
////		List<UserDefine>li=new ArrayList<UserDefine>();
//		Set<UserDefine> s=new HashSet<UserDefine>();
//	ListUserDefine a=new ListUserDefine();
//		a.setAddr("chennai");
//		a.setName("java");
//		ListUserDefine b=new ListUserDefine();
//		b.setAddr("madurai");
//		b.setName("seleinum");
//		s.add(a);
//		s.add(b);
//		for (UserDefine userDefine : s) {
//			System.out.println(userDefine.getId());
//			System.out.println(userDefine.getName());
//			
//		}
//	}

}

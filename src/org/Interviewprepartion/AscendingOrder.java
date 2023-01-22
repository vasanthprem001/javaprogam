package org.Interviewprepartion;

public class AscendingOrder {
public static void main(String[] args) {
	int a[]= {5,3,1,2,4};
	System.out.println("before ascending");
	for (int i : a) {
		System.out.println(i);	
	}
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]<a[j])//descending order
			//if(a[i]>a[j])//ascending order
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;		
			}	
		}
	}
	System.out.println("after ascending");
	for (int i : a) {
		System.out.println(i);
		
	}
	
}
}

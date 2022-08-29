package com.question;

public class bubbleshot {
public static void main(String[] args) {
	int i,j;
	String[] str= {"java","python","c","sql"};
	String temp;
	for(i=0;i<str.length;i++) {
		for(j=0;j<str.length-i-1;j++) {
			if(str[j+1].compareTo(str[j])>0) {
				temp = str [j+1];
				str[j]=str[j+1];
				str[j+1]=temp;
			}
			
		}
		System.out.println(j); 
	}
	
	
	
}
}

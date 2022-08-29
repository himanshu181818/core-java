package com.question;

public class Palindron {
public static void main(String[] args) {
	int r,sum=0,temp;
	int n=151;
	temp=n;
	while(n>0) {
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
		
	}
	if(temp==sum)
	System.out.println("palindrome no.");
	else{
		System.out.println("not palindome no.");
	}
	}
}

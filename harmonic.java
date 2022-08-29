package com.question;

public class harmonic {
public static void main(String[] args) {
	int num=80;
	double result=0.0;
	System.out.println("the harmonic serise is:");
	while(num>0) {
		result=result +(double)1/num;
		num--;
		System.out.println(result+",");
	}
}
}

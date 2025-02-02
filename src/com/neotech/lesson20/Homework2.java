package com.neotech.lesson20;

public class Homework2 {
public static String method(String reversed) {
	String reverse="";
	for(int i=reversed.length()-1;i>=0;i--) {
		reverse+=reversed.charAt(i);
	}
	return reverse;	
}
public static String method2(String reversed) {
	StringBuilder sb1=new StringBuilder(reversed);
	String reversed1=sb1.reverse().toString();
	return reversed1;
}
public static void main(String[] args) {
	String day="saturday";
	Homework2.method(day);
	System.out.println(method(day));
	System.out.println(method2(day));
}

}

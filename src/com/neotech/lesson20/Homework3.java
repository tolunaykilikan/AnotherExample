package com.neotech.lesson20;

public class Homework3 {
protected static String method(String srr) {
	String vowels=srr.replaceAll("[^aeiouAEIOU]","" );
	return vowels;
}
	public static void main(String[] args) {
		String sentence="HkjadJKAHDNkhwuhrıwqefnaınHU3RIU23423HU54369459Y03RERLÖWGRETBJH4352324R24364567^'+'^%+^%243";
Homework3 hm3=new Homework3();
String s=hm3.method(sentence);
int a=hm3.method(sentence).length();
System.out.println(s);
System.out.println(a);
	}

}

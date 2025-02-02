package com.neotech.lesson17;

public class StringMethod4 {

	public static void main(String[] args) {
		String sentence = "Never gonna give you up!";
		// contains
		sentence.contains("never");// same as saying-does the sentence string contain this string yes/no true/false
		boolean response = sentence.contains("never");
		// how to check ignoring the case
		System.out.println(sentence.toLowerCase().contains("never"));
		// method chaining is not mandatory,but its very useful
		String lower = sentence.toLowerCase();
		boolean check = lower.contains("never");

		String s1 = "Tuesday";
		String s2 = "tuesday";
		boolean equals = s1.equals(s2);
		System.out.println(equals);
		boolean equals1 = s1.equalsIgnoreCase(s2);
		System.out.println(equals1);
		String s3 = new String("Tuesday");
		System.out.println(s1 == s3);// this is a new string,new reference
		boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2);
		System.out.println(equalsIgnoreCase);
		boolean lower1 = s1.toLowerCase().equals(s2.toLowerCase());
		System.out.println(lower1);
		// startsWith(str)
		boolean b1 = sentence.startsWith("Never");
		System.out.println(b1);
        //endWith(str)
		boolean b2=sentence.endsWith("!");
		System.out.println(b2);
	}

}

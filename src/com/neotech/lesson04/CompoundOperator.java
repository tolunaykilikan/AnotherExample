package com.neotech.lesson04;

public class CompoundOperator {

	public static void main(String[] args) {
		// shorthand operator
		int num=100; // we are  creating a code word with java and that point to the value 100
		System.out.println(num);
 //reassigned the value
		num=150; // still the same code word but now pointing to the value 150
		System.out.println(num);
		num=num+150;//we are adding and reassigning
		System.out.println(num);
		//we have a shorter way to do this aperation we canll compound or shorthand operator
		num +=num+50;// num=num+50;
		System.out.println(num);
		//how can ı do this : num=num-100
		num-=100;
		System.out.println(num);
		num/=5;
		System.out.println(num);
		num*=6;
		System.out.println(num);
		num%=8;
		System.out.println(num);
	}

}

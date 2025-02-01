package com.neotech.lesson03;

public class ArithmeticOperators {
public static void main(String[] args) {
	int num1,num2;//declaring both of those are integers
	//initialize them
	num1=24;
	num2=5;
	int add=num1+num2; //addition
	int sub=num1-num2; //subtraction
	int mult=num1*num2; //multiplication
	int div=num1/num2; //division,lost the decimal part we need to use double or float
	
	System.out.println(add);
	System.out.println(sub);
	System.out.println(mult);
	System.out.println(div);
	double d1,d2;
	d1=24;
	d2=5;
	double divv=d1/d2;
	System.out.println(divv);
	double intResult=num1/num2;
	System.out.println(intResult);
}
}

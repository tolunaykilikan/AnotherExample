package com.neotech.lesson04;

public class IfCondition {

	public static void main(String[] args) {
	//selective execution-depending on a condition a certain code block will get executed
		//structure of if condition
	/*	if(condition) {
			execute these codes here only if the condition is ture
		}*/
		int num=150;
		if(num>200) {
			System.out.println("today is tuesday!");
			
		}
		int num2=5000;
		if(num2<3000) {
			System.out.println("yes you can withdraw "+num2+" dollars!");
		}
		System.out.println("end of code!");//we can see the code finished running
	}

}

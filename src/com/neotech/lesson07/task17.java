package com.neotech.lesson07;

import java.util.Scanner;

public class task17 {

	public static void main(String[] args) {
/*Allow user to enter grade and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
 * At the end your program should print which grade was entered by the user with explanation.
 */
Scanner scanner=new Scanner(System.in);
System.out.println("enter your grade");
char grade=scanner.next().charAt(0);
while(true) {
	if(grade=='A') {
		System.out.println("excellent");
		break;
	}
	else if(grade=='B') {
		System.out.println("good");
		break;
	}
	else if(grade=='C') {
		System.out.println("average");
		break;
	}
	else if(grade=='D') {
		System.out.println("bad");
		break;
	}
	else {
		System.out.println("not acceptable");
		break;
	}
}


	}

}

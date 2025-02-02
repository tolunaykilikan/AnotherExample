package com.neotech.lesson06;

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
	 System.out.println("please enter your gender:(m/f)");
     char gender=scanner.next().charAt(0);
     System.out.println("are you rich?(true/false)");
     boolean rich=scanner.nextBoolean();
     if(gender== 'm') {
    	 System.out.println("its a boy");
    	 if(rich) {
    		 System.out.println("buy a ferrari");
    	 }else {
    		 System.out.println("play soccer ");
    	 }
     }else if(gender=='f') {
    	 System.out.println("its a girl");
    	 if(rich) {
    		 System.out.println("buy a lv bag");
    	 }else {
    		 System.out.println("read a book");
    	 }
    	 
     }else {
    	 System.out.println("invalited gender");
    	 
     }
     scanner.close();
	}

}

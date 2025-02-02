package com.neotech.lesson17;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	    String name=scanner.nextLine();
	    boolean checkName=name.isEmpty();
	    System.out.println(checkName);
        if(name.length()%2==1) {
        	System.out.println("the length of name is: "+name+" is odd!");
        }else {
        	System.out.println("the length of the name is: "+name+" is even");
        }
        if(name.length()>3) {
        String name1=name.substring(name.length()/2,(name.length()/2+1));
        System.out.println(name1);
        }
	}

}

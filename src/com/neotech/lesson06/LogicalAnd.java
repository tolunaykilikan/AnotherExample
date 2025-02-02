package com.neotech.lesson06;

public class LogicalAnd {

	public static void main(String[] args) {
		/*//declare an int
		//if the number is between 1 -- 10 ----> number is small
		//if the number is between 11 -- 100 ---> number is medium
		//if the number is between 101 -- 1000 ---> number is large
		//numbers larger than 1000 are out of range*/
int num=99;
     if(num>=1 && num<=10) {
    	 System.out.println("small");
     }
     else if(num>=11 && num<=100) {
    	 System.out.println("medium");
     }
     else if(num>=101 && num<=1000) {
    	 System.out.println("large");
     }
     else if(num>1000) {
    	 System.out.println("out of range");
     }
     else {
    	 System.out.println("wrong value");
     }
	}

}

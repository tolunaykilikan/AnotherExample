package com.neotech.lesson04;

public class RelationalEqualityOperators {

	public static void main(String[] args) {
		int a=6;
		int b=8;
		System.out.println(a>b);
       System.out.println(a<b);
       int c=8;
       System.out.println(b==c);//= this is assignment operator //== relational operator
       System.out.println(c!=b);
       System.out.println("---------");
       double d1=10.5;
       double d2=8.6;
       boolean result=d1>d2;
       System.out.println(result);
       boolean result2=d1==d2;
       System.out.println(result2);
       boolean result3=d1>=d2;
       System.out.println(result3);
	}

}

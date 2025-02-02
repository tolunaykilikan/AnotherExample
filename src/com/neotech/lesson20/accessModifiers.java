package com.neotech.lesson20;

public class accessModifiers {
//access modifiers
	//public -->access from everywhere
	//protected-->it should be in the same pachage
	//default---> it is almost equal with protected we dont declare it 
	//private--->extremely accessable in the same package
	//formula
	//access modifier data type variable name 
	//optional          must        must
	public static String company;
	public String name;
	protected String lastName;
	//if there is no specified access modifier then its default
	double salary;
	private int ssn;
	public void method1() {
		System.out.println("ım public method!!");
	}
	protected void method() {
		System.out.println("ı have protected");
	}
	void method2() {
		System.out.println("ım default method");
	}
	private void method3() {
		System.out.println("ım private method");
	}
	public static void main(String[] args) {
//we wannt to check what class elements we can access within the same cclass
		accessModifiers am1=new accessModifiers();
		company="neotech";
		am1.name="tolunay";
		am1.lastName="kilikan";
		am1.salary=123432;
		am1.ssn=12344564;
		//within the same class,we can access all type of instance variables(public,protected,default and private)
		am1.method();//we can acess public protected default and private class within the same class
		am1.method1();
		am1.method2();
		am1.method3();
		

	}

}

package com.neotech.lesson20;

public class Package {

	public static void main(String[] args) {
		accessModifiers.company = "neotechh";
		accessModifiers emp = new accessModifiers();
		emp.name = "tolunay";
		emp.lastName = "kilikan";
		emp.salary = 123432;
		// emp.ssn=12344564;//private members are not visible in other classes
		// FOR VARİABLES---> within the same package we can access all expect private
		// vvariables
        //lets check methods
		emp.method();//we can acess public protected default and private class within the same class
		emp.method1();
		emp.method2();
	    //	emp.method3(); this method is private we cannot call it in other class
		//emp.method4();it has different erorr it is not exist----> undefined
		
	}

}

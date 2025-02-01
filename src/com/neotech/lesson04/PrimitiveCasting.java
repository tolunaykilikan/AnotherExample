package com.neotech.lesson04;

public class PrimitiveCasting {

	public static void main(String[] args) {
		//type casting
		//byte->short->long->float->double 
		
		double d1=3.7;//a double is assigbed tı a double type
		System.out.println(d1);
		double d2=5;//casting happened an int was assigned to a double type
		System.out.println(d2);
		
		//compiler error
		//int num=5.5;
		//widening->implicit casting->automatic casting
		float num=4; //this casting happens automatically the value we are casting
		//can easily fit in the bigger data type
	   System.out.println(num);
	//narrowing->explicit casting->manual casting
	int num2=(int)6.5;//if we do this this to be stored in an int
	System.out.println(num2);
	int num3=(int)6.0;//sometimes we dont lose anything
	System.out.println(num3);
	int num4=50;// int has 32 bits
	//byte has 8 bits
	byte b2=(byte)num4;
	System.out.println(b2);
	//another narrowing example
	long L1=17L;
	int num5=(int)L1;//am ı losing anything?? no
	long L2=465146846184L;
	int num6=(int)L2;
	System.out.println(num6);
	//another widening example
	int num7=250;
	float f1=num7; //automatic casting. ı can add(float) but its not necessary
	float f2=num7;
	System.out.println(f1);
	System.out.println(f2);
	
	}

}

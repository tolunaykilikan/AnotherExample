package com.neotech.lesson15;

public class Phone {
// Create a Class "Phone". Create 3 Objects of it: iPhone, Android, Nokia with specific  attributes and behaviors.
	public static void main(String[] args) {
		Phone1 p1=new Phone1();
		Phone1 p2=new Phone1();
		Phone1 p3= new Phone1();
		p1.brand="iphone";
		p1.color="black";
		p1.price=2300;
		p1.size=6.4;
		p1.storage=516;
		p1.year=2024;
		p1.color1();
		p1.storage();
		p1.year();
		p1.storage();
		System.out.println(p1.brand+" "+p1.color+" "+p1.price+" "+p1.storage+" "+p1.year);
		System.out.println("*******************************");
		p2.brand="android";
		p2.color="white";
		p2.price=1500;
		p2.size=7.3;
		p2.storage=256;
		p2.year=2024;
		p2.color1();
		p2.storage();
		p2.year();
		p2.storage();
		System.out.println(p2.brand+" "+p2.color+" "+p2.price+" "+p2.storage+" "+p2.year);
		System.out.println("*******************************");
		p3.brand="nokia";
		p3.color="blue";
		p3.price=750;
		p3.size=5.4;
		p3.storage=128;
		p3.year=2024;
		p3.color1();
		p3.storage();
		p3.year();
		p3.storage();
		System.out.println(p3.brand+" "+p3.color+" "+p3.price+" "+p3.storage+" "+p3.year);
		System.out.println("*******************************");
		

	}

}

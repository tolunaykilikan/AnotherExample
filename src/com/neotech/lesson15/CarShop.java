package com.neotech.lesson15;

public class CarShop {

	public static void main(String[] args) {
// how to instantiate
		//classname identifier=new classname();
		Car car1=new Car();//we create an object using the car template and 
		//we assign it to car1
		car1.make="toyota";
		car1.model="camry";
		car1.year=2024;
		car1.color="blue";
		car1.mileage=2000;
		car1.maxSpeed=250;
		 car1.drive();
		 car1.stop();
		 car1.transportPeople();
      Car car2=new Car();
      car2.make="toyota";
		car2.model="yaris";
		car2.year=2024;
		car2.color="blue";
		car2.mileage=20000;
		car2.maxSpeed=250;
		 car2.drive();
		 car2.stop();
		 car2.transportPeople();
		 Car car3=new Car();//declaration+instatiation
		 Car car4; //just declaration
	}

}

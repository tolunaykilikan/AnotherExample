package com.neotech.lesson15;


	public class Car {
		
		//What features/attributes a car can have?
			//make 	model	color year mileage maxSpeed <-- descriptions
		//All these features can be represented by variables 
		
		//What behaviors does a car do?
			//drive(), stop, transportPeople() 	<-- actions
		//All these behaviors can be represented by methods
		
		//Features 
		String make;
		String model;
		String color;
		int year;
		int mileage;
		int maxSpeed;
		
		
		//Methods (functions)
				//Input(s) --> |   transformation/process	| --> Output
		
		//Behaviors
//		returnType  methodName()
		void drive()
		{ //The process/transformation/action
			System.out.println(make + " " + model + " drives!");
		}
		
		//void --> does not return anything --> void the return
		//if we change void to int --> we must return an int value
		
		void stop() 
		{
			System.out.println(make + " stops!");
		}
		
		void transportPeople()
		{
			System.out.println(make + " can transport people!");
		}
		
		//What is a class?
			//is a blueprint/template/generic structure made of features and behaviors 
		//What is an object?
			//is an instance/example or a class
			//When we create an object of a class it is said that we instantiate the class
		
		
		//How can we create objects from the Car class?
			//We need to instantiate the Car class --> this is usually done in the main method
		
		//Can we create a main method in this class? Yes!
		
		public static void main(String[] args) {
			
			//To understand the instantiation process, let's discuss this example
			//dataType 		indentifier = 		value/variable;
			int 			var 		= 		10;
			
			//Let revisit the Scanner class object!
			//Scanner scan = new Scanner(System.in);
			
			//How can do this for our Car class?
//			ClassName  identifier  =  new ClassName();
			
			Car car1 = new Car();
			//The above line does the followings:
				//(1) declare an object of Car class with the name car1 (an instance/object of Car)
				//(2) new --> instantiates the object
				//(3) initializes the process
			
			//How can I access the features and/or behaviors of car1 instance/object?
			
			car1.make = "BMW";
			car1.model = "X5";
			car1.year = 2020;
			car1.color = "Black";
			car1.mileage = 22000;
			car1.maxSpeed = 240;
			
			System.out.println(car1.make + " " + car1.model + " " + car1.year + " " + 
					" " + car1.color + " " + car1.mileage + " " + car1.maxSpeed);
			
			System.out.println("------------------------");
			
			//Can we re-assign a feature value? Yes!
			car1.mileage = 30000;
			
			System.out.println(car1.make + " " + car1.model + " " + car1.year + " " + 
									" " + car1.color + " " + car1.mileage + " " + car1.maxSpeed);
			
			System.out.println("-------------------");
			//System.out.println(car1); //This is will display the object's address
			
			//Can I access the behaviors/actions?
			car1.drive();
			car1.stop();
			car1.transportPeople();
		} 
	











}

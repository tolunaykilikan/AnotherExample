package com.neotech.lesson15;

//Create a Dog Class and create 3 different objects of it: 
//Husky, Bulldog, Labrador  with specific  attributes and behaviors.
public class Dog {
	public static void Main(String[] args) {
		Dog1 d1 = new Dog1();
		Dog1 d2 = new Dog1();
		Dog1 d3 = new Dog1();
        d1.age=5;
        d1.breed="Husky";
        d1.color="white";
        d1.size="medium";
        d1.breed();
        d1.eat();
        d1.run();
        System.out.println(d1.age+" "+d1.breed+" "+d1.color+" "+d1.size);
        System.out.println("*****************");
        d2.age=5;
        d2.breed="Husky";
        d2.color="white";
        d2.size="medium";
        d2.breed();
        d2.eat();
        d2.run();
        System.out.println(d2.age+" "+d2.breed+" "+d2.color+" "+d2.size);
        System.out.println("*****************");
        d3.age=5;
        d3.breed="Husky";
        d3.color="white";
        d3.size="medium";
        d3.breed();
        d3.eat();
        d3.run();
        System.out.println(d3.age+" "+d3.breed+" "+d3.color+" "+d3.size);
        System.out.println("*****************");
	}
}
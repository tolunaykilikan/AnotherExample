package com.neotech.lesson17;
public class StringMethods {
	public static void main(String[] args) {
		//1st way we used to declare a string----> string literal
		String name="sabah";
		//in this way,java uses a string pool
		//2nd way-declaring a string object
		String name2=new String("yusuf");//using new keyword
		//java will be forced to create a new string reference everytime
		int size=name.length();
		//when I write name--> trying to access something from the string class
		System.out.println("the length of the name is: "+size);
		String school="Neotech";
		System.out.println("the length of the school name is: "+school.length());
		String school2="                 Neotech                 ";
		System.out.println("the length of the school name is: "+school2.length());
		String city="New York";
		String lowerCaseCity=city.toLowerCase();
		System.out.println("---->"+lowerCaseCity);
		System.out.println("------>"+city.toUpperCase());
		//what is the value of the string city
		System.out.println(city); //string objects are immutable,it will not change
		
		city="New York City";//this is a new string ı didnot change new york
		String newCity="New York";//string objects can be declared in two ways
		//string literal
		//using new keyword
		
    
	}

}

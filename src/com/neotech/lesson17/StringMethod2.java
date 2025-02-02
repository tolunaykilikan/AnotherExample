package com.neotech.lesson17;

public class StringMethod2 {

	public static void main(String[] args) {
		// there is string pool in jaava string is inmutebale
//which means if you declare two variables string if these are same Strings the pool takes one of them
		String city = "New York";
		String newCity = "New York";// this is a new variable but its not new string
		String anotherCity=new String("New York");//this is not string literal there is no pool its new string
		String sentence="the size of"+city+"is"+city.length();
		System.out.println(sentence);
		
		String firstName="May";
		String lastName="Obama";
		String fullName=firstName+lastName;
		System.out.println(fullName);
        String fullName2=firstName.concat(lastName);
        System.out.println(fullName2);
        fullName=firstName+" "+lastName;
        System.out.println(fullName);
        fullName2=firstName.concat(" ").concat(lastName);//method chaining
        System.out.println(fullName2);//this is string method if you want to make them together 
        //another method chaining example
        String methodChaining=firstName.concat(" ").concat(lastName).concat(" ").concat(newCity).toLowerCase();
        System.out.println(methodChaining);
        String str=" ";
        System.out.println(str.isBlank());//it returns true or false if its space its true 
        System.out.println(str.length());
        System.out.println(str.isEmpty());//if the length is 0 is true otherwise false
        String str2="                        today is    thursday           and "
        		   +"we are learning                    some really cool               stuff!"
                   +"!            ! ";
        System.out.println("the length before trimming: "+str2.length());
        System.out.println("the length after trimming"+str2.trim().length());
        //trim() is it front and back sentence is blank its removing spaces
        
        
	}

}

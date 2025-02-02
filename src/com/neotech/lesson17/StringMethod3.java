package com.neotech.lesson17;

public class StringMethod3 {

	public static void main(String[] args) {
	String name="Ahmet";
	char letter= name.charAt(0);//this method shows us string's first index
	System.out.println("letter: "+letter);
	//indexOf()  or lastIndexOf()
	int index=name.indexOf('m');//this method take the index number from string
	int index1=name.indexOf('t');
	System.out.println(index+" "+index1);
	//what does it return if the letter is not found? ----> -1
	
	//can we ignore the case while using indexOf
	System.out.println(name.toLowerCase().indexOf('a'));
	String name1="Sabah";
	System.out.println("the index of letter is: "+name1.indexOf('a'));
	//it returns whatever it found first 
	System.out.println("the last index of letter is: "+name1.lastIndexOf('a'));
	//using these methods we could also look for a sun string
	System.out.println("the index of ab is : "+name1.indexOf("ab"));
	
	String message="Today is raining!";
	String substr=message.substring(5);
	//this method takes only 1 paramether-beginning index
	//it assumes that you want to get the part of the string starting there until the end
	//substring can get part of string
	System.out.println(substr);
	String substr2=message.substring(6, 8);
	//this will get substring starting at index 6 and ending at index 8-1
	System.out.println(substr2);
	String substr3=message.substring(0, 5);
	System.out.println(substr3);
	

	}

}

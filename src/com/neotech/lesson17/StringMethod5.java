package com.neotech.lesson17;

public class StringMethod5 {

	public static void main(String[] args) {
		//replace()  and resplaceAll()
		//replace()---> replace(char oldChar,char newChar)--> output string
		String str1="This is a test string ";//if you want to change the char use replace but if you want to 
		//change more than 1 char use replaceall
		System.out.println(str1+"---->"+str1.replace('t', '*'));
		System.out.println(str1+"---->"+str1.replace(' ', '/'));
		System.out.println(str1+"---->"+str1.replace(" ", "-"));
		 //replaceAll()---> replace(String regularexpression,String replaceStr)
		String str2="I love programming in Pyton! I want to learn more about Pyton";
		System.out.println(str2+"----> "+str2.replaceAll("Pyton", "Java"));//here we look for the exact match
		System.out.println(str2+"with no vowels----->"+str2.replaceAll("[aeiou]", "*")); 
		String str="we apologize for not covering replace() and replaceAll() last class!";
		String strUpdate=str.replace(" " , "");
		System.out.println(strUpdate);
		//trim() is used for removing white spaces at the beginning and at the end of a string
		System.out.println("old length: "+str.length()+" new length: "+strUpdate.length());
		//regular expression
		//[0-9]-->any numbers
		//[09]--> only 0 or 9
		//[a-z]--> all lower case letter
		//[A-Z]--> all upper case letter
		//[abc]---> a or b or c 
		//[a-zA-Z]-> all lower and upper letters
		//[0-9a-zA-Z]--->all numbers lower and upper letter
		//[^]--->not [^a-z] not lower letters
		// \d---> any digit
		// . ---> any character
		//\D --->any not digit
		// \s --> any whitespace character---> short for [\t\n\f\r\x0B]
		//\S---> any non whitespace character
		//\s+ ---> one or more spaces
		//\w ---> any word character
		String str4="HelOLkdssd214321342354!'Êefrw+%+^&%+&YDFGDFVsdfjsırweqr2^%+^^+T43ewr456457utyhfh";
		String str5=str4.replaceAll("[^a-zA-Z]","");
		System.out.println(str5);
		System.out.println("old length: "+str4.length()+ " new length: "+str5.length());
		//we cab do this just in one line----> method chaining
		System.out.println("the number of letter in "+str4.replaceAll("[^a-zA-Z]","").length());
	
		
		

	}

}

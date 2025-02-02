package com.neotech.lesson14;

public class Taskk12 {

	public static void main(String[] args) {
		String[][] countries= {
				{"canada","usa","mexico","cuba"},
				{"argentina","bolivia","brazil","colombia"},
				{"turkiye","germany","italy","spain"},
				{"china","japan","korea","india"},
				{"angola","burundi","cameroon","benin"}
		};
		for(int i=0;i<countries.length;i++) {
			for(int j=0;j<countries[0].length;j++) {
				System.out.print("["+i+"]["+j+"]");
				System.out.print(countries[i][j]+" ");
			}System.out.println();
		}System.out.println();
		int sum=0;
		for(String[] country:countries) {
			sum+=country.length;
		}System.out.println("total number of countries: "+sum);
	}

}

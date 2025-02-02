package com.neotech.lesson14;

public class RetrievingVaLues {

	public static void main(String[] args) {
		String[][] animals= {
				{"cat","dog","bird"},
				{"tiger","lion","bear"},
				{"salmon","shrimp","seabass"}	
		};
		//initialization;condition;increment
		for(int row=0;row<animals.length;row++) {//0,1,2
			for(int col=0;col<animals[row].length;col++) {//0,1,2
				System.out.print(animals[row][col]+" ");
			}System.out.println();
		}
		//using for each
		System.out.println("-------------");
		//animals has--> 3 rows
		//row0 has-->3 colomns
		//row1 has --> 3 colomns
		//row2 has---->3 colomns
		for(String[] row : animals)//animals is 2d array
		{
			for(String col:row) {
				System.out.print(col+" ");
			}System.out.println();
		}
	}

}

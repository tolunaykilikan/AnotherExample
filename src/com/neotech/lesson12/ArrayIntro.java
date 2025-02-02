package com.neotech.lesson12;

public class ArrayIntro {

	public static void main(String[] args) {
		 int [] grades=new int[4];
		 //length is 4 but we have 3 index 0-1-2-3
		 
		 grades [2]=98;
         grades[0]=90;
         grades[3]=85;
         grades[1]=93;
         int size=grades.length; //the size of the array is 4
         //the index of the last element is 3
         int total=0;
         for(int i=0;i<grades.length;i++) {
        	 total+=grades[i];
        	
         }
         System.out.println(total);
	
	
	//2nd way
	int[] grades2= {90,93,98,85};
	int total2=0;
	// get the elements from the array one by one, from the first to the last
	for(int num:grades2) {
		total2+=num;
		
	}
	System.out.println(total2);

}
}
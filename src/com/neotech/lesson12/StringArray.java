package com.neotech.lesson12;

public class StringArray {

	public static void main(String[] args) {
		String[] animals= {"cat","dog","monkey","tolunay","fish","asd","vxcvz","rewerwer"};
		//length/size is 5 but index is 4
for(int i=0;i<animals.length;i++) {
	System.out.print(animals[i]+",");
}
System.out.println();
	
	//advanced/enchange for loop
	for(String element:animals) {
		System.out.print(element+" ");
	}
	System.out.println();
	System.out.println("reverse order");
	//the index of the last element is animals.length-1
	for(int i=animals.length-1;i>=0;i--) {
		System.out.print(animals[i]+" ");
	}
	System.out.println();

	
	
	
	
}
}
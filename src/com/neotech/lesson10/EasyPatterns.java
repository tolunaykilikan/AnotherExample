package com.neotech.lesson10;

public class EasyPatterns {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			System.out.print("*");
		}System.out.println();
		for(int i=0;i<4;i++) {
			System.out.print("*");
		}System.out.println();
		for(int i=0;i<3;i++) {
			System.out.print("*");
		}System.out.println();
		for(int i=0;i<2;i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i=0;i<1;i++) {
			System.out.print("*");
		}
		//repeating codes is always impractical in pragramming
		//so,we use nested loops for such cases
		for(int row=5;row>0;row--) {//5,4,3,2,1 //0 to 5
			for(int col=0;col<row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

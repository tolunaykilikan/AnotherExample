package com.neotech.lesson12;

public class CountingBackwards {

	public static void main(String[] args) {
		for(int row=1;row<=4;row++) {
			for(int col=4;col>=1;col--) {
				System.out.print(col);
			}
			System.out.println();
		}

	}

}

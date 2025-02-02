package com.neotech.lesson20;

import java.util.Scanner;

public class Homework1 {
protected int method(int[] array) {
	int sum=0;
	for(int arr:array) {
		sum+=arr;
	}
	return sum;
}
	public static void main(String[] args) {
		int[] arr= {1,23,4,45,54,3,234,3};
	Homework1 hm1=new Homework1();
	System.out.println(hm1.method(arr));

	}

}

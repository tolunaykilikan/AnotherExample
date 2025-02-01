package com.neotech.lesson04;

public class IfElse {
public static void main(String[] args) {
	//let us assume ı have only 500$ in my account
	int myBalance=500;
	int myRequest=1000;
	if(myRequest<=myBalance) { //ı have more money than ı request
		System.out.println("cool,enjoy shopping");
	}
	else { //ım requesting more than ı have on balance
		System.out.println("you are requesting "+myRequest+" doolars but you only have "+myBalance+" dollars");
	}
}
}

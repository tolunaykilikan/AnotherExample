package com.neotech.lesson10;

public class PrintHours {

	public static void main(String[] args) {
		for(int hour=0;hour<24;hour++) {
			//System.out.println(hour);
			for(int min=0;min<60;min++) {
				//System.out.println(hour+":"+min);
				//the above statement has the follwing issues:
				//1.when hour<10 and min<10>1:1>01:01
				//2.when hour<10 and min>=10 >1:10 >01:10
				//3.when hour>=10 and min<10 >10:1 >10:01
				//4.when hour and min >=10 > nothing to change
				if(hour<10 && min<10) {
					System.out.println("0"+hour+":"+min);
					
				}else if (hour<10 && min>=10){
					System.out.println("0"+hour+":"+min);
				}else if(hour>=10 && min<10) {
					System.out.println(hour+":0"+min);
				}
				else {
					System.out.println(hour+":"+min);
				}
			}
		}

	}

}

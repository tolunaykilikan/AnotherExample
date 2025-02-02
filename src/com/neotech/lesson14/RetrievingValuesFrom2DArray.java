package com.neotech.lesson14;

public class RetrievingValuesFrom2DArray {

	public static void main(String[] args) {
	String [][] months= {
			{"december","january","february"},
			{"march","april","may"},
			{"june","july","august"},
			{"september","october","november"}
	};
	int rows=months.length;//return the number of rows
	System.out.println(rows);
	int col=months[0].length;//return the number of columns on row 0
	System.out.println(col);
for(int i=0;i<rows;i++) {
	for(int j=0;j<col;j++) {
		System.out.print("["+i+"]["+j+"]"+months[i][j]+" ");
	}System.out.println();
}
	}

}

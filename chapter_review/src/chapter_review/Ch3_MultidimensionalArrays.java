package chapter_review;

public class Ch3_MultidimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Display something pointy with multidimensional arrays
		int values[]  = { 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1 };
		int thingy[][]= new int[values.length][];
		for (int i = 0; i < values.length; i++) {
			thingy[i] = new int[values[i]]; // Assigns amount of columns
			//System.out.println("The amount of columns for thingy[" + i + "] is " + values[i]);
			for ( int j = 0; j < thingy[i].length; j++) {// This will get the amount of columns, without the [0] you get amount of rows
				int k = 1;
				thingy[i][j] = k; // With this I will assign values to the array as it's built
				k++;
			}
		}
		for ( int i = 0; i<thingy.length; i++) {
			for ( int j = 0; j < thingy[i].length; j++) { // this will iterate through the array
				System.out.print(thingy[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}

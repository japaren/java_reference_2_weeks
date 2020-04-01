package chapter_review;

public class Ch3_Promotion {
	public static void main( String args[]) {
		byte b = 50;
		//b = b*2; would be wrong
		// You need to do the transformation in the expression if you want it to be stored as byte, short or char since
		// they are automatically promoted to int;
		b = (byte) (b * 2);
		
	}
}

package chapter_review;

import java.util.Random;

public class Ch6_OwnStackTest {
	public static void main( String args[] ) throws java.io.IOException {
		System.out.println("Tell me how big the stack can get: ");
		int stackSize =  System.in.read();
		Ch6_OwnStack stck1 = new Ch6_OwnStack(stackSize);
		int values [] = new int[stackSize];
		Random rand = new Random();
		for( int i = 0; i < stackSize; i++ ) {
			values[i] = rand.nextInt(100) +1;
		}

		for(int i = 0; i < stackSize; i++) {
			stck1.push(values[i]);
		}
		for(int i = 0; i < stackSize; i++) {
			System.out.println(stck1.pop());
		}
		
	}

}

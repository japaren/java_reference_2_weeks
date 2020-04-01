package chapter_review;

import java.io.IOException;

public class Ch5_EnhancedForInput {
	public static void main( String args[] ) throws IOException {
		int values[] = { 5, 2 , 3, 4, 6, 10, 42, 57 };
		int soma = 0;
		for( int x : values) { // This is the enhanced method to go through the values
			soma += x;
		}
		System.out.println("The sum of this array is: " + soma);
		
			int a = 10, b = 20;
			char choice;
			do {
				System.out.println(" Dado que a = " + a + " e b = " + b);
				System.out.println(" Escolha a operação desejada");
				System.out.println(" 1- Sum\n 2- Subtract\n 3- Multiply\n 4- Divide");
				choice =  (char) System.in.read();
			} while ( choice < '1' | choice > '4');
			System.out.println("\n");
			
			switch(choice) {
			case '1': System.out.println("a + b = " + (a+b));
			break;
			case '2': System.out.println("a - b = " + (a-b));
			break;
			case '3': System.out.println("a * b = " + (a*b));
			break;
			case '4': System.out.println("a / b = " + (a/b));
			break;
			}
		
			
	}

}

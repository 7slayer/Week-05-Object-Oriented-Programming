package objectOrientedProgramming;

import java.util.Scanner;

public class App {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Put in a word: ");
		StringBuilder input = new StringBuilder(in.next());
		
		Logger ast = new AsteriskLogger();
		Logger space = new SpacedLogger();
		
		ast.Log(input);
		ast.error(input);
		space.Log(input);
		space.error(input);
		
		in.close();
	}
	
}

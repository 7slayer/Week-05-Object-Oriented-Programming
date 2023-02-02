package objectOrientedProgramming;

import java.util.Scanner;

public class App {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		Logger ast = new AsteriskLogger();
		Logger space = new SpacedLogger();
		
		System.out.print("Put in a word: ");
		StringBuilder input = new StringBuilder(in.next());
		
		
		
		ast.Log(input);
		ast.error(input);
		space.Log(input);
		space.error(input);
		
		in.close();
	}
	
}

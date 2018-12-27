package BJ_11721;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String txt = in.nextLine();
		
		for(int i = 0; i < txt.length(); i++) {
			System.out.print(txt.charAt(i));
			if( i % 10 == 9)
				System.out.println();
		}
	}
}

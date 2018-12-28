package Recursive_printCharReverse;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		System.out.println("This problem is printed the text to reverse");
		System.out.println("TEXT : ");
		Scanner in = new Scanner(System.in);
		printChars(in.nextLine());
		in.close();
	}
	public static void printChars(String str) {
		if(str.length() == 0)	return;
		printChars(str.substring(1));
		System.out.println(str.charAt(0));
	}
}

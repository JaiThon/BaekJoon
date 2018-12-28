package Recursive_length;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		System.out.println("This problem is printed size of text");
		System.out.println("TEXT : ");
		Scanner in = new Scanner(System.in);
		System.out.println(length(in.nextLine()));
		in.close();
	}
	public static int length(String str) {
		if(str.equals(""))
			return 0;
		return 1 + length(str.substring(1));
	}
}

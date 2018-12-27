package Recursive_printInBinary;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("This program transfer to binary code");
		System.out.println("Input number : ");
		int numb = in.nextInt();
		printInBinary(numb);
		}
	public static void printInBinary(int numb) {
		if(numb < 2)
			System.out.println(numb);
		else {
			printInBinary(numb/2);
			System.out.println(numb%2);
		}
	}
}

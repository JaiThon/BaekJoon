package BJ_2441;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		
		for(int i = 0; i < size; i++) {
			for(int j = size - i; j < size; j++)
				System.out.print(" ");
			for(int j = size - i; j > 0; j--)
				System.out.print("*");
			System.out.println();
		}
	}
}

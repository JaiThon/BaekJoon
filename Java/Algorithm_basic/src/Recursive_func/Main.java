package Recursive_func;

import java.util.Scanner;
/*
 * Recursive basic 
 */
public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("This program outputs from 1 to n");
		System.out.println("Input n : ");
		System.out.println(func(in.nextInt()));
	}
	public static int func(int n) {
		if(n == 0)
			return 0;
		else
			return n + func(n-1);
	}
}

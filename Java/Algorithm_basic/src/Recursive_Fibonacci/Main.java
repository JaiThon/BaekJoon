package Recursive_Fibonacci;

import java.util.Scanner;

/**
 * Fibonacci number
 * f0 = 0
 * f1 = 1
 * fn = fn-1 + fn-2 (n>1)
 */
public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println(Fibonacci(in.nextInt()));
		in.close();
	}
	public static int Fibonacci(int n) {
		if(n < 2)
			return n;
		else
			return Fibonacci(n-1) + Fibonacci(n-2);
	}
}

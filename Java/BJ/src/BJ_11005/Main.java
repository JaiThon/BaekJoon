package BJ_11005;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack<Integer>();
		int N = sc.nextInt();
		int B = sc.nextInt();
		toB(N,B,stack);
		while(!stack.isEmpty()) {
			int n = (int) stack.pop();
			if(n < 10)
				System.out.print(n);
			else 
				System.out.print((char)n);
		}
	}
	public static void toB(int N, int B, Stack<Integer> stack) {
		while(N != 0) {
			if(N%B < 10)
				stack.push(N%B);
			else 
				stack.push(N%B -10+ 'A');
			N /= B;
		}
	}
}

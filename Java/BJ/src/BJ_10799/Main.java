package BJ_10799;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		String stick = sc.nextLine();
		int result = 0;
		for(int i = 0; i < stick.length(); i++) {
			char ch = stick.charAt(i);
			if(ch == '(')
				stack.push(i);
			else {
				if(stack.peek().equals(i-1)) {
					stack.pop();
					result += stack.size();
				}
				else {
					stack.pop();
					result++;
				}
			}
		}
		System.out.println(result);
	}
}

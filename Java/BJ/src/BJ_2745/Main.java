package BJ_2745;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int result = 0;
		int B = sc.nextInt();

		for(int i = 0; i < N.length(); i++) {
			int ch = (int) N.charAt(i);
			if(ch <= 58 && ch >= 48)
				result += (ch - 48) * Math.pow(B, N.length()-(i+1));
			else {
				result += (ch - 65 + 10)* Math.pow(B, N.length()-(i+1));
			}
		}
		System.out.println(result);
	}
}

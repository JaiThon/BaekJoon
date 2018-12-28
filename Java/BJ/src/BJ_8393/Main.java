package BJ_8393;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int numb = in.nextInt();
		int result = 0;
		for(int i = 1; i <= numb; i++)
			result += i;
		System.out.println(result);
	}
}

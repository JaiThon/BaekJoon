package BJ_10824;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		String C = sc.next();
		String D = sc.next();
		
		String AB = A+B;
		String CD = C+D;
		
		System.out.println(Long.parseLong(AB)+Long.parseLong(CD));
	}
}

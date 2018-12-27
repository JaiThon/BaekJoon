package BJ_2609;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int g = gcd(Math.max(a, b),Math.min(a, b));
		System.out.println(g);
		System.out.println(lcm(a,b,g));
	}
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		else {
			return gcd(b, a%b);
		}
	}
	public static long lcm(int a, int b, int g) {
		return (g * (a/g) * (b/g));
	}
}

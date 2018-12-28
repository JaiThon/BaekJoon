package BJ_11052;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] p = new int[N+1];
		int[] dp = new int[N+1];
		
		for(int i = 1; i < N+1; i++)
			p[i] = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= i; j++) {
				dp[i] = Math.max(p[j] + dp[i-j], dp[i]);
			}
		}
		System.out.println(dp[N]);
	}
}

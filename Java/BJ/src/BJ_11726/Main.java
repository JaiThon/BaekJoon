package BJ_11726;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int dp[] = new int[size+1];
		
		dp[0] = 1; dp[1] = 1;
		for(int i = 2; i <= size; i++)
			dp[i] = (dp[i-1] + dp[i-2]) % 10007;
		System.out.println(dp[size]);
	}
}

package BJ_9461;

import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();
		for(int t = 0; t < test_case; t++) {
			int N = in.nextInt();
			long dp[] = new long[N+3];
			dp[0] = 1;
			dp[1] = 2;
			for(int i = 2; i <= N; i++){
				if(i >= 7)
					dp[i] = dp[i-1] + dp[i-5];
				else if(i >= 5)    
					dp[i] = dp[i-1] + dp[1];
				else
					dp[i] = dp[i-1] + dp[0];
			}
			if (N > 5)    
				System.out.println(dp[(N - 4)]);
			else if(N <= 3)    
				System.out.println(dp[0]);
			else          
				System.out.println(dp[1]);
		}
	}
}
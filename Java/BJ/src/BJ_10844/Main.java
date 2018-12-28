package BJ_10844;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long dp[][] = new long[N][10];
		long mod = 1000000000;
		
		dp[0][0] = 0;
		for(int i = 1; i < 10; i++)
			dp[0][i] = 1;
		for(int i = 1; i < N; i++) {
			for(int j = 0; j <= 9; j++) {
				if(j > 0 && j < 9)
					dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % mod;
				else if(j == 0)
					dp[i][0] = dp[i-1][1] % mod;
				else if(j == 9)
					dp[i][9] = dp[i-1][8] % mod;
			}
		}
		long ans = 0;
		for(int i = 0; i <= 9; i++)
			ans+= dp[N-1][i];
		System.out.println(ans% mod);
	}
}

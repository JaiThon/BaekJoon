package BJ_1463;

import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int numb = in.nextInt();
		int dp[] = new int[numb+1];
		dp[0] = dp[1] = 0;
		for(int i = 2; i <= numb; i++) {
			dp[i] = dp[i-1] + 1;
			if(i % 2 == 0 && dp[i] > dp[i/2] +1)
				dp[i] = dp[i/2]+1;
			if(i % 3 == 0 && dp[i] > dp[i/3] +1)
				dp[i] =  dp[i/3]+1;
		}
		System.out.println(dp[numb]);
	}
}
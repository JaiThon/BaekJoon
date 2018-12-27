package BJ_1912;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tmp {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int original_list[] = new int[N];
		int dp[] = new int[N];
		
		for(int i = 0; i < str.length; i++)
			original_list[i] = Integer.parseInt(str[i]);
		
		int max = original_list[0];
		dp[0] = max;

		for(int i = 1 ; i < original_list.length; i++) {
			dp[i] = Math.max(dp[i-1] + original_list[i], original_list[i]);
			if( dp[i] > max) max = dp[i];
		}
		System.out.println(max);
	}
}

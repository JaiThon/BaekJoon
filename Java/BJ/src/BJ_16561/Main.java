package BJ_16561;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int count = 0;
		if(N < 9)
			System.out.println(0);
		else
			for(int i = 3; i <= N - 6; i += 3) {
				for(int j = 3; i+j <= N - 3; j += 3) {
					for(int t = 3; t+i+j <= N; t += 3) {
						if(i + j + t > N) break;
						else if(i+j+t == N)
							count++;
					}
				}
			}
		System.out.println(count);
	}
}

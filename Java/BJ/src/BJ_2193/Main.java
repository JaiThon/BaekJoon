package BJ_2193;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		long d[] = new long[size+1];
		
		d[0] = 0; d[1] = 1;
		for(int i =2; i < size+1; i++)
			d[i] = d[i-2] + d[i-1];
		System.out.println(d[size]);
	}
}
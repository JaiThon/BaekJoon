package BJ_1016;

import java.util.Scanner;
import java.math.BigInteger;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long min = in.nextLong();
		long max = in.nextLong();
		
		long free  = Runtime.getRuntime().freeMemory();
		long total = Runtime.getRuntime().totalMemory();
		long maix   = Runtime.getRuntime().maxMemory();

		in.close();
		
		ArrayList<Long> list = new ArrayList<Long>();
		for(int i = 2 ; i <= Math.sqrt(max); i++) {
			for(int j = 1; ; j++) {
				if((i*i)*j <= max)
					list.add((long) ((i*i))*j);
				else
					break;
			}
		}
		System.out.println(list);
		System.out.println(max-min-list.size()+1);
		System.out.format("Total Memory : %6.2f MB%n", (double) total / (1024 * 1024));
		System.out.format("Free  Memory : %6.2f MB%n", (double) free  / (1024 * 1024));
		System.out.format("Max   Memory : %6.2f MB%n", (double) maix   / (1024 * 1024));
	}
}
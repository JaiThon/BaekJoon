package BJ_4344;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int case_number = in.nextInt();
		
		for(int i = 0; i < case_number; i++) {
			int student_number = in.nextInt();
			int score[] = new int[student_number];
			int total = 0, count = 0;
			for(int j = 0; j < student_number; j++) {
				score[j] = in.nextInt();
				total += score[j];
			}
			double average = total / student_number;
			for(int j : score)
				if( j > average)
					count++;
			double rate = (double)((double)count/(double) student_number) * 100;
			System.out.format("%.3f", (float)rate);
			System.out.println("%");
		}
	}
}

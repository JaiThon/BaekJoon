package BJ_10871;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int numb = in.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < size; i++) {
			int n = in.nextInt();
			if(n < numb) 
				list.add(n);
		}
		for(int i : list)
			System.out.print(i+" ");
	}
}

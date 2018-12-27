package BJ_2751;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		ArrayList list = new ArrayList<Integer>();
		for(int i = 0 ; i < size; i ++)
			list.add(in.nextInt());
		Collections.sort(list);
		for(int i =0 ; i < size; i++)
			System.out.println(list.get(i));
	}
}

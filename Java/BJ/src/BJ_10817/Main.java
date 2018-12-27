package BJ_10817;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		ArrayList input = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 3; i++)
			input.add(in.nextInt());
		Collections.sort(input);
		System.out.println(input.get(1));
	}
}

package BJ_11656;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		ArrayList<String> result = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i = 0; i < str.length(); i++) 
			result.add(str.substring(i, str.length()));
		Collections.sort(result);
		for(int i = 0; i < result.size(); i++)
			System.out.println(result.get(i));
	}
}

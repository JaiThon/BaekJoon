package BJ_1152;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String str= in.nextLine().trim();
		in.close();
		if(str.isEmpty())
			System.out.println(0);
		else 
			System.out.println(str.split(" ").length);
	}
}
// str.split(" ").length ����� ���� �ܾ� ����
// trim()				�� �� ���� ����	
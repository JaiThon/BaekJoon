package BJ_9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Stack ps = new Stack<String>();

		int test_case = sc.nextInt();
		String result[] = new String[test_case];

		for(int i = 0 ; i < test_case; i++) {
			String str = sc.next();
			boolean vps = true;
			for(int j = 0; j < str.length(); j++){
				char ch = str.charAt(j);
				if(ch == '(')
					ps.push("(");
				else {
					if(ps.isEmpty()) {
						vps = false;
					}
					else
						ps.pop();
				}
			}
			if(!ps.isEmpty())
				vps = false;

			if(vps)	result[i] = "YES";
			else result[i] = "NO";

			ps.clear();
		}
		for(String i : result)
			System.out.println(i);
	}
}
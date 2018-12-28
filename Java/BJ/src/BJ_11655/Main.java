package BJ_11655;

import java.util.Scanner;
/*
 * 알파벳만 아스키 코드에서 +13하며
 * Z나 z의 아스키 값을 초과시
 * 소문자는 소문자에서만
 * 대문자는 대문자에서만
 * 회전시킨다.
 */
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split("");
		int[] ascii = new int[str.length];
		
		for(int i = 0; i < str.length; i++) {
			ascii[i] = str[i].charAt(0);
			if(ascii[i] >= 65 && ascii[i] <= 90)
				ascii[i] = (ascii[i]+13 <= 90)? ascii[i]+13 : ascii[i]-13;
			else if(ascii[i] >= 97 && ascii[i] <= 122)
				ascii[i] = (ascii[i]+13 <= 122)? ascii[i]+13 : ascii[i]-13;
		}
		for(int i = 0; i < ascii.length; i++) {
			System.out.print((char)ascii[i]);
		}
	}
}

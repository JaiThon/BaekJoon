package BJ_10820;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String[] str = sc.nextLine().split("");
			int capital = 0, small = 0, number = 0, blank = 0;

			for(int i = 0; i < str.length; i++) {
				int ascii = str[i].charAt(0);
				if(ascii <= 90 && ascii >= 65) 			// 대문자 일때
					capital++;
				else if(ascii >= 97 && ascii <= 122)	// 소문자 일때
					small++;
				else if(ascii >= 48 && ascii <= 57)		// 숫자 일떄
					number++;
				else if(ascii == 32 || (ascii >= 8 && ascii <= 13))	// 공백 문자일 때
					blank++;
			}
			System.out.println(small+" "+capital+" "+number+" "+blank);
		}
	}
}

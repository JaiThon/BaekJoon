package BJ_1015;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		ArrayList txt_list = new ArrayList<String>();
		Scanner in = new Scanner(System.in);

		int size = 10;
		String txt = in.nextLine();

		while(txt.length() != 0) {
			for(int i = 0; i < txt.length(); i++) {
				txt_list.add(txt.charAt(i));
			}
			String test = "";
			for(int j = 0; j < size; j++) {
				test += txt_list.get(j);
			}
			long input = Long.parseLong(test);
			if( isPrime(input)) {
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				System.out.println("@@@@@@@@@"+input +"소수인 수"+"@@@@@@@@@@");
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			}
			txt = txt.substring(size, txt.length());
			txt_list.clear();
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@"+"프로그램 종료"+"@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		in.close();
	}
	public static boolean isPrime(long numb) {
		for(int i = 2; i < numb; i++) {
			if( (numb % i) == 0 )
				return false;
		}
		return true;
	}
}

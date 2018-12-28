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
				if(ascii <= 90 && ascii >= 65) 			// �빮�� �϶�
					capital++;
				else if(ascii >= 97 && ascii <= 122)	// �ҹ��� �϶�
					small++;
				else if(ascii >= 48 && ascii <= 57)		// ���� �ϋ�
					number++;
				else if(ascii == 32 || (ascii >= 8 && ascii <= 13))	// ���� ������ ��
					blank++;
			}
			System.out.println(small+" "+capital+" "+number+" "+blank);
		}
	}
}

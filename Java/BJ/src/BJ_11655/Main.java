package BJ_11655;

import java.util.Scanner;
/*
 * ���ĺ��� �ƽ�Ű �ڵ忡�� +13�ϸ�
 * Z�� z�� �ƽ�Ű ���� �ʰ���
 * �ҹ��ڴ� �ҹ��ڿ�����
 * �빮�ڴ� �빮�ڿ�����
 * ȸ����Ų��.
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

package BJ_10808;

import java.util.Scanner;
/*
 * ���ڿ� S�� �޾ƿ� a���� z���� �� ���� �����ϴ���
 * ����ϴ� ���α׷�
 */
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// �Է� ���� ���ڿ��� �� ���ھ� �迭�� ����
		String[] S = sc.nextLine().split("");
		int[] result = new int[26];	// a���� z���� ����
		for(int i = 0; i < S.length; i++) {
			int ascii = S[i].charAt(0);	// ���� �ϳ��� �ƽ�Ű �ڵ�� ��ȯ 
			result[ascii - 97]++; 	// �ƽ�Ű �ڵ��̱� ������ -97 (a�� �ƽ�Ű �ڵ� = 97)
		}
		for(int i : result)
			System.out.print(i+" ");
	}
}

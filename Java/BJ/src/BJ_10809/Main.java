package BJ_10809;

import java.util.Scanner;
/*
 * �Է¹��� ���ڿ��� �迭 S�� �ϳ��� ������� �Ŀ�
 * ������ ���ĺ��� ó���� ���� ���Դ��� 
 * �˾Ƴ��� ���α׷� 
 * a�� �ƽ�Ű �ڵ�� 97�̴�
 */
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String[] S = sc.nextLine().split("");
		int[] result = new int[26];
		for(int i = 0; i < result.length; i++)
			result[i] = 101;
		for(int i = 0; i < S.length; i++) {
			int ascii = S[i].charAt(0);
			if(i < result[ascii - 97])
				result[ascii - 97] = i;
		}
		for(int i = 0; i < result.length; i++)
			if(result[i] == 101) result[i] = -1;
		for(int i : result)
			System.out.print(i+" ");
	}
}

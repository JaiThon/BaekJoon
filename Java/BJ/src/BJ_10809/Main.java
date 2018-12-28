package BJ_10809;

import java.util.Scanner;
/*
 * 입력받은 문자열을 배열 S로 하나씩 저장받은 후에
 * 각각의 알파벳이 처음에 언제 나왔는지 
 * 알아내는 프로그램 
 * a의 아스키 코드는 97이다
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

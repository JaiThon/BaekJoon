package BJ_10808;

import java.util.Scanner;
/*
 * 문자열 S를 받아와 a부터 z까지 몇 개가 존재하는지
 * 출력하는 프로그램
 */
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// 입력 받은 문자열을 한 글자씩 배열에 저장
		String[] S = sc.nextLine().split("");
		int[] result = new int[26];	// a부터 z까지 저장
		for(int i = 0; i < S.length; i++) {
			int ascii = S[i].charAt(0);	// 글자 하나씩 아스키 코드로 변환 
			result[ascii - 97]++; 	// 아스키 코드이기 때문애 -97 (a의 아스키 코드 = 97)
		}
		for(int i : result)
			System.out.print(i+" ");
	}
}

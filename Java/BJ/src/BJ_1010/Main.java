package BJ_1010;

import java.math.BigInteger;
import java.util.Scanner;
/*
 * �� ������ ������ N
 * �� ������ ������ M���� ��´�
 * �̸� ���� �����Ͽ� N�� M�� �մ� ����� ���� ã�´�
 */
public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();
		for(int i = 0 ; i < test_case; i++) {
			int N = in.nextInt();
			int M = in.nextInt();
			System.out.println(Combination(M,N));
		}
		in.close();
	}
	public static BigInteger Combination(int left, int right) {
		BigInteger numerator = new BigInteger("1");
		BigInteger denumerator = new BigInteger("1");

		for(int i = left; i > left - right; i--)
			numerator = numerator.multiply(BigInteger.valueOf(i));
		for(int i = 2; i < right+1; i++)
			denumerator = denumerator.multiply(BigInteger.valueOf(i));
		return numerator.divide(denumerator);
	}
}

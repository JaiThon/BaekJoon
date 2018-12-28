package BJ_1158;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Queue<Integer> queue = new LinkedList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i = 1; i < N+1; i++)
			queue.add(i);
		
		while(!queue.isEmpty()) {
			for(int i = 0; i < M; i++)
				if(i == M-1) {
					result.add(queue.poll());
				}
				else
					queue.add(queue.poll());
		}
		System.out.print("<");
		for(int i = 0; i < result.size()-1; i++)
			System.out.print(result.get(i)+", ");
		System.out.print(result.get(result.size()-1));
		System.out.print(">");
	}
}
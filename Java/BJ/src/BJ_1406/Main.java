package BJ_1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		Stack right = new Stack<String>();
		Stack left  = new Stack<String>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			left.push(ch);
		}

		int command_number = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < command_number; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String command = st.nextToken();
			
			if(command.equals("L")) {
				if(!left.empty()) {
					right.push(left.peek());
					left.pop();
				}
			}
			else if(command.equals("D")) {
				if(!right.empty()){
					left.push(right.peek());
					right.pop();
				}
			}
			else if(command.equals("B")) {
				if(!left.empty()) {
					left.pop();
				}
			}
			else if(command.equals("P")) {
					String push_word = st.nextToken();
					left.push(push_word);
			}
		}
		while(!left.empty()) {
			right.push(left.peek());
			left.pop();
		}
		while(!right.empty()) 
			System.out.print(right.pop());
	}
}
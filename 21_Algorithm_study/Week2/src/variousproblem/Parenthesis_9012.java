package variousproblem;

import java.io.*;
import java.util.*;

public class Parenthesis_9012 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			Stack<Integer> stk = new Stack<>();
			String[] input = br.readLine().split("");
			boolean wrong = false;
			
			
			for (int j = 0; j <input.length; j++) {
				if(input[j].equals("("))
					stk.push(1);
				else if(input[j].equals(")")) {
					 if(stk.isEmpty()) {
						 wrong = true;
						 break;
					 }
					 stk.pop();
				}
			}
			
			if(stk.isEmpty() && !wrong)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

		

	}

}

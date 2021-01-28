package variousproblem;

import java.io.*;
import java.util.Stack;


public class Editor_1406 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String line = br.readLine();
		String[] input = line.split("");

		Stack<String> left = new Stack<String>();
		Stack<String> right = new Stack<String>();
		
		for (int i = 0; i < input.length; i++)
			left.push(input[i]);

		int m = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < m; i++) {
			line = br.readLine();
			String[] input2 = line.split(" ");

			if (input2[0].equals("P")) {
				left.push(input2[1]);
			}

			if (input2[0].equals("L") && !left.isEmpty()) {
				right.push(left.pop());
			}

			if (input2[0].equals("D") && !right.isEmpty()) {
				left.push(right.pop());
			}
			
			if (input2[0].equals("B") && !left.isEmpty()) {
				left.pop();
			}
		}
		
		while(!left.empty())
			right.push(left.pop());
		
		while(!right.empty())
			bw.write(right.pop());	
		
		bw.flush();
	}

}

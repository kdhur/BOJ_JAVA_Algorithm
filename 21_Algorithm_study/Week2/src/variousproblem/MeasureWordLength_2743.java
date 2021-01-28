package variousproblem;

import java.util.Scanner;

public class MeasureWordLength_2743 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] ss = s.toCharArray();
		int length = 0;
		
		for (int i = 0; i < ss.length; i++) {
			
			for (int k = 65; k < 91; k++) // 65~90 97~122
				if(ss[i] == k)
					length++;
			
			for (int k = 97; k < 123; k++) // 65~90 97~122
				if(ss[i] == k)
					length++;
		}
		
		System.out.println(length);
	}

}

package variousproblem;

import java.util.Scanner;

public class ROT13_11655 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();		
		char[] ss = s.toCharArray();
		
		for (int i = 0; i < ss.length; i++) {
			if(ss[i] > 64 && ss[i] < 78) //A ~ M
				ss[i] += 13;
			else if (ss[i] > 77 && ss[i] < 91) //N ~ Z
				ss[i] -= 13;
			else if (ss[i] > 96 && ss[i] < 110) //a ~ m
				ss[i] += 13;
			else if (ss[i] > 109 && ss[i] < 123) //n ~ z
				ss[i] -= 13;
		}
		
		System.out.println(ss);
	}

}

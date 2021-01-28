package variousproblem;

import java.util.Arrays;
import java.util.Scanner;

public class SuffixArray_11656 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] s1 = new String[s.length()];
		
		for (int i = 0; i < s1.length; i++)
			s1[i] = s.substring(i);
		
		Arrays.sort(s1);
		
		for (int i = 0; i < s1.length; i++)
			System.out.println(s1[i]);
		
	}

}

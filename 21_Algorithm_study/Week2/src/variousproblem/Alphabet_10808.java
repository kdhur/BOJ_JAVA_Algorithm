package variousproblem;

import java.util.Scanner;

public class Alphabet_10808 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] alphabet = new int[26]; 
		char[] ss = s.toCharArray();
		
		for (int i = 0; i < ss.length; i++)
			for (int j = 97; j < 123; j++) //97부터 122 a ~ z
				if(ss[i] == j)
					alphabet[j - 97]++;
		
		for (int i = 0; i < alphabet.length; i++)
			System.out.print(alphabet[i] + " ");
	}

}

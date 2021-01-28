package variousproblem;

import java.util.Scanner;

public class FourNumber_10824 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		long[] arr = new long[4];
		
		for (int i = 0; i < 4; i++)
			arr[i] = sc.nextInt();
		
		System.out.println((arr[0]*(long)Math.pow(10, (long)(Math.log10(arr[1]) + 1)) + arr[1]) + (arr[2]*(long)Math.pow(10, (long)(Math.log10(arr[3]) + 1)) + arr[3]));
	}

}

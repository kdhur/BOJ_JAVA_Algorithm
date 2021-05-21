package DP;

import java.util.Scanner;

public class longestsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] dp = new int[n];
		dp[0] = 1;
		int max = 0;

		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();

		for (int i = 1; i < dp.length; i++) {
			for (int j = 0; j < i; j++)
				if (a[i] < a[j]) // 감소하는 수열
					max = Math.max(max, dp[j]);
			dp[i] = 1 + max;
			max = 0;
		}

		for (int i = 0; i < dp.length; i++)
			max = Math.max(max, dp[i]);

		System.out.println(max);
	}

}

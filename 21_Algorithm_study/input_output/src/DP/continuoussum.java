package DP;

import java.util.Scanner;

public class continuoussum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] dp = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		int max = a[0];
		dp[0] = a[0];

		for (int i = 1; i < dp.length; i++)
			dp[i] = Math.max(dp[i - 1] + a[i], a[i]);

		for (int i = 0; i < dp.length; i++)
			max = Math.max(max, dp[i]);

		System.out.println(max);

	}

}

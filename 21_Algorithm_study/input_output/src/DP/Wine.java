package DP;

import java.util.Scanner;

public class Wine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n];
		int[] wine = new int[n];

		for (int i = 0; i < wine.length; i++)
			wine[i] = sc.nextInt();

		dp[0] = wine[0];
		dp[1] = wine[1] + wine[0];
		dp[2] = Math.max(wine[0] + wine[2], Math.max(wine[1] + wine[2], wine[1] + wine[0]));

		for (int i = 3; i < wine.length; i++)
			dp[i] = Math.max(wine[i] + wine[i - 1] + dp[i - 3],
					Math.max(dp[i - 1], wine[i] + dp[i - 2]));

		System.out.println(dp[n - 1]);

	}

}

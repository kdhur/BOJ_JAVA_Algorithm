package DP;

import java.util.Scanner;

public class sequ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {

			int n = sc.nextInt();
			long[] dp = new long[n+3];
			dp[0] = 1;
			dp[1] = 1;
			dp[2] = 1;

			for (int j = 3; j < dp.length; j++)
				dp[j] = dp[j - 2] + dp[j - 3];
			
			System.out.println(dp[n-1]);
		}

	}

}

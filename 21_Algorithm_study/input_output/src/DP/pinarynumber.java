package DP;

import java.util.Scanner;

public class pinarynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long [] dp = new long[10000000];
		dp[1] = 1;
		dp[2] = 1;
		
		for (int i = 3; i < dp.length; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		System.out.println(dp[n]);
	}

}
/*
 * long[][] dp = new long[2][2];
 * dp[1][0] = 0;
 * dp[1][1] = 1;
 * 
 * for(int i = 2; i <= n; i++) {
 * 	int index = i%2;
 * 
 * 	dp[index][0] = dp[1-index][0] + dp[1-index][1];
 * 	dp[index][1] = dp[1-index][0];
 * }
 * System.out.println(dp[n%2][0] + dp[n%2][1]);
 */

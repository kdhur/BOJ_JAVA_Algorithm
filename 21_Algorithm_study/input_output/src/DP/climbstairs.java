package DP;

import java.util.Scanner;

public class climbstairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] stairs = new int[n + 2];
		int[] dp = new int[n + 2];

		for (int i = 1; i <= n; i++)
			stairs[i] = sc.nextInt();
		
		dp[1] = stairs[1];
		dp[2] = stairs[1] + stairs[2];

		for (int i = 3; i <= n; i++)
			dp[i] = Math.max(stairs[i] + dp[i - 2], stairs[i] + stairs[i - 1] + dp[i - 3]);
		
		System.out.println(dp[n]);
	}

}

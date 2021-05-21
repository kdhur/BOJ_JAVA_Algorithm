package DP;

import java.util.Scanner;

public class sum123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] dp = new int[100001];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for (int j = 0; j < T; j++) {
			int n = sc.nextInt();
			for (int i = 4; i < dp.length; i++)
				dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
			System.out.println(dp[n]);
		}

	}

}

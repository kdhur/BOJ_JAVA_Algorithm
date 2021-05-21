package DP;

import java.util.Scanner;

public class buycard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n + 1];
		int[] dp = new int[n + 1];
		
		for (int i = 1; i <= n; i++)
			p[i] = sc.nextInt();
		
		dp[1] = p[1];
		
		for (int i = 1; i < dp.length; i++) {
			dp[i] = Math.max(dp[i-1] + p[1], p[i]);
		}
		
		System.out.println(dp[n]);
	}

}

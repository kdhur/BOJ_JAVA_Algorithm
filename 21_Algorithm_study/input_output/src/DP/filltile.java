package DP;

import java.util.Scanner;

public class filltile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n + 2];

		dp[0] = 1;
		dp[2] = 3;

		if (n % 2 == 0) {
			for (int i = 4; i < dp.length; i++)
				dp[i] = dp[i-2]*dp[2] + 2;
			
			System.out.println(dp[n]);
		}
		
		else
			System.out.println(0);
	}

}

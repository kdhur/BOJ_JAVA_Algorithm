package DP;

import java.util.Scanner;

public class password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n+100000];
		int[] a = new int[n+100000];
		int length = 0;

		for (int i = 0; n != 0; i++) {
			a[i] = n % 10;
			n = n / 10;
			length++;
		}
		
		if (a[0] == 0) {
			dp[0] = 0;
		}
		else
			dp[0] = 1;
		
		if(a[1] <= 2)
			dp[1] = 2;
		else
			dp[1] = 1;

		for (int i = 2; i < dp.length; i++) {
			if (a[i] <= 2)
				dp[i] = (dp[i-1] + dp[i-2])%1000000;
			else
				dp[i] = dp[i-1]%1000000;
		}
		
		System.out.println(dp[length-1]);
	}

}

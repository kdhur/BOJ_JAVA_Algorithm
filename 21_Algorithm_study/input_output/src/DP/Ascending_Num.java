package DP;

import java.util.Scanner;

public class Ascending_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] dp = new int[100000][11];
		
		for (int i = 0; i < 10; i++)
			dp[1][i] = 1;
		
		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = 1;
		}
		
		for (int i = 2; i < dp.length; i++) {
			for (int j = 1; j < 10; j++) {
				dp[i][j] = dp[i][j-1] + dp[i-1][j]; 
			}
		}
		
		int sum = 0;
		
		for (int i = 0; i < 10; i++) {
			sum = sum + dp[n][i];
		}
		
		System.out.println(sum);
	}

}

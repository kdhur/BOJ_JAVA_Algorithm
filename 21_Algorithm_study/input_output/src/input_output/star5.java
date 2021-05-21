package input_output;

import java.util.Scanner;

public class star5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int k = 0; k <= i; k++) 
				System.out.print("*");
			for (int j = n; j > 2*i - (n-2); j--) 
				System.out.print(" ");
			for (int l = 0; l <= i; l++)
				System.out.print("*");
			System.out.println();
		}
		
		for (int i = 0; i < n; i++) {
			for (int k = n - 1; k > i; k--) 
				System.out.print("*");
			for (int j = 0; j < 2*i + 2; j++) 
				System.out.print(" ");
			for (int l = n - 1; l > i; l--)
				System.out.print("*");
			System.out.println();
		}

	}
}

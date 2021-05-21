package input_output;

import java.util.Scanner;

public class star6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i + 1; j--) 
				System.out.print(" ");
			for (int l = 0; l <= i; l++)
				System.out.print("*");
			System.out.println();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) 
				System.out.print(" ");
			for (int l = n - 1; l > i; l--)
				System.out.print("*");
			System.out.println();
		}
	}

}

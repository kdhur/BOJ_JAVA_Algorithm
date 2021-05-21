package input_output;

import java.util.Scanner;

public class star4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int k = n; k > i + 1 ; k--) 
				System.out.print(" ");
			for (int j = 0; j < 2*i + 1; j++) 
				System.out.print("*");
			System.out.println();
		}
	}

}

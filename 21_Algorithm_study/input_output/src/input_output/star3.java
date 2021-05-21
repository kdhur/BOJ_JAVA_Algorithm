package input_output;

import java.util.Scanner;

public class star3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < i ; k++) {
				System.out.print(" ");
			}
			for (int j = n; j > i; j--) 
				System.out.print("*");
			System.out.println();
		}
	}

}

package input_output;

import java.util.Scanner;

public class sumab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, a, b;
		
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a + b);
		}
	}

}

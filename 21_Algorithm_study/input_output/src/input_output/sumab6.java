package input_output;

import java.util.Scanner;

public class sumab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T, a, b;
		T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Case #" + (i + 1) + ": " + (a + b));
		}
	}

}

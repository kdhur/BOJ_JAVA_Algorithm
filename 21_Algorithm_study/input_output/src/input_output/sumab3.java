package input_output;

import java.util.Scanner;

public class sumab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		while(sc.hasNextInt()) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a + b);
		}
	}

}

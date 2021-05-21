package input_output;

import java.util.Scanner;

public class sumab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			if (a == 0 && b == 0)
				break;
			System.out.println(a + b);
		}
	}

}

package input_output;

import java.util.Scanner;

public class numsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String a = sc.next();
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			sum += Character.getNumericValue(a.charAt(i));
		}
		System.out.println(sum);
		
	}

}

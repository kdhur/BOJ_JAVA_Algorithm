package input_output;

import java.util.Scanner;

public class numoutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = N; i > 0; i--) {
			System.out.println(i);
		}
	}

}

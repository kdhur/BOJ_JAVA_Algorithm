package input_output;

import java.util.Scanner;

public class split10output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		for (int i = 1; i < a.length() + 1; i++) {
				System.out.print(a.charAt(i - 1));
			if (i%10 == 0)
				System.out.println();
		}
	}

}

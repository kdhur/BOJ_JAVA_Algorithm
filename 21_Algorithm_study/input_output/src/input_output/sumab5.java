package input_output;

import java.util.Scanner;
import java.util.StringTokenizer;

public class sumab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T, x, y;
		String a;
		T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			a = sc.next();
			StringTokenizer st = new StringTokenizer(a, ",");
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			System.out.println(x + y);
		}
	}

}

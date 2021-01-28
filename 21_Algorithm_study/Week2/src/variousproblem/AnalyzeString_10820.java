package variousproblem;

import java.util.Scanner;

public class AnalyzeString_10820 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s = "";
		
		while(sc.hasNext()) {
			s = sc.nextLine();
			char[] ss = s.toCharArray();
			int blank = 0, lower = 0, upper = 0, number = 0;

			for (int j = 0; j < ss.length; j++) {
				if(ss[j] == ' ')
					blank++;
				
				for (int k = 65; k < 91; k++) // 65~90 97~122
					if(ss[j] == k)
						upper++;
				
				for (int k = 97; k < 123; k++) // 65~90 97~122
					if(ss[j] == k)
						lower++;
				
				for (int k = 48; k < 58; k++)
					if(ss[j] == k)
						number++;
			}
			System.out.println(lower + " " + upper + " " + number + " " + blank);
		}
	}

}

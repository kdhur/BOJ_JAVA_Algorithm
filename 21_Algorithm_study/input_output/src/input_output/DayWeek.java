package input_output;

import java.util.Scanner;

public class DayWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		
		switch (x) {
		case 1, 10:
			if (y%7 == 1)
				System.out.println("MON");
			else if (y%7 == 2)
				System.out.println("TUE");
			else if (y%7 == 3)
				System.out.println("WED");
			else if (y%7 == 4)
				System.out.println("THU");
			else if (y%7 == 5)
				System.out.println("FRI");
			else if (y%7 == 6)
				System.out.println("SAT");
			else if (y%7 == 0)
				System.out.println("SUN");
			break;
		
		case 2, 3, 11:
			if (y%7 == 5)
				System.out.println("MON");
			else if (y%7 == 6)
				System.out.println("TUE");
			else if (y%7 == 0)
				System.out.println("WED");
			else if (y%7 == 1)
				System.out.println("THU");
			else if (y%7 == 2)
				System.out.println("FRI");
			else if (y%7 == 3)
				System.out.println("SAT");
			else if (y%7 == 4)
				System.out.println("SUN");
			break;
			
		case 4, 7:
			if (y%7 == 2)
				System.out.println("MON");
			else if (y%7 == 3)
				System.out.println("TUE");
			else if (y%7 == 4)
				System.out.println("WED");
			else if (y%7 == 5)
				System.out.println("THU");
			else if (y%7 == 6)
				System.out.println("FRI");
			else if (y%7 == 0)
				System.out.println("SAT");
			else if (y%7 == 1)
				System.out.println("SUN");
			break;
			
		case 5:
			if (y%7 == 0)
				System.out.println("MON");
			else if (y%7 == 1)
				System.out.println("TUE");
			else if (y%7 == 2)
				System.out.println("WED");
			else if (y%7 == 3)
				System.out.println("THU");
			else if (y%7 == 4)
				System.out.println("FRI");
			else if (y%7 == 5)
				System.out.println("SAT");
			else if (y%7 == 6)
				System.out.println("SUN");
			break;
			
		case 6:
			if (y%7 == 4)
				System.out.println("MON");
			else if (y%7 == 5)
				System.out.println("TUE");
			else if (y%7 == 6)
				System.out.println("WED");
			else if (y%7 == 0)
				System.out.println("THU");
			else if (y%7 == 1)
				System.out.println("FRI");
			else if (y%7 == 2)
				System.out.println("SAT");
			else if (y%7 == 3)
				System.out.println("SUN");
			break;
			
		case 8:
			if (y%7 == 6)
				System.out.println("MON");
			else if (y%7 == 0)
				System.out.println("TUE");
			else if (y%7 == 1)
				System.out.println("WED");
			else if (y%7 == 2)
				System.out.println("THU");
			else if (y%7 == 3)
				System.out.println("FRI");
			else if (y%7 == 4)
				System.out.println("SAT");
			else if (y%7 == 5)
				System.out.println("SUN");
			break;
			
		case 9, 12:
			if (y%7 == 3)
				System.out.println("MON");
			else if (y%7 == 4)
				System.out.println("TUE");
			else if (y%7 == 5)
				System.out.println("WED");
			else if (y%7 == 6)
				System.out.println("THU");
			else if (y%7 == 0)
				System.out.println("FRI");
			else if (y%7 == 1)
				System.out.println("SAT");
			else if (y%7 == 2)
				System.out.println("SUN");
			break;		

		default:
			break;
		}
	}

}

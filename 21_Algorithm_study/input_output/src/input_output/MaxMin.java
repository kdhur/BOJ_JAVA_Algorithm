package input_output;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max, min;
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		max = arr[0];
		for (int i = 1; i < n; i++)
			if(max < arr[i])
				max = arr[i];
		
		min = arr[0];
		for (int i = 1; i < n; i++)
			if(min > arr[i])
				min = arr[i];
		
		System.out.println(min + " " + max);
		
	}

}

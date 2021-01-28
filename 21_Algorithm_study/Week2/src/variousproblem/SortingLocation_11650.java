package variousproblem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortingLocation_11650 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	 
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) //x좌표가 같을 때
					return o1[1] - o2[1]; //y좌표 오름차순 정렬
				else
					return o1[0] - o2[0]; //x좌표 오름차순 정렬
			}
		});
		
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}

}

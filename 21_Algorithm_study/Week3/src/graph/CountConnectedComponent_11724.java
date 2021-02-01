package graph;

import java.util.*;

public class CountConnectedComponent_11724 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();		
		int[][] arrGraph = new int[n + 1][n + 1];
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arrGraph[x][y] = arrGraph[y][x] = 1;
		}	
		boolean[] c = new boolean[n + 1]; // 방문여부
		int cnt = 0;
		
		for (int i = 1; i < c.length; i++)
			if (!c[i]) {
				bfs(arrGraph, i, c);
				cnt++;
			}
		
		System.out.println(cnt);	
	}
	
	static void bfs(int[][] a, int v, boolean[] c) {
		Queue<Integer> q = new LinkedList<>();
		q.add(v);
		c[v] = true;

		while (!q.isEmpty()) {
			v = q.poll(); //q

			for (int i = 1; i < a.length; i++)
				if (a[v][i] == 1 && !c[i]) {
					q.add(i);
					c[i] = true;
				}

		}
	}
}

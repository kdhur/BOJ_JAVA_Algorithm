package graph;

import java.util.*;

public class DFSBFS_1260_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 정점의 개수
		int m = sc.nextInt(); // 간선의 개수
		int v = sc.nextInt(); // 탐색 시작점
		ArrGraph graph = new ArrGraph(n);
		for (int i = 0; i < m; i++)
			graph.put(sc.nextInt(), sc.nextInt());

		dfs(graph.getGraph(), v);
		System.out.println();
		bfs(graph.getGraph(), v);

	}

	static void dfs(int[][] a, int v) {
		Stack<Integer> stack = new Stack<>();
		boolean[] c = new boolean[a.length]; // 방문여부
		stack.push(v);
		c[v] = true;
		System.out.print(v + " ");

		while (!stack.isEmpty()) {
			int vv = stack.peek();

			boolean flag = false;

			for (int i = 1; i < a.length; i++) {
				if (a[vv][i] == 1 && !c[i]) { // vv와 연결된 점 중 미방문인 점
					stack.push(i);
					System.out.print(i + " ");
					c[i] = true;
					flag = true;
					break;
				}
			}

			if (!flag) // vv와 연결된 점을 모두 방문한 경우
				stack.pop();
		}
	}

	static void bfs(int[][] a, int v) {
		Queue<Integer> q = new LinkedList<>();
		boolean[] c = new boolean[a.length]; // 방문여부

		q.add(v);
		c[v] = true;

		while (!q.isEmpty()) {
			v = q.poll(); //q
			System.out.print(v + " ");

			for (int i = 1; i < a.length; i++)
				if (a[v][i] == 1 && !c[i]) {
					q.add(i);
					c[i] = true;
				}

		}
	}
}

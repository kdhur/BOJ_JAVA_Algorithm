package graph;

import java.util.*;

public class DFSBFS_1260_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 정점의 개수
		int m = sc.nextInt(); // 간선의 개수
		int v = sc.nextInt(); // 탐색 시작점
		ListGraph graph = new ListGraph(n);
		for (int i = 0; i < m; i++)
			graph.put(sc.nextInt(), sc.nextInt());

		dfs(graph.getGraph(), v);
		System.out.println();
		bfs(graph.getGraph(), v);

	}

	static void dfs(ArrayList<ArrayList<Integer>> graph, int v) {
		Stack<Integer> stack = new Stack<>();
		boolean[] c = new boolean[graph.size()]; // 방문여부
		stack.push(v);
		c[v] = true;
		System.out.print(v + " ");

		while (!stack.isEmpty()) {
			int vv = stack.peek();

			boolean flag = false;
			
			for (Iterator<Integer> iter = graph.get(vv).iterator(); iter.hasNext();) {
				int tmp = (int) iter.next();
				if(!c[tmp]) {
					stack.push(tmp);
					System.out.print(tmp + " ");
					c[tmp] = true;
					flag = true;
					break;
				}
				
			}

			if (!flag) // vv와 연결된 점을 모두 방문한 경우
				stack.pop();
		}
	}

	static void bfs(ArrayList<ArrayList<Integer>> graph, int v) {
		Queue<Integer> q = new LinkedList<>();
		boolean[] c = new boolean[graph.size()]; // 방문여부

		q.add(v);
		c[v] = true;

		while (!q.isEmpty()) {
			v = q.poll(); //q
			System.out.print(v + " ");

			for (Iterator<Integer> iter= graph.get(v).iterator(); iter.hasNext();) {
				int tmp = (int) iter.next();
				if(!c[tmp]) {
					q.add(tmp);
					c[tmp] = true;
				}
			}

		}
	}
}

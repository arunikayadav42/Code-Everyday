import java.io.*;
import java.util.*;
import java.lang.*;

class aliendictionary{
	static class FastReader{
		StringTokenizer st;
		BufferedReader br;
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {
			while(st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			return str;
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
	static class Graph{
		int v;
		List<List<Integer>> adj;
		public Graph(int V){
			v = 26;
			adj = new ArrayList<>();
			for(int i = 0; i < 26; i++){
				adj.add(new LinkedList<>());
			}
		}
	}
	static void printGraph(Stack<Integer> stack){
		while(stack.size()!=0){
			System.out.print((char)('a'+stack.pop()));
		}
		System.out.println();
	}
	static void dfs(int v, boolean visited[], Graph graph, Stack<Integer> stack){
      visited[v] = true;
      List<Integer> list = graph.adj.get(v);
      for(int i: list){
      	if(!visited[i])
      		dfs(i, visited, graph, stack);
      }
      stack.push(v);
	}
	static void dfsUtil(Graph graph){
		boolean visited[] = new boolean[graph.v];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < graph.v; i++){
        	if(!visited[i] && graph.adj.get(i).size() > 0)
        		dfs(i, visited, graph, stack);
        }
	printGraph(stack);
	}
	static void addEdge(Graph graph, char src, char dest){
		graph.adj.get(src-'a').add(dest-'a');
	}
	public static void createGraph(String arr[], int n, int k){
        Graph graph = new Graph(k);
        for(int i = 0; i < n-1; i++){
         String s1 = arr[i];
         String s2 = arr[i+1];
         int j = 0;
         for(j = 0; j < Math.min(s1.length(), s2.length()); j++){
              if(s1.charAt(j) != s2.charAt(j))
              	break;
         }
         if(j != Math.min(s1.length(), s2.length())){
         	addEdge(graph, s1.charAt(j), s2.charAt(j));
         }
        }
        dfsUtil(graph);
	}
	public static void main(String[] args){
		FastReader s = new FastReader();
		int t = s.nextInt();
		while(t--!=0){
			int n = s.nextInt();
			int k = s.nextInt();
			
			String arr[] = new String[n];
			for(int i = 0; i < n; i++){
				arr[i] = s.next();
			}
			createGraph(arr, n, k);
		}
	}
}
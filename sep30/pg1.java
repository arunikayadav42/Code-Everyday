import java.io.*;
import java.util.*;
import java.lang.*;

class pg1{
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
	static void check(int[] arr, int n){
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
        for(int i = 0; i < n-1; i++){
         min = Math.min(min, arr[i+1]-arr[i]);
        }
        System.out.println(min);
	}
	public static void main(String[] args){
		FastReader s = new FastReader();
		int t = s.nextInt();
		while(t--!=0){
			int n = s.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i < n; i++)
				arr[i] = s.nextInt();
			check(arr, n);
		}
	}
}
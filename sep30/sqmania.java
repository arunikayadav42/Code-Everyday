import java.io.*;
import java.util.*;
import java.lang.*;

class sqmania
{
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
	static double distance(int i, int j, int side[], int dist[], int k){
		double d = 0.0;
		if(i == 0){
			if(j == 0)
			{
                return side[k]+dist[k];
			}
			else if(j == 1){
                return side[k]+dist[k]+side[k+1];
			}
			else if(j == 2){
                return Math.sqrt(side[k+1]*side[k+1] + (side[k]+side[k+1]+dist[k+1])*(side[k]+side[k+1]+dist[k+1]));
			}
			else if(j == 3){
                return Math.sqrt(side[k+1]*side[k+1] + (side[k]+dist[k])*(side[k]+dist[k]));
			}
		}
		else if(i == 1){
			if(j == 0)
			{
               return dist[k];
			}
			else if(j == 1){
               return dist[k]+side[k];
			}
			else if(j == 2){
                return Math.sqrt(side[k+1]*side[k+1] + (side[k+1]+dist[k+1])*(side[k+1]+dist[k+1]));
			}
			else if(j == 3){
                return Math.sqrt(side[k+1]*side[k+1] + (side[k]+dist[k])*(side[k]+dist[k]));
			}
		}
		else if(i == 2){
			if(j == 0)
			{
                return Math.sqrt(side[k]*side[k] + (dist[k+1])*(dist[k+1]));

			}
			else if(j == 1){
                return Math.sqrt(side[k]*side[k] + (side[k+1]+dist[k])*(side[k+1]+dist[k]));
			}
			else if(j == 2){
                return Math.sqrt((side[k+1]+dist[k])*(side[k+1]+dist[k]) + (side[k]-side[k+1])*(side[k]-side[k+1]));
			}
			else if(j == 3){
                 return Math.sqrt((dist[k]+side[k+1])*(side[k+1]+dist[k]) + (side[k]-side[k+1])*(side[k]-side[k+1]));
			
			}
		}
		else if(i == 3){
			if(j == 0)
			{
return Math.sqrt((dist[k]+side[k])*(dist[k]+side[k]) + (side[k])*(side[k]));
			}
			else if(j == 1){
return Math.sqrt((dist[k]+side[k]+side[k+1])*(dist[k]+side[k]+side[k+1]) + (side[k])*(side[k]));
			}
			else if(j == 2){
return Math.sqrt((side[k+1]+side[k]+dist[k])*(side[k+1]+side[k]+dist[k])+(side[k]-side[k+1])*(side[k]-side[k+1]));
			}
			else if(j == 3){
return Math.sqrt((side[k]+dist[k])*(side[k]+dist[k])+(side[k]-side[k+1])*(side[k]-side[k+1]));

			}
		}
		return 0;
	}
	static double mindist(int side[], int dist[], int n, int k, int i){
		if(k == n-1)
			return 4*side[k];
		double value = (double)Integer.MAX_VALUE;
		for(int j = 0; j < 4; j++){
			double p = 4*side[k]+distance(i, j, side, dist, k);
			value = Math.min(value, p+mindist(side, dist, n, k+1, j));
		}
		return value;
	}
	public static void main(String[] args){
		FastReader s = new FastReader();
		//int t = s.nextInt();
		
			int n = s.nextInt();
			int side[] = new int[n];
			int dist[] = new int[n-1];
			for(int i = 0; i < n; i++)
				side[i] = s.nextInt();
			for(int i = 0; i < n-1; i++)
				dist[i] = s.nextInt();
			//System.out.println("p");
			System.out.println((int)(mindist(side, dist, n, 0, 0)));
	}
}
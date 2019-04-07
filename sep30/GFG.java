import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
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
	static void sum(int arr[], int n, int k){
		int count = 0;
	    for(int i = 0; i < n; i++){
	    	count++;
	    }
	    if(k>count)
	    	{
	    		System.out.println("2");
	    		return;
	    	}
	    int a = 0, b = 0;
	    if(count % 2 == 0){
	    	while(count >= 0){
	    		if(count >= k)
                  a++;
                else
                b++; 
            count--;
	    	}
	    }
	    else{
	    	while(count >= 1){
	    		if(count >= k)
                  a++;
                else
                b++;
                count--; 
	    	}
	    }
	    if(a > b)
	    	System.out.println("1");
	    else
	    	System.out.println("2");
	}
	public static void main (String[] args)
	 {
	 //code
	 FastReader s = new FastReader();
	 int t = s.nextInt();
	 while(t--!=0){
	     int n = s.nextInt();
	     int k = s.nextInt();
	     int arr[] = new int[n];
	     for(int i = 0; i < n; i++){
             arr[i] = s.nextInt();
	     }
	     sum(arr, n, k);
	 }
	 }
}
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
	public static void result(int arr[], int n){
	    for(int i = 0; i < n-1; i++){
	        if(arr[i] != 0){
	            if(arr[i+1] == arr[i])
	            {
	                arr[i] = 2*arr[i];
	                arr[i+1] = 0;
	            }
	        }
	    }
	    int i = 0, j = 0;
	    while( i < n && j < n){
	        while(i < n && arr[i] != 0){
	            i++;
	        }
	        while(j < n && arr[j] == 0)
	        j++;
	        if(j < n && i < n && j > i)
	        {
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	        else{
	            j++;
	        }
	    }
	    for(i = 0; i < n; i++)
	    System.out.print(arr[i]+" ");
	    System.out.println();
	}
	public static void main (String[] args)
	 {
	 //code
	 FastReader s = new FastReader();
	 int t = s.nextInt();
	 while(t--!=0){
	     int n = s.nextInt();
	     int arr[] = new int[n];
	     for(int i = 0; i < n; i++)
	     arr[i] = s.nextInt();
	     result(arr, n);
	 }
	 }
}
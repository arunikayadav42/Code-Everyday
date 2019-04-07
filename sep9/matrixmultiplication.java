import java.lang.*;
import java.io.*;
class GFG
 {
     static class FastReader{
	        StringTokenizer st;
	        BufferedReader br;
	        public FastReader(){
	            br = new BufferedReader(new InputStreamReader(System.in));
	        }
	        String next(){
	            
	            while(st==null || !st.hasMoreElements()){
	                try{
	                   st = new StringTokenizer(br.readLine());
	                }
	                catch(IOException e){
	                    e.printStackTrace();
	                }
	            }
	            return st.nextToken();
	        }
	        String nextLine(){
	         String str = "";
	         try{
	             str = br.readLine();
	         }
	         catch(IOException e){
	                    e.printStackTrace();
	                }
	                return str;
	        }
	        int nextInt(){
	            return Integer.parseInt(next());
	        }
	        long nextLong(){
	            return Long.parseLong(next());
	        }
	        double nextDouble(){
	            return Double.parseDouble(next());
	        }
	    }
	    static int matrix(int arr[], int i, int j, int dp[][]){
	        if(i == j)
	        return 0;
	        if(dp[i][j]!=-1)
	        return dp[i][j];
	        int min = Integer.MAX_VALUE;
	        for(int k = i; k < j; k++){
	            int p = matrix(arr, i, k, dp) + matrix(arr, k+1, j, dp) + arr[i-1]*arr[k]*arr[j];
	            if(p < min)
	            min = p;
	        }
	        return dp[i][j]=min;
	    }
	    static void dpUtil(int arr[], int n){
	        int dp[][] = new int[n][n];
	        for(int i = 0; i < n; i++){
	           for(int j = 0; j < n; j++)
	           dp[i][j] = -1;
	        }
	        System.out.println(matrix(arr, 1, n-1, dp));
	    }
	public static void main (String[] args)
	 {
	 //code
	 FastReader s = new FastReader();
	 int t = s.nextInt();
	 while(t--!=0){
	     int n = s.nextInt();
	     int arr[] = new int[n];
	     for(int i = 0; i < n; i++){
	         arr[i] = s.nextInt();
	     }
	    dpUtil(arr, n);
	 }
	 }
}
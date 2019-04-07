import java.util.*;
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
	    public static void display(ArrayList<Integer> p){
	    	System.out.println(p);
	    	System.out.println("here");
	    }
	    public static void printsubset(int arr[], int i, int sum, int dp[][], ArrayList<Integer> p){
             if(i == 1 && sum!=0 && dp[1][sum]==sum)
             {
             	p.add(arr[0]);
             	display(p);
             	p.clear();
             	return;
             }
             if(sum == 0){
             	display(p);
             	p.clear();
             	return;
             }
             if(dp[i-1][sum] > 0){
             	ArrayList<Integer> b = new ArrayList<>();
             	b.addAll(p);
             	//System.out.println("here");
             	printsubset(arr, i-1, sum, dp, b);
             }
             if(sum >= arr[i-1] && dp[i-1][sum-arr[i-1]] > 0){
             	p.add(arr[i-1]);
             	printsubset(arr, i-1, sum-arr[i-1], dp, p);
             }
	    }
	    public static int dp(int arr[], int n, int sum, int dparray[][]){
	        if(sum == 0)
	        return 1;
	        if((n == 0 && sum!=0) || sum < 0)
	        return 0;
	        if(dparray[n][sum] != -1)
	        return dparray[n][sum];
            dparray[n][sum] = (dp(arr, n-1, sum-arr[n-1], dparray)+dp(arr, n-1, sum, dparray));
	        return dparray[n][sum];
	    }
	    public static void print(int arr[][], int n, int sum){
	        for(int i = 0; i < n+1; i++){
	            for(int j = 0; j < sum+1; j++)
	            System.out.print(arr[i][j]+" ");
	            System.out.println();
	        }
	    }
	    public static void dpUtil(int arr[], int n, int sum){
	        int dparray[][] = new int[n+1][sum+1];
	        for(int i = 0; i <n+1; i++){
	            for(int j = 0; j < sum+1; j++)
	            dparray[i][j] = -1;
	        }
	        
	        System.out.println(dp(arr, n, sum, dparray));
	        //print(dparray, n, sum);
	        ArrayList<Integer> p = new ArrayList<>();
             	printsubset(arr, n, sum, dparray, p);
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
	     int sum = s.nextInt();
	     dpUtil(arr, n, sum);
	 }
	 }
}
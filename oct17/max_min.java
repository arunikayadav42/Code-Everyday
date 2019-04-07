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
	    public static int result(int arr[], int n){
	    	int max = -(int)(1e7+9);
	    	for(int i = 0; i < n; i++){
                  max = Math.max(max, arr[i]);
	    	}
	    	return max;
	    }
	public static void main (String[] args)
	 {
	 //code
	 FastReader s = new FastReader();
	 int t = s.nextInt();
	 while(t--!=0){
	     int n1 = s.nextInt();
	     int a[] = new int[n1];
	     for(int i = 0; i < n1; i++)
	     a[i] = s.nextInt();
	     int m1 = result(arr, n1);
	     int n2 = s.nextInt();
	     int b[] = new int[n2];
	     for(int i = 0; i < n2; i++)
	     b[i] = s.nextInt()*(-1);
	     int m2 = result(b, n2)*(-1);
	     System.out.println(m1*m2);
	 }
	 }
}
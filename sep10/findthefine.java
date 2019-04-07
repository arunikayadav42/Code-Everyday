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
	    public static int result(int arr[], int penality[], int n, int date){
	        int fine = 0;
	        for(int i = 0; i < n; i++){
	            if(date % 2 == 0 && arr[i] % 2 != 0)
	            fine += penality[i];
	            else if(date % 2 != 0 && arr[i] % 2 == 0)
	            fine += penality[i];
	        }
	        return fine;
	    }
	public static void main (String[] args)
	 {
	 //code
	 FastReader s = new FastReader();
	 int t = s.nextInt();
	 while(t--!=0){
	     int n = s.nextInt();
	     int date = s.nextInt();
	     int arr[] = new int[n];
	     int penality[] = new int[n];
	     for(int i = 0; i < n; i++){
	         arr[i] = s.nextInt();
	     }
	     for(int i = 0; i < n; i++){
	         penality[i] = s.nextInt();
	     }
	     System.out.println(result(arr, penality, n, date));
	 }
	 }
}
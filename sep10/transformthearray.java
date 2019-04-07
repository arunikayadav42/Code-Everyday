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
	    public static void result(int arr[], int n){
	        int present = 0;
	        int next = 1;
	        for(int i = 1; i < n; i++){
	           // System.out.println(arr[present]+" "+arr[i]);
	            if(arr[i] != 0 && arr[i] == arr[present] && i!=present){
	                arr[i] = 0;
	                arr[present] = arr[present]*2;
	                i = present;
	            }
	            else if(arr[i]!=0){
	                present = i;
	            }
	            
	        }
	        int count = 0;
	        for(int i = 0; i < n; i++){
	            if(arr[i]!=0){
	                arr[count++] = arr[i];
	            }
	        }
	        while(count < n){
	            arr[count++] = 0;
	        }
	        for(int i = 0; i < n; i++)
	        System.out.print(arr[i]+" ");
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
	     System.out.println();
	 }
	 }
}
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
	    public static int result(int a[], int b[], int n, int m, int p){
	        Set<Integer> set = new TreeSet<>();
	        for(int i = 0; i < n; i++){
	            for(int j = 0; j < m; j++){
	                set.add(a[i]+b[j]);
	            }
	        }
	        Iterator<Integer> itr = set.iterator();
	        int count = 1;
	        while(itr.hasNext() && count < p){
	            count++;
	           itr.next();
	        }
	        return itr.next();
	    }
	public static void main (String[] args)
	 {
	 //code
	 FastReader s = new FastReader();
	 int t = s.nextInt();
	 while(t--!=0){
	     int n = s.nextInt();
	     int m = s.nextInt();
	     int a[] = new int[n];
	     int b[] = new int[m];
	     for(int i = 0; i < n; i++)
	     a[i] = s.nextInt();
	     for(int j = 0; j < m; j++)
	     b[j] = s.nextInt();
	     int p = s.nextInt();
	     System.out.println(result(a, b, n, m, p));
	 }
	 }
}
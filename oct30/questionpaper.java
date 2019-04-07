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
	    public static int difffunc(int N, int a, int b){
	    	int min = N*(-1*b);
	    	int max = N*a;
            int terms = 1;
            while(min <= max){
            	//System.out.println(min);
            min += b;
            terms++;
            }
            return terms;
	    }
	    public static void main(String[] args) {
	    	FastReader s = new FastReader();
	    	int t = s.nextInt();
	    	while(t-- != 0){
	    		int N = s.nextInt();
	    		int corr = s.nextInt();
	    		int incorr = s.nextInt();
	    		int diff = difffunc(N, corr, incorr);
	    		System.out.println(diff);
	    	}
	    }
	}
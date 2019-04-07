import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

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
	    public static void result(String s1, String s2){
	        BigInteger a = new BigInteger(s1);
	        BigInteger b = new BigInteger(s2);
	        BigInteger c = a.add(b);
	        String s = c.toString();
	        if(s.length() == s1.length())
	        System.out.println(s);
	        else
	        System.out.println(s1);
	    }
	public static void main (String[] args)
	 {
	 //code
	 FastReader s = new FastReader();
	 int t = s.nextInt();
	 while(t--!=0){
	     String s1 = s.next();
	     String s2 = s.next();
	     result(s1, s2);
	 }
	 }
}
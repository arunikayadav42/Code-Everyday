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
	    public static void result(SortedSet<String> list, String p){
	        
	        for(int i = 0; i < p.length(); i++){
	            String sp = p.substring(0, i+1);
	            int flag = -1;
	            for(String s: list){
	                if(s.startsWith(sp))
	                {
	                    System.out.print(s+" ");
	                    flag = 1;
	                }
	                
	            }
	            if(flag == -1)
	            System.out.print("0");
	            System.out.println();
	        }
	    }
	public static void main (String[] args)
	 {
	 //code
	 FastReader s = new FastReader();
	 int t = s.nextInt();
	 while(t--!=0){
	     int n = s.nextInt();
	     SortedSet<String> list = new TreeSet<>();
	     for(int i = 0; i < n; i++){
	         String p = s.next();
	         list.add(p);
	     }
	     String p = s.next();
	     result(list, p);
	 }
	 }
}
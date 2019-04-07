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
	    public static void result(String s){
	        char cha[] = s.toCharArray();
	        for(int i = 0; i < s.length()-2; i += 2){
	            char ch = cha[i];
	            char mid = cha[i+1];
	            char end = cha[i+2];
	            if(mid == 'A'){
	                int result = (int)(ch-'0') & (int)(end-'0');
	                cha[i+2] = (char)(result+'0');
	            }
	            else if(mid == 'B'){
	                int result = (int)(ch-'0') | (int)(end-'0');
	                cha[i+2] = (char)(result+'0');
	            }
	            else if(mid == 'C'){
	                int result = (int)(ch-'0') ^ (int)(end-'0');
	                cha[i+2] = (char)(result+'0');
	            }
	        }
	        System.out.println(cha[s.length()-1]-'0');
	    }
	public static void main (String[] args)
	 {
	 //code
	 FastReader s = new FastReader();
	 int t = s.nextInt();
	 while(t--!=0){
	     String s1 = s.next();
	     result(s1);
	 }
	 }
}
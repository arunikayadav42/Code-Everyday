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
	    public static void result(String str, Set<Character> set){
	        for(int i = 0; i < str.length(); i++){
	            char ch = str.charAt(i);
	            if(set.contains(ch) || set.contains(Character.toUpperCase(ch)) || set.contains(Character.toLowerCase(ch)))
	            {
	                System.out.print(ch);
	                set.remove(Character.toLowerCase(ch));
	            }
	            else
	            set.add(Character.toLowerCase(ch));
	            //System.out.println(" "+set);
	        }
	    }
	public static void main (String[] args)
	 {
	 //code
	 FastReader s = new FastReader();
	 int t = s.nextInt();
	 while(t--!=0){
	     String str = s.nextLine();
	     Set<Character> set = new HashSet<>();
	     for(int i = 0; i < str.length(); i++){
	         char ch = str.charAt(i);
	         set.add(Character.toLowerCase(ch));
	     }
	     result(str, set);
	     System.out.println();
	 }
	 }
}
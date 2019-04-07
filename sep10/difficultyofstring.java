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
	    public static boolean isVowel(char ch){
	        if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
	        return false;
	        return true;
	    }
	    public static boolean notContainsVowel(String str){
	       if(!str.contains("a") && !str.contains("e") && !str.contains("i") && !str.contains("o") && !str.contains("u"))
	       return true;
	       return false;
	    }
	    public static boolean isHard(String st){
	        int conso = 0;
	            for(int j = 0; j < st.length(); j++){
	                if(!isVowel(st.charAt(j)))
	                {
	                    if(j+4 < st.length() && notContainsVowel(st.substring(j, j+4)))
	                        {
	                            return true;
	                        
	                    }
	                    else
	                    conso++;
	                }
	            }
	                if(st.length()-conso < conso)
	                return true;
	       return false;
	    }
	    public static int result(String s[]){
	        int vowels;
	        int hard = 0;
	        int easy = 0;
	        for(int i = 0; i < s.length; i++){
	            String st = s[i];
	            if(isHard(st))
	            hard++;
	            else
	            easy++;
	            }
	           return 5*hard+3*easy; 
	        }
	public static void main (String[] args)
	 {
	 //code
	 FastReader s = new FastReader();
	 int t = s.nextInt();
	 while(t--!=0){
	     String s1 = s.nextLine();
	     s1 = s1.toLowerCase();
	     String str[] = s1.split(" ");
	     System.out.println(result(str));
	 }
	 }
}
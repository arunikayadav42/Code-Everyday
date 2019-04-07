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
	    public static void result(LinkedHashMap<Integer, Integer> map, int s, int x){
	    	//HashMap<Integer, Integer> map = new HashMap<>();
	    	int box = x;
	    	for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int p = entry.getKey();
            int q = entry.getValue();
            if(box == q)
            	box = p;
            else
            	box = q;
	    	}
	    	System.out.println(box);
	    }
	public static void main (String[] args)
	 {
	 //code
	 FastReader obj = new FastReader();
	 int t = obj.nextInt();
	 while(t--!=0){
	     int n = obj.nextInt();
	     int x = obj.nextInt();
	     int s = obj.nextInt();
	     LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
	     for(int i = 0; i < s; i++)
	     {
	     	int p = obj.nextInt();
	     	int q = obj.nextInt();
	     	map.put(p, q);
	     }
	     result(map, s, x);
	 }
	 }
}
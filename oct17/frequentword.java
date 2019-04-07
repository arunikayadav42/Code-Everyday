import java.io.*;
import java.util.*;
import java.lang.*;

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
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int t = s.nextInt();
		while(t--!=0){
			int n = s.nextInt();
			Map<String, Integer> map = new HashMap<>();
			int max = -(int)(1e7+9);
			String result = "";
			for(int i = 0; i < n; i++){
				String p =s.next();
				if(!map.containsKey(p))
				map.put(p, 1);
				else
					map.put(p, map.get(p)+1);
				if(max <= map.get(p))
					{
						
						if((result.equals("") || result.compareTo(p) > 0) && max == map.get(p))
							result = p;
						else if(max != map.get(p))
							result = p;
						max = map.get(p);
					}
			}
			System.out.println(result);
		}
	}
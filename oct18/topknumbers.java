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
	    public static void result(int p, int k, Map<Integer, Integer> map, TreeMap<Integer, TreeSet<Integer>> set){
	    	if(!map.containsKey(p)){
	    		map.put(p, 1);
	    	}
	    	else{
	    		map.put(p, map.get(p)+1);
	    		TreeSet<Integer> old_set = set.get(map.get(p)-1);
	    		old_set.remove(p);
	    	}
	    	int freq = map.get(p);

	    	TreeSet<Integer> new_set = set.get(freq);
	    	if(new_set == null)
	    	{
	    		new_set = new TreeSet<>();
	    	}
	    	new_set.add(p);
	    	set.put(freq, new_set);
	    	NavigableSet nset = set.descendingKeySet();
	    		for(Object i: nset){
	    			new_set = set.get(i);
	    			for(int j: new_set){
	    				System.out.print(j+" ");
	    				k--;
	    				if(k <= 0)
	    					break;
	    			}
	    			if(k <= 0)
	    			break;
	    		}
	    }
	    public static void main(String[] args){
	    	FastReader s = new FastReader();
	    	int t = s.nextInt();
	    	while(t--!=0){
	    		int n = s.nextInt();
	    		int k = s.nextInt();
	    		Map<Integer, Integer> map = new HashMap<>();
	    		TreeMap<Integer, TreeSet<Integer>> set = new TreeMap<>();
	    		for(int i = 0; i < n; i++){
	    			int p = s.nextInt();
	    			int temp = k;
	    			result(p, temp, map, set);
	    		}
	    	}
	    }
	}
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
	    public static long findFactor(int n){
	    	if(n < 4)
	    		return -1;
	    	else if(n%4 == 0)
	    	{
	    		int nn = n / 4;
	    		return nn * nn * nn * nn;
	    	}
	    ArrayList<Integer> list = new ArrayList<>();
	    list.add(1);
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
           if(n % i == 0)
           {
           	list.add(i);
           	if(i != n/i)
           	list.add(n/i);
           }
        }
        if(list.size() == 1)
        	return -1;
        HashMap<Integer, int[][]> map = new HashMap<>();
        long max = -1;
        for(int i = 0; i < list.size()-1; i++){
        	for(int j = i; j < list.size(); j++){
        		int sum = list.get(i)+list.get(j);
        		if(map.containsKey(sum)){
        			int[][] index = map.get(sum);
        			int oldmul = list.get(index[0][0]) * list.get(index[0][1]);
        			int curmul = list.get(i) * list.get(j);
        			if(curmul > oldmul)
        				map.put(sum, new int[][]{{i, j}});
        		}
        		else{
        			map.put(sum, new int[][]{{i, j}});
        		}
        		int r = n - sum;
        		if(map.containsKey(r)){
        			int[][] index = map.get(r);
        			long pro = list.get(i) * list.get(j) * list.get(index[0][0]) * list.get(index[0][1]);
        			max = Math.max(max, pro);
        		}
        	}
        }
           return max;
	    }
	public static void main (String[] args)
	 {
	 //code
	 FastReader s = new FastReader();
	 int t = s.nextInt();
	 while(t--!=0){
	     int n = s.nextInt();
	     System.out.println(findFactor(n));
	 }
	 }
}
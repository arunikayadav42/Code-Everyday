import java.io.*;
import java.util.*;
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
	    public static int index(int arr[], int n){
        int l = 0, h = n-1, mid = -1;
        while(l <= h){
        	mid = (l+h)/2;
        	if(arr[mid] == 0){
        		l = mid+1;
        	}
        	else if(arr[mid] == 1){
        		if(mid > 0 && arr[mid-1] == 1)
        			h = mid-1;
        		else
        			return mid;
        	}
        }
        if(l > h)
        return -1;
        return mid;
	    }
	    public static void main(String[] args) {
	    	FastReader s = new FastReader();
	    	int t = s.nextInt();
	    	while(t--!=0){
	    		int n = s.nextInt();
                int arr[] = new int[n];
                for(int i = 0; i < n; i++){
                	arr[i] = s.nextInt();
                }
                System.out.println(index(arr, n));
	    	}
	    }
	}
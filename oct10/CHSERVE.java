import java.io.*;
import java.util.*;

class GFG{
	static class FastReader{
            StringTokenizer st;
            BufferedReader br;
            public FastReader(){
                br = new BufferedReader(new InputStreamReader(System.in));
            }            String next(){                
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
        public static String serve(int p1, int p2, int k){
        	int res = p1+p2;
        	int p = (int)Math.floor(res/k);
            if(p % 2 == 0)
            	return "CHEF";
            return "COOK";
        }
        public static void main(String[] args) {
        	FastReader s = new FastReader();
        	int t = s.nextInt();
        	while(t--!=0){
        		int p1 = s.nextInt();
        		int p2 = s.nextInt();
        		int k = s.nextInt();
        		System.out.println(serve(p1, p2, k));
        	}
        }
}
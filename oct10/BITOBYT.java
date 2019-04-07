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
        public static void result(int n){
        int bits = 0, nib = 0, bite = 0;
        int time = 0, overtime = 0;

        while(time+1 <= n){
            if(time +1 <= n && bite != 0){
             while(bite != 0){
                bite--;
                bits++;
             }
            }
            else
            bits++;
            time += 2;
           if(time + 1 <= n)
           {

            while(bits != 0){
                bits--;
                nib++;
            }
            time += 8;
           } 
           if(time + 1 <= n){
            while(nib != 0){
                nib--;
                bite++;
            }
            time += 16;
           }
        }
        System.out.println(bits+" "+nib+" "+bite);
        }
        public static void main(String[] args) {
        	FastReader s = new FastReader();
            int t = s.nextInt();
            while(t--!=0){
                int n = s.nextInt();
                result(n);
            }
        }
}
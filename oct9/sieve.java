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
        public static void sieve(int n){
            boolean prime[] = new boolean[n+1];
            for (int i = 2; i <= Math.sqrt(n); i+=1) {
                if(prime[i] == false){
                    for(int j = 2*i; j <= n; j += i)
                        prime[j] = true;
                }
            }
            for (int i = 2; i < n; i++) {
                System.out.println(i+" "+prime[i]);
            }
        }
        public static void main(String[] args) {
            FastReader s = new FastReader();
            int n = s.nextInt();
            sieve(n);
        }
}
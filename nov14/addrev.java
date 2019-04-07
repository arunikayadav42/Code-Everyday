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
        public static void result(int n1, int n2){
        	String s1 = ""+n1;
            String s2 = ""+n2;
            StringBuilder sb = new StringBuilder(s1);
            s1 = sb.reverse().toString();
            sb = new StringBuilder(s2);
            s2 = sb.reverse().toString();
            int sum = Integer.parseInt(s1)+Integer.parseInt(s2);
            s1 = ""+sum;
            sb = new StringBuilder(s1);
            System.out.println(sb.reverse().toString());
        }
        public static void main(String[] args) {
        	FastReader s = new FastReader();
            int n = s.nextInt();
            while(n-- != 0){
                int n1 = s.nextInt();
                int n2 = s.nextInt();
                result(n1, n2);
            }
        }
}
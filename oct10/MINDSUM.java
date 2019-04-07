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
        public static int digisum(int n){
            int temp = n;
            int sum = 0;
            while(temp != 0){
            sum += temp%10;
            temp /= 10;
            }
            return sum;
        }
        static class number{
            int n;
        }
        public static int result(number obj, int d){
             
        }
        public static void main(String[] args) {
            FastReader s = new FastReader();
            int t = s.nextInt();
            while(t--!=0){
                number obj = new number();
                int obj.n = s.nextInt();
                int d = s.nextInt();
                System.out.println(result(obj, d));
            }
        }
    }
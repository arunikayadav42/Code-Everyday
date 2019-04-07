import java.io.*;
import java.util.*;
import java.lang.*;

public class div11{
	static class FastReader{
		StringTokenizer st;
		BufferedReader br;
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {
			while(st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			return str;
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
    static int countnum = 0;
	static int isdiv11(String s){
		int num = Integer.parseInt(s);
        int count = s.length();
        int sumo = 0, sume = 0;
        while(num > 0){
        	int rem = num%10;
        	if(count%2 == 0){
                sume += rem;
        	}
        	else{
                sumo += rem;
        	}
        	num /= 10;
        	count--;
        }
	}
	static void divisible(String s, int start, Set<Integer> set){
     if(isdiv11(s) == 1)
      {
      	set.add();
      	return;
      }
      else{
      	String ele = "";
      	for(int i = start; i < s.length(); i++){
      		ele += s.charAt(i);
      		is
              
      	}
      }
	}
	public static void main(String[] args){
		FastReader s = new FastReader();
		int t = s.nextInt();
		while(t--!=0){
			int n = s.nextInt();
			Set<Integer> set = new HashSet<Integer>();
			System.out.println(divisible(n+"", 0, set));
		}
	}
}
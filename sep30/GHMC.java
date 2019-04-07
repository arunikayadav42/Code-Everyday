import java.io.*;
import java.util.*;
import java.lang.*;

class program3{
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
	
	static String check(ArrayList<String> l1, ArrayList<String> l2){
		int correct = 0;
		int wrong = 0, count = 0;
		for(String s: l1){
            	if(s.indexOf('0') > 0)
            	correct = 1;
		}
		if(correct == 1)
			return "INVALID";
		for(String s: l2){
			for(int i = 0; i < s.length(); i++)
            {
            	char ch = s.charAt(i);
            	if(ch == '1')
            	count += 1;
            }
            if(count == s.length())
            	wrong = 1;
		}
		if(wrong == 1)
			return "WEAK";
		return "FINE";
	}
	static void add(ArrayList<String> l1, ArrayList<String> l2, String test, String str){
		if(str.equals("correct"))
			l1.add(test);
		else
			l2.add(test);
	}
	public static void main(String[] args){
		FastReader s = new FastReader();
		int t = s.nextInt();
		while(t--!=0){
			int n = s.nextInt();
			int m = s.nextInt();
			
			ArrayList<String> l1 = new ArrayList<String>();
			ArrayList<String> l2 = new ArrayList<String>();
			for(int i = 0; i < n; i++)
				{
					String str = s.next();
					String test = "";
					String p = s.next();
					for(int j = 0; j < m; j++){
                      test = test + p.charAt(i);
					}
					//System.out.println(test);
                    add(l1, l2, test, str);
				}
			System.out.println(check(l1, l2));
		}
	}
}
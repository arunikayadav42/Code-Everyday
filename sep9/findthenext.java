import java.io.*;
import java.util.*;
import java.lang.*;

class findthenext{
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
		int nextInt() {
			return Integer.parseInt(next());
		}
	}
	public static void findnext(ArrayList<Integer> list, int q){
	    int index = list.indexOf(q);
    while(index < list.size() && (list.get(index+1) - list.get(index) <=1)){
        index++;
    }
    System.out.println(list.get(index-1)+1);
	}
	public static void main(String[] args){
		FastReader s = new FastReader();
			int n = s.nextInt();
			int q = s.nextInt();
			ArrayList<Integer> list = new ArrayList<>();
			for(int i = 0; i < n; i++){
				int p = s.nextInt();
				list.add(p);
			}
			while(q--!=0){
				int p = s.nextInt();
				int diff = (int)(1e7+9);
				int result = 0;
                	while(list.contains(p+1))
                		p++;
                	System.out.println(p);
                }
			}
}
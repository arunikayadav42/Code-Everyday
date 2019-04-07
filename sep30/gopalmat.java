import java.io.*;
import java.util.*;
import java.lang.*;

public class gopalmat{
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
	public static HashMap<Integer, Integer> building(int arr[], int l, int r){
		Stack<Integer> s = new Stack<Integer>();
		HashMap<Integer, Integer> map = new HashMap<>();
		s.push(arr[l]);
		int n = r-l+1;
		for(int i = l; i < l+n; i++){
			int next = arr[i];
			if(!s.isEmpty()){
				int element = s.pop();
				while(element < next){
                map.put(element, next);
                if(s.isEmpty())
                	break;
                element = s.pop();
				}
				if(element > next)
					s.push(element);
			}
			s.push(next);
		}
		while(!s.isEmpty()){
			int element = s.pop();
			map.put(element, -1);
		}
		return map;
	}
	public static void main(String[] args){
		FastReader s = new FastReader();
		int n = s.nextInt();
		int q = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = s.nextInt();
		}
		int count = 0;
		for(int i = 0; i < q; i++){
            int l = s.nextInt();
            int r = s.nextInt();
            l = (l+count)%n;
            r = (r+count)%n;
            //System.out.println("*"+l+" "+r);
            if( l > r)
            {
            	int temp = l;
            	l = r; 
            	r = temp;
            }
            HashMap<Integer, Integer> map = building(arr, l, r);
            int j = map.size();
            int k = map.get(arr[l]);
            // for(Map.Entry<Integer, Integer> entry: map.entrySet())
            // 	System.out.println("key:"+entry.getKey()+" "+entry.getValue());
            count = 1;
            while(k!=-1){
			count++;
			k = map.get(k);
            }
            System.out.println(count);
		}
	}
}
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY p as parameter.
     */

    public static int solve(int arr[], int n) {
    // Write your code here
        int diff = 0;
        int max = -(int)(1e7+9);
        int index = -1;
    for(int i = 1; i < n+1; i++){
        int curr = Math.abs(arr[i]-arr[i-1]);
        diff += curr;
    }
        int ans = diff;
        for(int i = 1; i <= n; i++){
            for (int j = i+1; j <= n; j++) {
                int t = diff;
                t -= (Math.abs(arr[i]-arr[i-1])+Math.abs(arr[i]-arr[i+1])+Math.abs(arr[j]-arr[j-1]));
                if(j+1 < n)
                    t -= Math.abs(arr[j]-arr[j+1]);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                if(i > 0)
                t += (Math.abs(arr[i]-arr[i-1])+Math.abs(arr[i]-arr[i+1])+Math.abs(arr[j]-arr[j-1]));
                if(j+1 < n)
                    t += Math.abs(arr[j]-arr[j+1]);
                ans = Math.min(ans, ans+t);
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return ans;
    }
  
}

class Solution {
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
    
    public static void main(String[] args) throws IOException {
        FastReader s = new FastReader();
        int n = s.nextInt();
        int arr[] = new int[n+1];
        arr[0] = 0;
        for(int i = 1; i < n+1; i++)
            arr[i] = s.nextInt();
        System.out.println(Result.solve(arr, n));
    }
}

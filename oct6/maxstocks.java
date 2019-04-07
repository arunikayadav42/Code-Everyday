import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    static long dpbuy(int n, long k, int[] wt, int[] val, long dp[][]){
        if(n == 0 || k == 0)
            return 0;
        if(dp[n][(int)k] != -1)
            return dp[n][(int)k];
        if(wt[n-1] > k || val[n-1] == 0)
            return dp[n][(int)k] = dpbuy(n-1, k, wt, val, dp);
        //val[n-1]--;
        long p = 1+dpbuy(n-1, k-wt[n-1], wt, val, dp);
        //val[n-1]++;
        long q = dpbuy(n-1, k, wt, val, dp);
        return dp[n][(int)k] = Math.max(p, q);
    }
    static long buyMaximumProducts(int n, long k, int[] a) {
        // Complete this function
       int value[] = new int[n];
        for(int i = 0; i < n; i++)
            value[i] = i+1;
        long dp[][] = new long[n+1][(int)k+1];
        for(int i = 0; i <= n; i++)
            Arrays.fill(dp[i], -1);
        for(int i = 0; i <= n; i++){
            for(int j = 0; j < k+1; j++)
                System.out.print(dp[i][j]+" ");
            System.out.println();
        }
        return dp[n][(int)k];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        long k = in.nextLong();
        long result = buyMaximumProducts(n, k, arr);
        System.out.println(result);
        in.close();
    }
}
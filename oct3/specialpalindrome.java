import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import java.util.*;
import java.lang.*;
class GFG
 {
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
        // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        ArrayList<String> list = new ArrayList<>();
     for(int i = 0; i < n; i++){
         char ch = s.charAt(i);
         int index = i;
         list.add(ch+"");
         if(i < n-1 && s.charAt(i+1) == ch){
             list.add(ch+""+s.charAt(i+1));
             if(i != 0){
                 int j = i+2;
                 i = i-1;
                 while(j < n && i >= 0 && s.charAt(i) == s.charAt(j) && s.charAt(i) == s.charAt(i+1))
                 {                     list.add(s.substring(i, j+1));
                     i--;
                     j++;
                     
                 }
             }w
         }
         i = index;
         if(i!=0 && i < n-1 && s.charAt(i+1) == s.charAt(i-1)){
             //if(!list.contains(s.substring(i-1, i+2)))
             list.add("*"+s.substring(i-1, i+2));
             int j = i+2;
             i = i-2;
             while(j < n && i >= 0 && s.charAt(i) == s.charAt(j) && s.charAt(i) == s.charAt(i+1)){
                 list.add("*"+s.substring(i, j+1));
                 i--;
                 j++;
             }
         }
         i = index;
     }
        for(String st: list){
            System.out.println(st);
        }
        return list.size();
    }
    public static void main (String[] args)
     {
     //code
     FastReader s = new FastReader();
     int t = s.nextInt();
     while(t--!=0){
         int n = s.nextInt();
         String st = s.next();
         System.out.println(substrCount(n, st));
     }
     }
}
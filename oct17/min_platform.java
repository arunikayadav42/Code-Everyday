import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static class FastReader{
	        StringTokenizer st;
	        BufferedReader br;
	        public FastReader(){
	            br = new BufferedReader(new InputStreamReader(System.in));
	        }
	        String next(){
	            
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
	public static int result_sol(ArrayList<Character> result, ArrayList<Integer> result2, int plat){
		int max = -(int)(1e7+9);
		int count = 0;
		for(char i: result){
			if(i == 'a')
				plat++;
            else if(i == 'd')
            	plat--;
            max = Math.max(plat, max);
           System.out.println(plat+" "+result2.get(count)+" "+i);
            count++;
		}
		return max;
			}
	public static void main (String[] args)
	 {
	 //code
	 FastReader s = new FastReader();
	 int t = s.nextInt();
	 while(t--!=0){
	     int n = s.nextInt();
	     ArrayList<Integer> arr = new ArrayList<>();
	     ArrayList<Integer> dep = new ArrayList<>();
	     ArrayList<Character> result = new ArrayList<>();
	     ArrayList<Integer> result2 = new ArrayList<>();
	     //Map<Integer, Character> map = new LinkedHashMap<>();
	     int count = 0;
	     for(int i = 0; i < n; i++)
	    	arr.add(s.nextInt());
	     for(int i = 0; i < n; i++)
	     	{
	     		dep.add(s.nextInt());
	     		
	     	}
	     for(int i = 0; i < arr.size(); i++){

	     	if(a > d){
	     		d += 2400;
	     		dep.add(d, i);
	     	}
	     	//System.out.println(count);
	     }
	     Collections.sort(arr);
	     Collections.sort(dep);
	     int i = 0, j = 0;
	     while(i < arr.size() && j < dep.size()){
	     	int a = arr.get(i);
	     	int d = dep.get(j);
	     	if(a < d)
            {
            	result.add('a');
            	result2.add(a);
            	i++;
            }
            else if(a > d){
            	result.add('d');
            	result2.add(d);
            	j++;
            }
            else{
            	if(i == j)
            	{
            		count++;
	     		arr.remove(i);
	     		dep.remove(i);
            	}
            }
	     }
	     if(i != arr.size())
	     {
	     	while(i != arr.size()){
	     		result.add('a');
	     		result2.add(arr.get(i));
	     		i++;
	     	}
	     }
	     if(j != dep.size()){
	     	while(j != dep.size()){
	     		result.add('d');
	     		result2.add(dep.get(j));
	     		j++;
	     	}
	     }
	     // for(i = 0; i < n*2; i++){
	     // 	System.out.println(result2.get(i)+" "+result.get(i)+" "+(i+1));
	     // }
	     System.out.println(result_sol(result, result2, count));
	 }
	 }
}
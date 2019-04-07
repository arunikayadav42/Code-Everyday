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
	    public static class Node{
	    	int value;
	    	int i, j;
	    	public Node(int v, int i, int j){
	    		value = v;
	    		this.i = i;
	    		this.j = j;
	    	}
	    }
	    public static void heapify(Node heap[], int i, int n){
	    	int l = 2*i+1;
	    	int r = l+1;
	    	int smallest = i;
	    	if(l < n && heap[i].value > heap[l].value)
	    	{
             smallest = l;
	    	}
	    	if(r < n && heap[smallest].value > heap[r].value)
	    		smallest = r;
	    	if(smallest != i){
	    		Node temp = heap[i];
	    		heap[i] = heap[smallest];
	    		heap[smallest] = temp;
	    		//printHeap(heap, n);
	    		heapify(heap, smallest, n);
	    	}

	    }
	    public static void printHeap(Node heap[], int k){
	    	for(int i = 0; i < k; i++)
	    		System.out.print(heap[i].value+" ");
	    	System.out.println();
	    }
	    public static void result(int arr[][], int n, int k){
	    	Node heap[] = new Node[k];
	    	int min = (int)(1e7+9);
	    	int max = -(int)(1e7+9);
	    	int mindiff = (int)(1e7+9);
	    	for(int i = 0; i < k; i++){
	    		Node node = new Node(arr[i][0], i, 0);
	    		heap[i] = node;
	    		if(max < heap[i].value)
	    			max = heap[i].value;
	    	}
	    	//printHeap(heap, k);
	    	for(int j = k/2-1; j >= 0; j--){
                heapify(heap, j, k);
                //printHeap(heap, k);
	    		}
	    	while(heap[0].j < n-1){
	    		//printHeap(heap, k);;
	    		min = heap[0].value;
                mindiff = Math.min(mindiff, max - min+1);
                int indexi = heap[0].i;
                int indexj = heap[0].j;
                heap[0].value = arr[indexi][indexj+1];
                heap[0].i = indexi;
                heap[0].j = indexj+1;
                if(max < heap[0].value)
                	max = heap[0].value;
                System.out.println(min+" "+max+" "+mindiff);
                heapify(heap, 0, k);
	    	}
	    	min = heap[0].value;
            mindiff = Math.min(mindiff, max - min+1);
	    	System.out.println(mindiff);
	    }
	public static void main (String[] args)
	 {
	 //code
	 FastReader s = new FastReader();
	 int t = s.nextInt();
	 while(t--!=0){
	     int n = s.nextInt();
	     int k = s.nextInt();
	     int arr[][] = new int[k][n];
	     for(int i = 0; i < k; i++)
	     {
	     	for(int j = 0; j < n; j++){
	     		arr[i][j] = s.nextInt();
	     	}
	     }
	     result(arr, n, k);
	 }
	 }
}
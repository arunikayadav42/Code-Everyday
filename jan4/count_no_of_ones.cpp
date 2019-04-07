#include <bits/stdc++.h>

using namespace std;

int m, n;

void count_ones(int **a){
	int count = 0;
   for(int i = 0; i < m; i++){
   	int l = 0, h = n;
   	int index = -1;
   	while(l <= h){
   		int mid = (l + (h-l)/2);

   		if((a[i][mid-1] == 0 || mid == 0) && a[i][mid] == 1){
   			index = mid;
   			break;
   		}
   		else if(a[i][mid] == 0)
   		{
   			l = mid+1;
   		}
   		else
   			h = mid-1;
   		}
   		if(index != -1){
   		int result = n-index;
   		if(count < result)
   			count = result;
   	}
   	}
   	
   cout<<count<<endl;
   return;
}

int main(){
	int t;
	cin>>t;
	cin>>m>>n;
    int **arr = new int*[m];
	for(int i = 0; i < m; i++){
	    arr[i] = new int[n];
		for(int j = 0; j < n; j++){
			cin>>arr[i][j];
		}
	}
	count_ones(arr);

	return 0;
}


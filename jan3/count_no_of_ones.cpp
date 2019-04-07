#include <bits/stdc++.h>

using namespace std;

int m, n;

void count_ones(int **a){
	int count = 0;
   for(int i = 0; i < m; i++){
   	for(int j = 0; j < n; j++){
   		if(a[i][j] == 1){
           count += n-j;
           break;
   		}
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


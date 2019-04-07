#include <bits/stdc++.h>
using namespace std;

#define ll long long

ll number_of_subarrays(ll b[], int k, ll size){
	ll sum = b[0], count = 0;
	int start = 0, end = 0;
	while(end < size && start < size){
		if(sum <= k)
			{
				end++;
				if(end >= start)
					count += end-start;
				if(end < size)
					sum += b[end];
			}
		else{
					sum -= b[start];
					start++;
		}

	}
	
	return count;
}

int main(){
	ll t, n, m, k;
	cin>>t;
	while(t-- != 0)
	{
		cin>>n>>m>>k;
	ll b[n*m];
	ll a[n];
	for(int i = 0; i < n; i++)
		cin>>a[i];
	for(int i = 0; i < n*m; i += n){
		copy(a, a+n, b+i);
	}
	cout<<number_of_subarrays(b, k, m*n)<<endl;
	}
}
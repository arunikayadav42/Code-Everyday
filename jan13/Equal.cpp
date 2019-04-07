#include <bits/stdc++.h>
#define ll long long int

using namespace std;

int main(){
    ll T, N;
    cin>>T;
    while(T--){
    	int n;
    	cin>>n;
    	ll a[n];
    	ll min_val = 100000;
    	for(int i = 0; i < n; i++){
    		cin>>a[i];
    		min_val = min(a[i], min_val);
    	}
    	ll sum = 1000000;
    	for(int i = 0; i < 3; i++){
    		ll count = 0;
    		for(int j = 0; j < n; j++){
    			ll delta = a[j]-min_val+i;
                count +=(int) (delta/5) + (delta%5)/2 + ((delta%5)%2)/1;
    		}
    		sum = min(sum, count);
    	}
    	cout<<sum<<endl;
    }
	return 0;
}
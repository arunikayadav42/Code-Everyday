#include <bits/stdc++.h>

using namespace std;

void find_closest(int n, int m){
     int q = n/m;
     int n1 = q*m;

     int n2 = (m*n) > 0? m*(q+1): m*(q-1);
     int result = abs(n-n1) >= abs(n-n2)? n2: n1;
     cout<< result<<endl;
}

int main(){
	int t;
	cin>>t;
	while(t-- != 0){
		int n, m;
		cin>>n>>m;
        find_closest(n, m);
	}
	return 0;
}
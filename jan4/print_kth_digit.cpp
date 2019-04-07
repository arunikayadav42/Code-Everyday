#include <bits/stdc++.h>
#define ll long long

using namespace std;

int main(){
	int t;
	cin>>t;
	while(t-- != 0){
		ll a, b, k, pro = 1;
		cin>>a>>b>>k;
		while(b-- != 0){
			pro *= a; 
		}
		ostringstream str1;
		str1 << pro;
		string str = str1.str();
		cout<<str[str.length()-k]<<endl;
	}
	return 0;
}
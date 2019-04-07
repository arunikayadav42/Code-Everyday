#include <bits/stdc++.h>

using namespace std;
typedef long long int i64;

i64 call(i64 n){
	i64 ans = 1;
	int flag = -1;
	while(n){
		i64 b = n & 1;
		n = n >> 1;
		if(flag == -1)
			flag = 1;
		else if(!b)
			ans = ans * 2;
	}
	return ans;
}

int main(){
    i64 n;
    cin>>n;
    cout<<call(n)<<endl;
	return 0;
}
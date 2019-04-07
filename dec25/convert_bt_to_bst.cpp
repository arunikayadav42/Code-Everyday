#include <bits/stdc++.h>
using namespace std;

vector<int> v;
int n;
int a[100100];
map<int, int> m;

void inorder(int x){
	int l = x << 1;
	int r = l+1;
	if(l <= n) inorder(l);
	v.push_back(a[x]);
	if(r <= n) inorder(r);
}

int main(){
	cin>>n;
	for(int i = 1; i <= n; i++)
		cin>>a[i];
	inorder(1);
	for(int i = 0; i < n; i++){
       a[i+1] = v[i];
       m[a[i+1]] = 0;
	}
    
    int count = 1;
	for(auto it: m)m[it.first] = count++;
	for(int i = 1; i <= n; i++)
		a[i] = m[a[i]];
	
	int vis[100100] = {0};
	int ans = 0;
	for(int i = 1; i <= n; i++){
		vis[i] = 1;
		int x = i;
		while(!vis[a[x]]){
			x = a[x];
			vis[x] = 1;
			ans++;
		}
	}
	cout<<ans<<endl;
	return 0;	
}
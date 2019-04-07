#include <bits/stdc++.h>

#define ll long long
using namespace std;

ll n;

int main(){
	cin>>n;
    ll K;
    cin>>K;
	ll a[n+1];
    for(int i = 1; i < n+1; i++){
       cin>>a[i];
    }
    ll par[n+1];
    for(int i = 2; i <= n; i++){
        cin>>par[i];
    }
    ll anc[n+1][n+1] = {0};
    
    ll root = 1;
    for(int i = 2; i<= n; i++){
        ll x = i;
        while(x != root)
        { 
            x = par[x];
            anc[x][i] = 1;
        }
    }
    int ans = 0;
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n; j++){
            for(int k = 1; k <= n; k++){
                  if(i != j && j != k && k != i){
                    if(anc[i][j] && anc[i][k] && a[i]+a[j]+a[k] >= K)
                            ans++;
                  }
            }
        }
    } 
    cout<<ans/2<<endl;
	return 0;
}
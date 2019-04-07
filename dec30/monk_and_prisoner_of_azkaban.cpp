#include <bits/stdc++.h>
#define ll long long int
using namespace std;

ll n;

void find_y(ll a[], ll y[]){
      stack<ll> st;
      st.push(1);
      for(int i = 1; i <= n; i++){
         if(!st.empty() && a[st.top()] > a[i])
         	st.push(i);
         else{
         	while(!st.empty() && a[st.top()] < a[i]){
         		y[st.top()] = i;
         		st.pop();
         	}
         	st.push(i);
         }
      }
      while(!st.empty()){
      	y[st.top()] = -1;
      	st.pop();
      }
      // for(int i = 1; i <= n; i++)
      // 	cout<<y[i]<<" ";
}

void find_x(ll a[], ll x[]){
stack<ll> st;
      st.push(1);
      x[1] = -1;
      for(int i = n; i >= 1; i--){
         if(!st.empty() && a[st.top()] > a[i])
         	st.push(i);
         else{
         	while(!st.empty() && a[st.top()] < a[i]){
         		x[st.top()] = i;
         		st.pop();
         	}
         	st.push(i);
         }
      }
      while(!st.empty()){
      	x[st.top()] = -1;
      	st.pop();
      }
      // for(int i = 1; i <= n; i++)
      // 	cout<<x[i]<<" ";
}

int main(){
    cin>>n;
    ll a[n+1];
    ll y[n+1];
    ll x[n+1];
    for(int i = 1; i <= n; i++)
    	cin>>a[i];
    find_y(a, y);
    find_x(a, x);
    for(int i = 1; i <= n; i++)
    	cout<<y[i] + x[i]<<" ";
    cout<<""<<endl;
	return 0;
}
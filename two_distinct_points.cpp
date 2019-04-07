#include<bits/stdc++.h> 
#define ll long long int
using namespace std; 
   
  
// Driver program to test above functions 
int main() 
{ 
     
    int q;
    cin>>q;
    while(q-- != 0)
    {
        ll l1, r1, l2, r2;
        cin>>l1>>r1>>l2>>r2;
        vector<ll> a({l1, r1, l2, r2});
        int ans1 = 0, ans2 = 0;
        for(auto it: a)
        {
            for(auto jt: a)
            {
                if(l1 <= it && it <= r1 && l2 <= jt && jt <= r2 && it != jt)
                {
                    ans1 = it;
                    ans2 = jt;
                }
            }
        }
        cout<< ans1 << " " << ans2 << endl;
    }
    return 0; 
}
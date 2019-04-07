#include <bits/stdc++.h>

using namespace std;

int main()
{
	int n;
	string s;
	cin>>n>>s;
	int ans = 0;
	for(int i = 0; i < n; i++)
	{
       int j = i;
       while(j < n && s[i] == s[j])
       {
       	  j++;
       }
       string colors = "RGB";
       colors.erase(colors.find(s[i]), 1);
       if(j < n)
       	colors.erase(colors.find(s[j]), 1);
       for(int k = i+1; k < min(j, n); k+=2)
       {
          ans++;
          s[k] = colors[0];
       }
       i = j-1;
	}
	cout<<ans<<endl << s<<endl;
}
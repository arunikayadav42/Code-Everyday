#include <bits/stdc++.h>

using namespace std;

int main()
{
	int n;
	cin>>n;
	multiset<int> a;
	for(int i = 0; i < n; i++)
	{
		int p;
		cin>>p;
        a.insert(p);
	}
	int x = *prev(a.end());
	for(int i = 1; i <= x; i++)
	{
        if(x % i == 0)
        {
        	a.erase(a.find(i));
        }
	}
	cout<<x<<" "<<*prev(a.end())<<endl;
	return 0;
}
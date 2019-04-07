#include <bits/stdc++.h>

using namespace std;

int main()
{
	int n;
	cin>>n;
	int x = 0, y = 0, z = 0;
	for(int i = 0; i < n; i++)
	{
        int p;
        cin>>p;
        x += p;
        cin>>p;
        y += p;
        cin>>p;
        z += p;
	}
	if(x == 0 && y == 0 && z == 0)
		cout<<"YES";
	else
		cout<<"NO";
	cout<<endl;
	return 0;
}
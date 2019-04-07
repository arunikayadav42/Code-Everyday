#include <bits/stdc++.h>

using namespace std;

int main()
{
	int n;
	//vector<int> vec;
	cin>>n;
	double result = 0.0;
	for(int i = 0; i < n; i++)
	{
		int p;
		cin>>p;
		result += (p*(1.0))/100;
	}
    result = (result/n)*100;
    cout<<result<<endl;
	return 0;
}
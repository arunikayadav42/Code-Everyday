#include <bits/stdc++.h>

using namespace std;

int main()
{
	int n;
	cin>>n;
	int x, y;
	cin>>x;
	vector<int> vec(2*n);
	for(int i = 0; i < x; i++){
		int p;
		cin>>p;
		vec[p-1] = 1;
	}
     cin>>y;
	for(int i = x; i < y+x; i++){
        int p;
		cin>>p;
		vec[p-1] = 1;
	}
    int mini = *min_element(vec.begin(), vec.begin()+n);
    //cout<<maxi;
    if(mini == 1)
    	cout<<"I become the guy.\n";
    else
    	cout<<"Oh, my keyboard!\n";
	return 0;
}
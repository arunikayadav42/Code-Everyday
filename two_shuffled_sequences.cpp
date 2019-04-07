#include <bits/stdc++.h>

using namespace std;

int main()
{
	int n;
	vector<int> vec(n);
	for(int i = 0; i < n; i++){
		cin>>vec[i];
	}
	sort(vec.begin(), vec.end());
	set<int> set1(vec.begin(), vec.end());
	vector<int> result1;
	for(int i = 0; i < set1.size(); i++){
        vec.erase(s);
	}
	return 0;
}
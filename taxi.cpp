#include <bits/stdc++.h>

using namespace std;

vector<int> vec;

void printVector()
{
	vector<int>::iterator it;
	for(it = vec.begin(); it < vec.end(); it++)
		cout<<*it<<" ";
	cout<<"\n";
}

int main()
{
	int n;
	cin>>n;
	
	for(int i = 0; i < n; i++)
	{
		int p;
		cin>>p;
		vec.push_back(p);
	}
	vector<int> size_vector(5);
	for(int i = 0; i < n; i++)
	{
      if(vec[i] == 1)
      	size_vector[1]++;
      else if(vec[i] == 2)
      	size_vector[2]++;
      else if(vec[i] == 3)
      	size_vector[3]++;
      else if(vec[i] == 4)
      	size_vector[4]++;
	}
    int count = size_vector[4];
    count += size_vector[2]/2;
    count += size_vector[3];

    size_vector[1] -= size_vector[3];

    bool odds2 = (size_vector[2]%2) == 1;

    if(odds2)
    	count++;
    if(size_vector[1] > 0)
    {
    	if(odds2)
    		size_vector[1] -= 2;
    }
	if(size_vector[1] > 0)
	{
		count += (size_vector[1]+3)/4;

	}
	cout<<count<<endl;
	return 0;
}
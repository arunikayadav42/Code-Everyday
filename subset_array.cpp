#include <bits/stdc++.h>

using namespace std;

void find(int arr[], int length, int s)
{
	for(int i = 1; i <= pow(2, length); i++)
	{
		int sum = 0;
		for(int j = 0; j < length; j++)
		{

			if(i & (1<<j))
			{
				sum += arr[j];
			}
		}
		if(sum == s)
		{
			cout<<"YES"<<endl;
			return;
		}
	}
	cout<<"NO"<<endl;
}

int main()
{
	int arr[] = {-1, 2, 4, 121};
	int length = sizeof(arr)/sizeof(int);
    int sum = 18;
	find(arr, length, sum);

	return 0;
}
#include <bits/stdc++.h>

using namespace std;

int getMid(int ss, int se)
{
	return ss + (se-ss)/2;
}


int getXor(int* st, int ss, int se, int l, int r, int index)
{
   if(l <= ss && r >= se)
   {
   	return st[index];
   }

   if(l > ss || r < se)
   {
   	return 0;
   }
   int mid = getMid(ss, se);
   return getXor(st, ss, mid, l, r, 2*index+1) ^ getXor(st, ss, mid+1, l, r, 2*index+2);
}

int constructSt(int arr[], int* st, int ss, int se, int si)
{
    if(ss == se)
    {
    	st[si] = arr[ss];
    	return st[si];
    }

    int mid = getMid(ss, se);

    return st[si] = constructSt(arr, st, ss, mid, 2*si+1) ^ constructSt(arr, st, ss, mid, 2*si+2);
}

int* getSegmentTree(int arr[], int ss, int se, int si, int n)
{
	int x = (int)(ceil(log2(n)));
	int max_size = 2 * (int)(pow(2, x)) - 1;

	int* st = new int[max_size];

	constructSt(arr, st, 0, n-1, 0);
	return st;
}

int main()
{
	int n;
	cin>>n;
	int arr[n];
	for(int i = 0; i < n; i++)
	{
		cin>>arr[i];
	}
    int* st = getSegmentTree(arr, 0, n-1, 0, n);

    cout<<"Xor in given range = "<<getXor(st, 0, n-1, 1, 3, 0)<<endl;
	return 0;
}
#include <bits/stdc++.h>

using namespace std;

int main(){
	int t, N, L;
	priority_queue<queue<int>> process;
	while(t-- != 0){
		cin>>N>>L;
        for(int i = 1; i <= N; i++){
        	queue<int> q;
        	for(int i = 0; i < L; i++)
        		{
        			int p;
        	    cin>>p;
        		queue.push(p);
        		}
        		process.push(queue);
        }
        
	}
	return 0;
}
#include <bits/stdc++.h>

using namespace std;

int visited[109] = {0}, outgoing[109], claim[109], truth[109];
vector<int> incoming[109];
int flag = 0;
stack<int> st;

void dfs(){
   while(!st.empty()){
    int start = st.top();
    st.pop();
    if(visited[start])
      continue;
    visited[start] = 1;
    int val = claim[start];
    int tval = truth[start] == 1 ? val: not(val); 
    
    int out_node = outgoing[start];
    //cout<<parent<<" is "<<bool(parent_value)<<" child "<<child<<" is "<<val<<"\n";
    if(!visited[out_node])
    {
      truth[out_node] = tval;
      st.push(out_node);
    }
   else if(tval != truth[out_node]){
    flag = 0;
    return;
   }

    //for incoming nodes
    for(int i = 0; i < incoming[start].size(); i++){
     int in_node = incoming[start][i];
     val = claim[in_node];
     tval = truth[start] == 1 ? val: not(val);
     if(!visited[in_node])
    {
      truth[in_node] = tval;
      st.push(in_node); 
    }
   else if(tval != truth[in_node]){
    flag = 0;
    return;
   }
    }
   }
   }

int main(){
	int n;
	
	while(true){
		cin>>n;
		if(n == 0)
			break;
    flag = 1;
    while(!st.empty())
      st.pop();
     for(int i = 0; i <= n; i++){
      truth[i] = 0;
      claim[i] = 0;
      outgoing[i] = 0;
      visited[i] = 0;
      incoming[i].clear();
     }
     int temp = 1;
     while(temp <= n){
     	int num;
     	string val;
     	cin>>num>>val;
     	if(val[0] == 't')
       claim[temp] = 1;
       outgoing[temp] = num;
       incoming[num].push_back(temp);
       st.push(temp);
     	//cout<<m[temp].first<<" "<<m[temp].second<<" ";
     	temp++;
     }
    // cout<<temp<<" ";
     
     		//cout<<"m[0].second "<<m[0].second<<" ";
     		dfs();
     if(flag == 0)
      cout<<"PARADOX";
    else
      cout<< "NOT PARADOX";
    cout<<endl;
	}
	return 0;
}
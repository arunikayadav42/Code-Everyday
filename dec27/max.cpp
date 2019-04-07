// Author - abbi_18
#include<bits/stdc++.h>
#include <stdint.h>
 
using namespace std;
 
#define ff first
#define ss second
#define pb push_back
#define mp make_pair
#define eps 1e-9
#define inf 1e18
#define PI 3.14159265
 
const int MOD = 1e9+7;
const int N = 1e6+5;
 
typedef long long int ll;
typedef int64_t lln;

 
 
struct node{
	ll data;
	node* left;
	node* right;
};
 
node* create_node(ll num){
	node* temp = new node;
	temp->data = num;
	temp->left = temp->right = NULL;
	return temp;
}
 
node* insert(node* root,ll num){
	if (root == NULL){
		return create_node(num);
	}
	if (root->data < num)
		root->right = insert(root->right,num);
	else if (root->data > num)
		root->left = insert(root->left,num);
 
	return root;
}
 
int maxi=0;
node *subroot=NULL;
 
void find(node* root,int x,int y){
	if (root == NULL){
		return ;
	}
	if ((root->data) >= x && (root->data) <= y){
		subroot = root;
		return ;
	}
	find(root->left,x,y);
	find(root->right,x,y);
}
 
void iterate(node* nroot,int num){
	if (nroot== NULL){
		return ;
	}
	if (nroot->data == num){
		return ;
	}
	if (nroot->data > maxi){
		maxi = nroot->data;
	}
	if (nroot->data < num){
		iterate(nroot->right,num);
		return;
	}
	if (nroot->data > num){
		iterate(nroot->left,num);
		return ;
	}
}
 
int main()
{
	node* root = NULL;
	int n;	scanf("%d",&n);
	vector<int> A(n);
	for (int i=0;i<n;i++){
		scanf("%d",&A[i]);
		root = insert(root,A[i]);
	}
	int x,y;
	scanf("%d %d",&x,&y);
	
	find(root,min(x,y),max(x,y));
	node* nroot = subroot;
	maxi = max(x,y);
	iterate(nroot,x);
	iterate(nroot,y);
	
	printf("%d\n",maxi);
	
	return 0;
}
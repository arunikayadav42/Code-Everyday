#include <bits/stdc++.h>
using namespace std;

int n;
int a[1000];

struct Node
{
	int data;
	struct Node* left;
	struct Node* right;
};

struct Node* newNode(int data){
	struct Node* node = (struct Node*) malloc(sizeof(struct Node));

	node->data = data;
	node->left = NULL;
	node->right = NULL;

	return node;
}

int height(struct Node* root){
	if(root == NULL)
		return 0;

	return max(1+height(root->left), 1+height(root->right));
}
int main(){
    cin>>n;
    for(int i = 0; i < n; i++)
    	cin>>a[i];
    struct Node* root = NULL;
    for(int i = 0; i < n; i++){
    	int data = a[i];
        struct Node* node = newNode(data);
        if(root == NULL)
        	root = node;
        else{
        	struct Node* curr = root;
        	struct Node* parent = root;
        	while(true){
        		if(data < curr->data){
        			parent = curr;
        			curr = curr->left;
        			if(curr == NULL)
        				break;
        		}
        		else if(data >= curr->data){
        			parent = curr;
        			curr = curr->right;
        			if(curr == NULL)
        				break;
        		}
        	}
        	if(data < parent->data)
        		parent->left = node;
        	else if(data > parent->data)
        		parent->right = node;
        }
    }
	return 0;
}
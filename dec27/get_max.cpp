#include <bits/stdc++.h>
using namespace std;
 
int n;
int a[1000];
int max_value = 0;
struct Node *subroot = NULL;

typedef long long int ll;

struct Node
{
	ll data;
	struct Node* left;
	struct Node* right;
};
 
struct Node* newNode(ll data){
	struct Node* node = (struct Node*) malloc(sizeof(struct Node));
 
	node->data = data;
	node->left = NULL;
	node->right = NULL;
 
	return node;
}

struct Node* insert(Node *root, ll temp){
    if(root == NULL)
        return newNode(temp);
    if(root->data < temp)
        root->right = insert(root->right, temp);
    else if(root->data > temp)
        root->left = insert(root->left, temp);

    return root;
}

void find_lca(Node *root, int l, int h){
     if(root == NULL)
        return;
     if(root->data >= l && root->data <= h)
     {
        subroot = root;
        return;
     }
     find_lca(root->left, l, h);
     find_lca(root->right, l, h);
}

void get_item(Node *sub, int temp){
    if(sub == NULL)
        return;
    if(sub->data == temp)
        return;
    if(sub->data > max_value)
        max_value = sub->data;
    
    if(sub->data < temp)
    {
        get_item(sub->right, temp);
        return;
    }
    else if(sub->data > temp){
        get_item(sub->left, temp);
        return;
    }
}

int main(){
    cin>>n;
    struct Node* root = NULL;
    for(int i = 0; i < n; i++)
    	{
            int s;
            cin>>s;
            root = insert(root, s);
        }
    int l, h;
    cin>>l;
    cin>>h;
    find_lca(root, min(l, h), max(l, h));
    max_value = max(l, h);
    struct node* nroot = subroot;
    get_item(nroot, l);
    get_item(nroot, h);
    cout<<max_value<<endl;
	return 0;
}
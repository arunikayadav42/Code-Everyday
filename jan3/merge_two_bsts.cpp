void inorder(Node *node){
	if(node == NULL)
		return;

	inorder(root->left);
	cout<<root->data<<endl;
	inorder(root->right);
}

void merge(Node *root1, Node *root2){
	stack<Node *> s1;
	stack<Node*> s2;
	Node *temp1 = root1;
	Node *temp2 = root2;
    
    if(root1 == NULL)
    {
    	inorder(root2);
    	return;
    }

    if(root2 == NULL){
    	inorder(root1);
    	return;
    }

    while(!temp1 != NULL || !temp2 != NULL || !s1.isempty() || !s2.isempty()){
    	if(temp1 != NULL || temp2 != NULL){
    		if(temp1 != NULL){
    			s1.push(temp1);
    			temp1 = temp1->left;
    		}
    		if(temp2 != NULL){
    			s2.push(temp2);
    			temp2 = temp2->left;
    		}
    	}
    	else{
    		if(s1.isempty()){
    			while(!s2.isempty()){
    				temp2 = s2.pop();
    				temp2->left = NULL;
    				inorder(temp2);
    			}
    		}
    		if(s2.isempty()){
    			while(!s1.empty()){
    				temp1 = s1.pop();
    				temp1->left = NULL;
    				inorder(temp1);
    			}
    		}
    		temp1 = s1.top();
    		s1.pop();
    		temp2 = s2.top();
    		s2.pop();

    		if(temp1->data < temp2->data){
    			cout<<temp1->data;
    			temp1 = temp1->right;
    			s2.push(temp2);
    			temp2 = NULL;
    		}
    		else{
    			cout<<temp2->data;
    			temp2 = temp2->right;
    			s2.push(temp1);
    			temp1 = NULL;
    		}
    	}
    }
return;
}
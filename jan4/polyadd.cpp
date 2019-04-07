#include<bits/stdc++.h>
using namespace std;
/* Link list Node */
struct Node
{
    int coeff;
    int pow;
    struct Node* next;
};
void append(struct Node** head_ref, struct Node **tail_ref,
            int new_data, int new_data1)
{
    struct Node* new_node = new Node;
    new_node->coeff  = new_data;
    new_node->pow  = new_data1;
    new_node->next = NULL;
    if (*head_ref == NULL)
        *head_ref = new_node;
    else
        (*tail_ref)->next = new_node;
    *tail_ref = new_node;
}
void printList(struct Node *head)
{
    struct Node *temp = head;
    while (temp != NULL)
    {
       printf("%d %d ", temp->coeff,temp->pow);
       temp  = temp->next;
    }
}
void addPolynomial(Node *p1, Node *p2);
void create_node(int x, int y, struct Node **temp)
{
    struct Node *r, *z;
    z = *temp;
    if(z == NULL)
    {
        r =(struct Node*)malloc(sizeof(struct Node));
        r->coeff = x;
        r->pow = y;
        *temp = r;
        r->next = NULL;
    }
    else
    {
        r->coeff = x;
        r->pow = y;
        r->next = (struct Node*)malloc(sizeof(struct Node));
        r = r->next;
        r->next = NULL;
    }
}
 
/* Driver program to test above function*/
int main()
{
    
    int t;
    cin>>t;
    while(t--)
    {
        struct Node *poly1 = NULL, *poly2 = NULL, *poly = NULL;
        struct Node *tail1  = NULL,*tail2 = NULL;
        int n;
        cin>>n;
        for(int i=0;i<n;i++)
        {
            int x,y;
            cin>>x>>y;
            	append(&poly1,&tail1,x,y);
        }
        
         int m;
        cin>>m;
        for(int i=0;i<m;i++)
        {
            int x,y;
            cin>>x>>y;
            	append(&poly2,&tail2,x,y);
        }
        
        //show(poly2);
        // printList(poly1);
        // cout<<endl;
        // printList(poly2);
     
        addPolynomial(poly1,poly2);
        
        cout<<endl;
       
    }
}


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* Structure of Node used
struct Node
{
    int coeff;  // coefficient of the polynomial 
    int pow;   // power of the polynomial 
    Node* next;
};
*/
/* The below method print the required sum of polynomial
p1 and p2 as specified in output  */
void addPolynomial(Node *p1, Node *p2)
{
    //Your code here
    struct Node *poly = new Node();
    struct Node *temp = NULL;
    while(p1 || p2){
        if(p1 != NULL && p2 == NULL){
               poly->pow = p1->pow;
               poly->coeff = p1->coeff;
               p1 = p1->next;
        }
        else if(p1 != NULL && p2 != NULL && p1->pow > p2->pow){
            poly->pow = p1->pow;
            poly->coeff = p1->coeff;
            p1 = p1->next;
        }
        if(p2 != NULL && p1 == NULL){
               poly->pow = p2->pow;
               poly->coeff = p2->coeff;
               p2 = p2->next;
        }
        else if(p1 != NULL && p2 != NULL && p1->pow < p2->pow){
            poly->pow = p2->pow;
            poly->coeff = p2->coeff;
            p2 = p2->next;
        }
        if(p1 != NULL && p2 != NULL && (p1->pow == p2->pow)){
            poly->pow = p2->pow;
            poly->coeff = p2->coeff + p1->coeff;
            p2 = p2->next;
            p1 = p1->next;
        }
        if(temp == NULL)
        temp = poly;
        cout<<poly->pow<<endl;
        if(p1 || p2){
            poly->next = new Node();
            poly = poly->next;
        
        }
        poly->next = NULL;
    }
    
    while(temp->next != NULL){
        cout<<temp->coeff<<"x^"<<temp->pow<<"+";
        temp = temp->next;
    }
    cout<<temp->coeff<<"x^"<<temp->pow;
}
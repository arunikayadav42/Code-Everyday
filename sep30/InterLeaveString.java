import java.util.Scanner;
import java.lang.Math;
import java.io.*;
class Node{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
class InterLeaveString
{
    public static void inorder(Node root)
    {
        if(root==null)
        return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int []pre=new int[n];
            char []preLN=new char[n];
            for(int i=0;i<n;i++)
            {
                int b=sc.nextInt();
                pre[i]=b;
            }
            for(int i=0;i<n;i++)
            {
                char c=sc.next().charAt(0);
                preLN[i]=c;
            }
            GFG obj=new GFG();
            Node root=obj.constructTree(n,pre,preLN);
            inorder(root);
            System.out.println();
        }
    }
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/


/*class Node{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/
//Function should return the root of the formed binary tree.
class GFG
{
    int countleft = 0;
    Node construct(int n, int pre[], char preLN[], int i){
        if(pre.length == i)
        return null;
        Node node = new Node(pre[i]);
        if(preLN[i] == 'N')
        {
            node.left = construct(n, pre, preLN, i+1);
            countleft++;
            node.right = construct(n, pre, preLN, i+countleft+1);
        }
        return node;
    }
    Node constructTree(int n, int pre[], char preLN[])
    {
        //Add your code here.
        countleft = 0;
        return construct(n, pre, preLN, 0);
    }
}
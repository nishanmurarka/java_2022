package linkedlist;

import java.util.*;
public class linkedlist  {
    
    // public linkedlist ()
    // {
       
        
    // }
     class Node
    {
        int data;
        Node next;
        public Node(int a)
        {
            data=a;
            next=null;
        }
    }
     Node head;
     
    Node tt;
    public void addnode(int data) //adding new node
    {
        
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            tt=head;
        }
        else
        {
            tt.next=newnode;
            tt=tt.next;
            
        }
    }
    
    public void task(int n) //main func to create a new linklist
    {
        Scanner sc=new Scanner(System.in);
        
        // head=new Node(sc.nextInt());
        // Node temp=head;
        for(int i=1;i<=n;i++)
        {
            // E x=sc.nextInt();
            // addnode(x);
            // Node newnode=new Node(x);
            // temp.next=newnode;
            // temp=temp.next;
            
        }
        
        
    }
    
    public void remove(int n)
    {
        if(head==null)
        {
            System.out.println("Already empty");
            return;
        }
        if(head.data==(n))
        {
            head=head.next;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.next.data==(n))
            {
                temp.next=temp.next.next;
            }
                if(temp.next!=null)
                temp=temp.next;
                
        }
        

    }
    public void display() //func to print the entire list
    {
        Node temp=head;
        System.out.println("output:");
        while(temp!=null)
        {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        
    }
    
}

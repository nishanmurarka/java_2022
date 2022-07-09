import java.util.*;
public class linked {
    
     static class Node<E>
    {
        E data;
        Node<E> next;
        public Node(E a)
        {
            data=a;
            next=null;
        }
    }
     static Node <String> head;
    
    public void addnode(String data) //adding new node
    {
        
        Node<String> newnode=new Node<>(data);
        if(head==null)
        head=newnode;
        else
        {
            Node<String> temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    
    public void task(int n) //main func to create a new linklist
    {
        Scanner sc=new Scanner(System.in);
        
        // head=new Node(sc.nextInt());
        // Node<String> temp=head;
        for(int i=1;i<=n;i++)
        {
            String x=sc.next();
            addnode(x);
            // Node<String> newnode=new Node(x);
            // temp.next=newnode;
            // temp=temp.next;
            
        }
        
        
    }
    
    public void remove(String n)
    {
        if(head==null)
        {
            System.out.println("Already empty");
            return;
        }
        if(head.data.equals(n))
        {
            head=head.next;
            return;
        }
        Node<String> temp=head;
        while(temp.next!=null)
        {
            if(temp.next.data.equals(n))
            {
                temp.next=temp.next.next;
            }
                if(temp.next!=null)
                temp=temp.next;
                
        }
        

    }
    public void display() //func to print the entire list
    {
        Node<String> temp=head;
        System.out.println("output:");
        while(temp!=null)
        {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
}

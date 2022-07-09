public class link_stack 
 {
    static class Node 
    {
        int data;
        Node next;
        public Node(int a)
        {
            data=a;
            next=null;
        }
        public void print()
        {
            System.out.println(data);
        }
    }
    
    Node head;
    Node top;
    public void push(int a)
    {
        Node newnode=new Node(a);
        if(head==null)
        {
            head=newnode;
            top=head;
        }
        else
        {
            top.next=newnode;
            top=top.next;
        }
    }
    public int pop() throws Exception
    {
        if(head==null)
        throw new Exception("Popping from empty stack");
        
        Node h=reverse(head);
        int x=h.data;
        h=h.next;
        head=reverse(h);
        return x;
    
    }
    public int peek() throws Exception
    {
        if(head==null)
        throw new Exception("Peeking from empty stack");

        Node h=reverse(head);
        head=reverse(h);
        return h.data;
        
    }
    public Node reverse(Node head)
    {
        Node prev=null;
        Node temp=head;
        Node after=null;
        while(temp!=null)
        {
            after=temp.next;
            temp.next=prev;
            prev=temp;
            temp=after;
        }
        return prev;
    }
}

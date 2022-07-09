import java.util.HashMap;
import java.util.HashSet;

public class breakchain {
    private class Node
    {
        int data;
        Node next;
        
    }
    Node head;
    Node tt;
    Node temp;

    public void input(int d)
    {
        Node newnode=new Node();
        newnode.data=d;
        
        if(d==2)
        {
            temp=newnode;
        }
        
        if(d==5)
        {
            tt.next=newnode;
            newnode.next=temp;
        }
        else if(head==null)
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
    public void func() {
        Node tt=head;
        HashSet<Node> map=new HashSet<>();
        
        while(tt!=null)
        {
            
            if(!map.contains(tt.next))
            {
                map.add(tt);
            }
            else
            {
                tt.next=null;
            }
            tt=tt.next;

        }
        
    }
    public static void main(String[] args) {
        breakchain object=new breakchain();
        object.input(1);
        object.input(2);
        object.input(3);
        object.input(4);
        object.input(5);
        object.func();
        object.display();
    }
    public void display() {
        Node t=head;
        while(t!=null)
        {
            System.out.println(t.data);
            t=t.next;
        }
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class Tree {
    
    private class Node
    {
        int data;
        Node left;
        Node right;
	
    }
    
    int size;
    Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        Tree ob=new Tree();
        Node root=ob.input(true);
        // Node root2=ob.input(true);
        // int ans=ob.func(root);
        // ob.display(root);
        // Pair p=ob.balanced(root);
        // System.out.println(p.bal);
        // Pair p=ob.subsetsum(root);
        // System.out.println(Math.max(p.inc,p.exc));
        // ob.leftview(root,0);
        // ob.mapprint();
        // boolean b=ob.equal(root1,root2);
        // System.out.println(b);
        // int close=ob.closest(root,16);
        // System.out.println(close);
        // link p=ob.linked(root);
        // Node head=p.head;
        // while(head!=null)
        // {
        //     System.out.print(head.data+" ");
        //     head=head.right;
        // }
        //    boolean b= ob.check(root);
        //    System.err.println(b);
            // Node ans1=ob.LCA(root,9,25);
            // Node ans2=ob.LCA(root,3,9);
            // Node ans3=ob.LCA(root,9,12);
            // System.out.println(ans1.data);
            // System.out.println(ans2.data);
            // System.out.println(ans3.data);
            // int lev=ob.level(root,5);
            // System.out.println(lev);
            // nl ans=ob.route(root,2,13);
            // nl ans2=ob.route(root,5,14);
            // System.out.println(ans.height);
            // System.out.println(ans2.height);
            int aa=ob.distcalc(root,5);
            System.out.println(aa);
            
    }   
    public Node input(boolean b)
    {
	    if(b)
	    {
		    System.out.println("Root data of : ");
		    b=false;
	    }
	    String ss=sc.next();
	
	    if(ss.equals("n"))
	    return null;
	
	    int nn=Integer.parseInt(ss);
	    Node n=new Node();
	    n.data=nn;
	
        System.out.println("Left data of "+nn+" : ");
	    n.left=input(false);
	
        System.out.println("Right data of "+nn+" : ");
	    n.right=input(false);
	
        return n;
    }
    
    public int func(Node node) {
        if(node==null)
        return 0;
        
        int l=func(node.left);
        int r=func(node.right);
        int temp=node.data;
        if((l+r)!=0)
        node.data=l+r;
        return (node.data+temp);
    }
    public void display(Node node)
    {
        if(node==null)
        return;
        String str="";
        if(node.left==null)
        str+=".";
        else
        str+=node.left.data;
        
        str+=" => "+node.data+" <= ";
        
        if(node.right==null)
        str+=".";
        else
        str+=node.right.data;
        System.out.println(str);
        display(node.left);
        display(node.right);

           
    }
    class Pair
    {
        int inc;
        int exc;
    }
    // public Pair balanced(Node node) {
    //     Pair p=new Pair();
    //     if(node==null)
    //     {
    //         p.bal=true;
    //         p.height=0;
    //         return p;
    //     }
    //     Pair p1=balanced(node.left);
    //     Pair p2=balanced(node.right);
    //     if(p1.bal&&p2.bal&&(Math.abs(p1.height-p2.height)<=1))
    //     p.bal=true;
    //     else
    //     p.bal=false;
    //     p.height=Math.max(p1.height,p2.height)+1;
    //     return p;
    // }
    
    public Pair subsetsum(Node node) {
        Pair p=new Pair();

        if(node==null)
        {
            p.inc=0;
            p.exc=0;
            return p;
        }
        Pair l=subsetsum(node.left);
        Pair r=subsetsum(node.right);
        p.inc=node.data+l.exc+r.exc;
        p.exc=Math.max(l.inc,l.exc)+Math.max(r.inc,r.exc);
        return p;
    }
    HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
    public void leftview(Node node,int l)
    {
        if(node==null)
        return;
        
        if(map.get(l)==null)
        {
            ArrayList<Integer> ar=new ArrayList<>();
            ar.add(node.data);
            map.put(l,ar);
        }
        else
        {
            map.get(l).add(node.data);
        }
        leftview(node.left, l+1);
        leftview(node.right, l+1);


    }
        
    void mapprint()
    {
        for(int i:map.keySet())
        {
            System.out.println(map.get(i).get(0));
        }
    }
    boolean equal(Node n1,Node n2)
    {
        if((n1==null&&n2!=null)||(n1!=null&&n2==null))
        return false;
        if(n1==null&&n2==null)
        return true;


        if(n1.data==n2.data)
        {
            if((equal(n1.left,n2.left)&&equal(n1.right,n2.right))||(equal(n1.left,n2.right)&&equal(n1.right,n2.left)))
            return true;
        }
        
        return false;

    }
    int closest(Node node,int target)
    {
        int ans;
        if(node==null)
        return -1;

        if(target==node.data)
        {
            return 0;
        }
        else if(target>node.data)
        {
            ans=closest(node.right,target);
            if(ans==-1)
            ans=node.data;
        }
        else
        {
            ans=closest(node.left, target);
            if(ans==-1)
            ans=node.data;
        }
        return ans;
    }
     private class link
    {
        Node head;
        Node tail;
    }
     
     public link linked(Node node)
    {
        link l=new link();
        if(node==null)
        {
            l.head=null;
            l.tail=null;
        }
        if(node.left==null&&node.right==null)
        {
            l.head=node;
            l.tail=node;
        }
        else if(node.left==null)
        {
            
            link p=linked(node.right);
            node.right=p.head;
            l.head=node;
            l.tail=p.tail;
        }
        else if(node.right==null)
        {
            
            link p=linked(node.left);
            p.tail.right=node;
            l.head=p.head;
            l.tail=node;
        }
        else
        {
            link p1=linked(node.left);
            link p2=linked(node.right);
            p1.tail.right=node;
            node.right=p2.head;
            l.head=p1.head;
            l.tail=p2.tail;
        }
        return l;
    }
    public boolean check(Node node)
    {
        boolean b1=true,b2=true;
        if(node==null)
        return false;
        else if(node.left==null&&node.right==null)
        return true;
        else if(node.left==null)
        {
            b2=check(node.right);
            if(b2&&node.data<node.right.data)
            return true;
            return false;
        }
        else if(node.right==null)
        {
            b1=check(node.left);
            if(b1&&node.data>node.left.data)
            return true;
            return false;
        }
        else
        {
            b1=check(node.left);
            b2=check(node.right);
            if(b1&&b2&&(node.data>node.left.data&&node.data<node.right.data))
            return true;
            return false;
        }
    }
    public Node LCA(Node node,int a,int b)
    {
        while(true)
        {
            if(node.data<a&&node.data<b)
            node=node.right;
            else if(node.data>a&&node.data>b)
            node=node.left;
            else if(node.data>=a&&node.data<=b)
            {
                return node;
            }
            else
            return null;
        }
        

    }
    public int level(Node node,int target)
    {
        if(node==null)
        return -1;
        
        if(node.data==target)
        return 0;

        int d1=level(node.left,target);
        if(d1!=-1)
        return d1+1;

        d1=level(node.right,target);
        if(d1!=-1)
        return d1+1;

        return d1;
    }
    private class nl
    {
        boolean present;
        int height;
        
    }
    public nl route(Node node,int a,int b)
    {
        nl highnode=new nl();
        if(node==null)
        {
            highnode.present=false;
            return highnode;
        }
        if(node.data==a||node.data==b)
        {
            highnode.present=true;
            highnode.height=1;
            return highnode;
        }
        
        nl leftans=route(node.left,a,b);
        nl rightans=route(node.right,a,b);
        if(leftans.present==true&&rightans.present==true)
        {
            highnode.present=true;
            highnode.height=leftans.height+rightans.height;
            return highnode;
        }
        if(leftans.present==true)
        {
            leftans.height++;
            return leftans;
        }
        if(rightans.present)
        {
            rightans.height++;
            return rightans;
        }
        return highnode;

    }
    public int distcalc(Node node, int target)
    {
        if(node==null)
        return -1;
       

        int a=distcalc(node.left,target);
        int b=distcalc(node.right,target);
        if(node.data==target)
        return 1;
        
        if(a!=-1&&b!=-1)
        return (a+b+1);
        else if(a!=-1)
        return a+1;
        else if(b!=-1)
        return b+1;
        else
        return -1;
    }

}

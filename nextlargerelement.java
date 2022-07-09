import java.util.*;
class nextlargerelement {
    public static long[] nextLargerElement(long[] arr)
    { 
        // Your code here
        long ans[]=new long[arr.length];
        Stack<Long> stack=new Stack<>();
        
        for(int i=arr.length-1;i>=0;i--)
        {
            long x=arr[i];
            ans[i]=find(stack,x);
            stack.push(arr[i]);
        }
        return ans;
    } 
    public static long find(Stack<Long>stack,long x)
    {
        
        
        if(stack.isEmpty())
        {
            return -1;
        }
        if(x<stack.peek())
        {
            long temp=stack.peek();
            return temp;
        }
        long n=stack.pop();
        long d=find(stack,x);
        stack.push(n);
        return d;
        
    }
    public static void main(String args[]) {
        long arr[]={2,3,8,0,1,6};
        long res[]=new long[arr.length];
        res=nextLargerElement(arr);
        for(long g:res)
        System.out.print(g+" ");
    }
}

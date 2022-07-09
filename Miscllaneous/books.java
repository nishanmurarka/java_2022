public class books {
    public static void main(String[] args) {
        int a[]={10,20,30,15};
        int k=2;
        int ans=func(a,k);
        System.out.println(ans);
    }
    public static int func(int a[],int k) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int n:a)
        {
            min=Math.min(min,n);
            max+=n;
        }
        int s=min;
        int e=max;
        
        int ans=0;
        while(s<=e)
        {
            int mid=(s+e)/2;
            if(helper(a,k,mid))
            {
                ans=mid;
                e=mid-1;
            }
            else 
            s=mid+1;
        }
        return ans;
    }
    public static boolean helper(int a[],int k,int mid) {
        int temp=0;
        for(int i=0;i<a.length;i++)
        {
            temp+=a[i];
            if(temp>=mid)
            {
               k--;
               i--; 
               temp=0;
            }

        }
        if(k>=0)
        return true;
        return false;
    }
}

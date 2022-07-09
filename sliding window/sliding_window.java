
public class sliding_window {
    public static void main(String args[]) {
        
        
       int a[]={-2,4,5,-1,1,-1,-4,8};
        //   int a[]={2,4,5,1,1,1,4,8};
       task(a,8);

    }
    public static void task(int a[],int k)
    {
        int i=0,j=0;
        int n=a.length;
        int sum=0;
        int dif;
        int min=Integer.MAX_VALUE;
        while(j<n)
        {
            sum+=a[j];
            
            while(sum>k&&i<j)
            {
                sum-=a[i];
                i++;
            }
            if(sum==k)
            {
                // dif=j-i+1;
                // min=Math.min(dif,min);
                System.out.println(i+" "+j);
            }
            j++;
        
        }
       
    }
}

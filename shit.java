public class shit {
     public static void main(String[] args) {
         int ar[]={1,0,0,0,1};
        int ans=helper(ar);
        System.out.println(ans);
     }
     public static int helper(int a[]) {
         int s=-1;
         
         int ans=0;
         for(int i=0;i<a.length;i++)
         {
            if(s!=-1&&a[i]!=0)
            {
                s=-1;
            } 
            if(s==-1&&a[i]==0)
            {
                s=i;
                ans++;
            }
         }
         if(ans==0)
         return 0;
         else if(ans==1)
         return 1;
         else return 2;
     }
}

import java.util.Scanner;

public class bitor
{
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int bit = (int)(Math.log(b) / Math.log(2));
        int bitnum=(int)Math.pow(2,bit);
        int dif=0;
        int ans=1;
        
        dif=b-bitnum;
        if(dif>a)
        dif%=a;
        
            if(dif==0)
            {
                ans=Math.min(b-a,a);
                
            }
            else if(a%2==1)
            {
                if(dif%2==0)
                ans++;
                
            }
            else if(a%2==0)
            {
                ans++;
                
            }
        System.out.println(ans);
        
        
    }
}
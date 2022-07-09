import java.util.*;
class intersection_twopointer
{
    public static void main(String args[])
    {
            Scanner sc=new Scanner(System.in);
            int a[]=new int[6];
            int b[]=new int[6];
            for(int i=0;i<=5;i++)
            {
                a[i]=sc.nextInt();
                b[i]=sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int i=0;
            int j=0;
            while(i<=5&&j<=5)
            {
                if(a[i]==b[j])
                {
                    System.out.println(a[i]);
                    i++;
                }
                else if(a[i]<b[j])
                i++;
                else
                j++;
            }
    }
}

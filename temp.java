import java.util.Arrays;

class pair
    {
        int a;
        int b;
        pair(int a,int b)
        {
            this.a=a;
            this.b=b;
        }
    }
public class temp
{
     
    public static void main(String[] args) {
        int a1[]={1,3,7,9};
        int a2[]={2,5,13};
        pair p=func(a1,a2);
        System.out.println(p.a+" "+p.b);
    }
    private static pair func(int a[],int b[]) {
        Arrays.sort(a);
        Arrays.sort(b);
        int c1=0,c2m=-1,c1m=-1;
        int c2=0;
        int min=Integer.MAX_VALUE;
        
        while(c1<a.length&&c2<b.length)
        {
            int dif=a[c1]-b[c2];
            if(Math.abs(dif)<min)
            {
                min=Math.abs(dif);
                c1m=a[c1];
                c2m=b[c2];
            }
            if(dif<0)
            c1++;
            else
            c2++;
        }
        pair p=new pair(c1m,c2m);
        return p;
    }
}
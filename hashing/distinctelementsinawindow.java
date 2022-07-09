package hashing;


import java.util.HashMap;

public class distinctelementsinawindow
{
    public static void main(String args[]) {
        int a[]={1,2,2,1,3,1,1,3};
        int k=4;
        int j=0,i=0,c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(j<a.length&&i<=j)
        {
            int l=j-i+1;
            if(!map.containsKey(a[j])||map.get(a[j])<i)
            c++;
            map.put(a[j], j);
            if(l>=k)
            {
                System.out.println(c);
                if(!(map.get(a[i])>i&&map.get(a[i])<=j))
                c--;
                i++;
            }
            
            j++;
        }
    }
}
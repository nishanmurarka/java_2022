import java.util.HashMap;

public class subarray {
    public static void main(String args[]) {
        int a[]={10,15,-5,15,-10,5};
        HashMap<Integer,Integer> map=new HashMap<>();
        int j=0;int sum=0;
        while(j<a.length)
        {
            sum+=a[j];
            
            
            int dif=sum-5;
            if(sum==5)
            {
                System.out.println(0+" "+j);
            }
            if(map.containsKey(dif))
            {
                System.out.println((map.get(dif)+1)+" "+j);
            }
            if(!map.containsKey(sum))
            map.put(sum, j);
            j++;
        }
    }
}

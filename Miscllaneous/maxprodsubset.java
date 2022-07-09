import java.util.ArrayList;
import java.util.Arrays;

public class maxprodsubset {
    public static void main(String args[]) {
        int a[]={2,7,4,9,5,1,3};
        Arrays.sort(a);
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        func(a,0,10,new ArrayList<>(),result);
        System.out.println(result);
    }
    static void func(int arr[],int begin,int sum,ArrayList<Integer> comb,ArrayList<ArrayList<Integer>> output)
    {
        if(comb.size()==3)
        {
            output.add(new ArrayList<>(comb));
            return;
        }

        for(int i=begin;i<arr.length&&arr[i]<=sum;i++)
        {
            comb.add(arr[i]);
            func(arr,i+1,sum-arr[i],comb,output);
            comb.remove(comb.size()-1);
        }

    }
}

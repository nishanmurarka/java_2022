public class sorting_recursion
{
    public static void main(String[] args) {
        int a[]={4,2,7,6,9,1};
        sort(a,5);
        for(int i:a)
        System.out.print(i+" ");
    }
    public static void sort(int a[],int n) {
        if(n==0)
        return;

        sort(a,n-1);
        insert(a,a[n],n);
    }
    public static void insert(int a[],int temp,int n) {
        if(n==0||temp>=a[n-1])
        {
            a[n]=temp;
            return;
        }
        int tt=a[n-1];
        insert(a, temp, n-1);
        a[n]=tt;

    }
}
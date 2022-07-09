 public class myClass
 {
        int a,b;
        public static void main(String args[]) //main method
        {
        int arr[]={0,8,9,6,7,13};
        arr=helper(arr,0,2,3,5,0);

        }
        public static int[] helper(int arr[],int a,int b,int c,int d,int k)
        {
            if(a>b)
            return
            if(arr[a]<arr[c])
            {
                arr[k]=helper(arr,a+1,b,c,d,k+1);
            }
            if(arr[a]>arr[c])
            arr[k]=helper(arr,a,b,c+1,d,k+1);


        }
 }
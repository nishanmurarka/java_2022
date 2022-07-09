import java.util.Scanner;

class Hanoi {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(toh(sc.nextInt(),1,3,2));
        
    }
    public static long toh(int n, int s, int d, int h) {
        // Your code here
        if(n==1)
        {
            System.out.println("move disk "+n+" from rod "+s+" to rod "+d);
            
            return 1;
        }
        long step1=toh(n-1,s,h,d);
        System.out.println("move disk "+n+" from rod "+s+" to rod "+d);
        long step2=toh(n-1,h,d,s);
        return step2+step1+1;
        
    }
    
}
import java.util.*;
public class MyClass {
    public static void main(String[] args) {
        int n=2; 
        String type[]= new String[n];
         String colour[]= new String[n];
         int make[]= new int[n];
         int cost[]= new int[n];
         String gear[]= new String[n];
         int mileage[]= new int[n];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter details of cars:");
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter type of car:");
            type[i]=sc.next();
            System.out.println("Enter colour:");
            colour[i]=sc.next();
            System.out.println("Enter make DD/MM/YY:");
            make[i]=sc.nextInt();
            System.out.println("Enter cost:");
            cost[i]=sc.nextInt();
            System.out.println("Enter gear type:");
            gear[i]=sc.next();
            System.out.println("Enter mileage:");
            mileage[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
          {
              System.out.println("Type of car:"+type[i]);
              System.out.println("Colour:"+colour[i]);
              System.out.println("Make DDMMYY:"+make[i]);
              System.out.println("Cost:"+cost[i]);
              System.out.println("Gear type:"+gear[i]);
              System.out.println("Mileage:"+mileage[i]);
         }
    }
}
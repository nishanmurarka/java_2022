import java.util.Scanner;
public class ii {
    
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the fist matrix : ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int one[][] = new int[r1][c1];
        for (int i=0;i<one.length;i++){
            for(int j=0;j<one[0].length;j++){
                one[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter the second matrix : ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int two[][] = new int[r2][c2];
        for (int i=0;i<two.length;i++){
            for(int j=0;j<two[0].length;j++){
                two[i][j]= sc.nextInt();
            }
        }
        if(c1 != r2){
            System.out.println("Invalid input");
            return;
        }
        int[][] prod= new int[r1][c2];
        for (int i=0;i<prod.length;i++){
            for(int j=0;j<prod[0].length;j++){
                for(int k=0;k<r2;k++){
                    prod[i][j] += one[i][k] * two[k][j];
                }
            }
        }
        for (int i=0;i<prod.length;i++){
            for(int j=0;j<prod[0].length;j++){
                System.out.println(prod[i][j]+ " ");
            }
        }
        System.out.println();
    }
}


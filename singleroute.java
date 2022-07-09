import java.io.*;

class singleroute {
	static int count=0;
	public static void main (String[] args) {
		System.out.println("GfG!");
		int m[][]={{1,1,1,1,1,1,1,1,1,1},{1,1,0,1,1,0,1,1,0,1},{1,1,1,1,1,1,1,1,1,1}};
		int r=3,c=10;
		boolean seen[][]=new boolean[r][c];
		boolean b=possiblePath(m,r,c,0,0,0,seen);
		System.out.println(count);
	}
		
	public static boolean possiblePath(int arr[][],int r,int c,int i,int j,int path,boolean seen[][])
	{
	   if(i ==r-1 && j == c-1)
           {
               count=path; 
               return true;
           }
            
            
        if(arr[i][j] == 1)
        {
            seen[i][j] = true;
            
            if(i+1 < r && seen[i+1][j] == false && arr[i+1][j] == 1)
            {
                if(possiblePath(arr, r,c, i+1, j, path+1, seen))
                return true;
            }
            
            if(j+1 < c  && seen[i][j+1] == false  && arr[i][j+1] == 1)
            {
               if(possiblePath(arr, r,c, i, j+1, path+1, seen))
               return true;
            } 
            if(j-1 >= 0 && seen[i][j-1] == false && arr[i][j-1] == 1)
            {
                if(possiblePath(arr, r,c, i, j-1, path+1,seen))
                return true;
            }
            if(i -1 >= 0 && seen[i-1][j] == false && arr[i-1][j] == 1)
            {
                 if(possiblePath(arr, r,c, i-1, j, path +1,seen))
                 return true;
            }
            
            
            seen[i][j] = false;
            return false;
        }
        return false;
	}

}

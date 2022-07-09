import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        boolean visited[][]=new boolean[n][n];
        for (boolean[] row : visited)
            Arrays.fill(row, false);
            
        ArrayList<String> ans=new ArrayList<>();
        boolean b=func(m,n,visited,ans,new ArrayList<Character>(),0,0);
        return ans;
        


    }
    public static boolean func(int m[][],int n,boolean visited[][],ArrayList<String> ans,ArrayList<Character> cur,int i,int j)
    {
        if(i==n||i==-1||j==-1||j==n)
        return false;
        
        if(visited[i][j])
        return false;
        
        if(m[i][j]==0)
        return false;
        
        if(i==n-1&&j==n-1)
        {
            StringBuilder sb = new StringBuilder();
            for(Character ch:cur)
            sb.append(ch);
            String string = sb.toString();
            ans.add(string);
        }
        
        visited[i][j]=true;
        
        cur.add('R');
        if(!func(m,n,visited,ans,cur,i,j+1))
        cur.remove(cur.size()-1);
        
        
        cur.add('D');
        if(!func(m,n,visited,ans,cur,i+1,j))
        cur.remove(cur.size()-1);
        
        
        cur.add('L');
        if(!func(m,n,visited,ans,cur,i,j-1))
        cur.remove(cur.size()-1);
        
        
        cur.add('U');
        if(!func(m,n,visited,ans,cur,i-1,j))
        cur.remove(cur.size()-1);
        
        
        visited[i][j]=false;
        return false;
        
        
    }
    public static void main(String args[]) {
       int m[][]={{1,0,0,0},{1,1,0,1,},{1,1,0,0},{0,1,1,1}};
       int n=4;
        ArrayList<String> ans= findPath(m, n);
        System.out.println(ans);
    }
}

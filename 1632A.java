import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
 
public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
 
    public static void main(String[] args)
    {
        FastReader sc = new FastReader();
        int t=sc.nextInt();
        while(t--!=0)
        {
            
            int n=sc.nextInt();
            int l=sc.nextInt();
            int ar[]=new int[n];
            for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
            
            
           int ans=0;
               for(int i=0;i<l;i++)
                {
                    int count=0;
                    for(int j=0;j<n;j++)
                    {
                        int tt=ar[j]&(1<<i);
                        if(tt==1)
                        count++;
                    }
                    if(count>n-count)
                    ans+=(1<<i);
                }
            System.out.println(ans);
        }
    }
    
}
            
           
       
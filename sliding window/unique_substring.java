
    import java.util.*;
    class unique_substring 
    {
        public static void main(String args[])
            {
                    String s="dabcaefbg";
                    HashMap<Character,Integer> hash=new HashMap<>();
                    int i=0,j=0;
                    int max=-1;
                    String maxi="";
                    int size=0;
                   while(j<s.length()&&i<=j)
                   {
                        char c=s.charAt(j);
                        if(hash.containsKey(c)&&hash.get(c)>=i)
                        {
                            i=hash.get(c)+1;
                        }
                        hash.put(c,j);
                        j++;
                        size=j-1;
                        if(size>max)
                        {
                            max=size;
                            maxi=s.substring(i,j);
                        }
                    }
                    System.out.println(maxi);
            }
}

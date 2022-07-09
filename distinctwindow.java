import java.util.HashMap;

public class distinctwindow {
    public static void main(String args[]) {
        String s="aabbdbacab";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        map.put(s.charAt(i),0);
        int i=0,j=0;
        int min=Integer.MAX_VALUE;
        int start=-1,end=-1;
        char c=' ';
        while(j<s.length())
        {
            
            c = s.charAt(j);
            
            if(map.containsValue(0))
            {
                map.put(c, map.get(c)+1);
                j++;
            }
            while(!map.containsValue(0))
            {  if(j-i<min)
                {
                    min=j-i;
                    start=i;
                    end=j;

                }
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
            }
            
            
        }
        System.out.println(s.substring(start, end));
    }
}

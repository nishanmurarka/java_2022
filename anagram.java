import java.util.*;
public class anagram {
    public static HashMap<Character,Integer> getHashValue(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        return map;
    }

    public static int anagrams_substrings(String s){

        HashMap<HashMap<Character,Integer> , Integer> m = new HashMap<>();

        for(int i=0;i<s.length();i++){
            for(int j=i; j<s.length();j++){

                String sub=s.substring(i,j+1);
                //Substring S[i...j]
                HashMap<Character,Integer> h = getHashValue(sub);
                //put it inside a map

               m.put(h,m.getOrDefault(h,0)+1);
            }
        }

        //pairs
        int ans = 0;
        for(int p : m.values()){

            
            if(p>=2){
                ans += (p)*(p-1)/2;
            }

        }
        return ans;

    }

    public static void main(String[] args) {

        String s= "abbba";

        System.out.println(anagrams_substrings(s));
    }
}

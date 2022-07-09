
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class hhh {
    public static void main(String args[]) {
        
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.add(5);
        ad.push(6);
        System.out.println(ad.pop()); 
        System.out.println(ad.remove());
        List<Integer> ar=new ArrayList<>();
        List<Integer> li=new LinkedList<>();
        ar.add(0);
        li.add(1);
        System.out.println(ar);
        System.out.println(li);
    }
}

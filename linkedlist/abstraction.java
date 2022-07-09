import java.util.*;
abstract class Monster{
    abstract void type();
}
class Vampire extends Monster
{
    public void type()
    {
        System.out.println("Vampire");
    }
}
class Werewolf extends Monster
{
    public void type()
    {
        System.out.println("Werewolf");
    }
}
class Zombie extends Monster
{
    public void type()
    {
        System.out.println("Zombie");
    }
}
public class abstraction {
    public static void main(String[] args) {
        ArrayList<Monster> ar=new ArrayList<>();
        ar.add(new Vampire());
        ar.add(new Werewolf());
        ar.add(new Zombie());
        ar.add(new Vampire());
        ar.add(new Werewolf());
        ar.add(new Zombie());
        for(Monster ob:ar)
        {
            ob.type();
        }
    }
}

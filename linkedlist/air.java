abstract class Airplane{
    int serial=(int)(Math.random()*1000);
    String type;
    String capacity;
}
class B747 extends Airplane{
    
    public String toString()
    {
        type="B747";
        capacity="150";
        String s="Type: "+type+" Capacity: "+capacity+" serial: "+serial;
        return s;
    }
}
class B757 extends Airplane{
    
    public String toString()
    {
        type="B757";
        capacity="200";
        String s="Type: "+type+" Capacity: "+capacity+" serial: "+serial;
        return s;
    }
}
class B767 extends Airplane{
    
    public String toString()
    {
        type="B767";
        capacity="175";
        String s="Type: "+type+" Capacity: "+capacity+" serial: "+serial;
        return s;
    }
}
public class air {
    public static void main(String[] args) {
        Airplane ob1=new B747();
        Airplane ob2=new B767();
        Airplane ob3=new B747();
        Airplane ob4=new B757();
        Airplane ob5=new B767();
        Airplane ob6=new B747();
        Airplane ob7=new B757();
        Airplane ob8=new B757();
        Airplane ob9=new B747();
        System.out.println(ob1);
        System.out.println(ob2);
        System.out.println(ob3);
        System.out.println(ob4);
        System.out.println(ob5);
        System.out.println(ob6);
        System.out.println(ob7);
        System.out.println(ob8);
        System.out.println(ob9);
        

        
    }
}

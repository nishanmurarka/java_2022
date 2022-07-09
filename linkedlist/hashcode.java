import java.util.HashMap;
import java.util.*;
public class hashcode {
    static Scanner sc=new Scanner(System.in);
    static class Person
    {
        String name;
        int nskills;
        Person(String name,int nskills)
        {
            this.nskills=nskills;
            this.name=name;
            HashMap<String,Integer> map=new HashMap<>();
            for(int i=1;i<=nskills;i++)
            {
                String s=sc.next();
                int level=sc.nextInt();
                map.put(s,level);
            }
        }
    }
    static class Project
    {
        String name;
        int ndays;
        int points;
        int bbefore;
        int ncontri;
        Project(String name,int ndays,int points,int bbefore,int ncontri)
        {
            this.name=name;
            this.ndays=ndays;
            this.points=points;
            this.bbefore=bbefore;
            this.ncontri=ncontri;
            HashMap<String,Integer> map=new HashMap<>();
            for(int i=0;i<ncontri;i++)
            {
                String s=sc.next();
                int level=sc.nextInt();
                map.put(s,level);
            }
        }
    }
    static class output
    {
        ArrayList<String> ar=new ArrayList<>();
        int ncontri;
        output(ArrayList<String> ar)
        {
            this.ar=ar;
        }
    }
    public static void main(String[] args) {
        int ncontri=sc.nextInt();
        int nproj=sc.nextInt();
        ArrayList<Person> contributors=new ArrayList<>();
        for(int i=1;i<=ncontri;i++)
        {
            String name=sc.next();
            int nskill=sc.nextInt();
            contributors.add(new Person(name,nskill));
        }
        ArrayList<Project> projects=new ArrayList<>();
        for(int i=1;i<=nproj;i++)
        {
            String name=sc.next();
            int ndays=sc.nextInt();
            int points=sc.nextInt();
            int bbefore=sc.nextInt();
            int ncontr=sc.nextInt();
            projects.add(new Project(name,ndays,points,bbefore,ncontr));
        }
        for(int i=0;i<nproj;i++)
        {
            Project temp=projects.get(i);
            for(int j=1;j<=temp.ncontri;j++)
            {
                for(String skill:temp.map.keySet())
                {
                    check()
                }
            }
        }
    }
}

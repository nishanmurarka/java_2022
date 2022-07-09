import java.util.*;
public class graph {
    private HashMap<Integer,LinkedList<Integer>> map;
    graph(int l)
    {
        map=new HashMap<>();
        for(int i=0;i<l;i++)
        map.put(i,new LinkedList<>());
    }
    public void addedge(int source,int destination)
    {
        map.get(source).add(destination);
        
    }
    public static void main(String[] mapgs) {
        graph g=new graph(6);
        
        
        g.addedge(0,1);
        g.addedge(1,2);
        g.addedge(2,3);
        g.addedge(0,4);
        g.addedge(0,5);
        g.addedge(5,4);
        g.addedge(3,0);
        
        g.cycle_present(6,0);
        
    }
    public void printgraph() {
        for(int m:map.keySet())
        {
            System.out.print(m+"->");
            for(int ll:map.get(m))
            System.out.print(ll+" ");
            System.out.println();
        }
    }
    public void cycle_present(int n,int source) //cycle checker in undireted graph
    {
        boolean visited[]=new boolean[n];
        int parent[]=new int[n];
        parent[source]=-1; 
        Arrays.fill(visited, false);
        visited[source]=true;
        boolean ans=cycle_present_helper(visited,source,parent);
        System.out.println(ans);
    }
    public boolean cycle_present_helper(boolean visited[],int source,int parent[]) {
        for(int nbr:map.get(source))
        {
            if(!visited[nbr])
            {
                visited[nbr]=true;
                parent[nbr]=source;
                if(cycle_present_helper(visited, nbr,parent))
                return true;
            }
            else if(nbr!=parent[source])
            return true;
        }
        
        return false;
    }
}

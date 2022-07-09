int n=sc.nextInt();
            HashMap<Character,Integer> map=new HashMap<>();
            String s=sc.next();
            boolean bol=true;
            if(n%2==1)
            bol=false;
            else
            {
                
            
            for(int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);
                map.put(c,map.getOrDefault(c,0)+1);
                if(2*map.get(c)>s.length())
                {
                    bol=false;
                    break;
                }
                
            }
                
            }
            if(!bol)
            System.out.println("NO");
            else
            {
                System.out.println("YES");
                Map<Character, Integer> hm = sortByValue(map);
                for(char cc:hm.keySet())
                {
                    int f=hm.get(cc);
                    while(f--!=0)
                    System.out.print(cc);
                }
                System.out.println();
 
            }
            
            
        }
    }
    public static HashMap<Character, Integer> sortByValue(HashMap<Character, Integer> hm)
    {
        
       List<Map.Entry<Character, Integer> > list =
        new LinkedList<Map.Entry<Character, Integer> >(hm.entrySet());


        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() {
        public int compare(Map.Entry<Character, Integer> o1,
                        Map.Entry<Character, Integer> o2)
        {
         return (o1.getValue()).compareTo(o2.getValue());
        }
        });
        
        
        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> aa : list) {
        temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
        }
}

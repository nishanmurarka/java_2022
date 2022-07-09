Arrays.fill(0);
            Arrays.sort(a);
            for(int i=1;i<=n;i++)
            {
                min=Integer.MAX_VALUE;
                for(int d=0;d<4&&i-denom[d]>=0;d++)
                {
                    int den=denom[d];
                    if(a[i-den]!=0||i==den)
                    min=Math.min(min,a[i-d]);
                    
                }
                if(min!=Integer.MAX_VALUE)
                a[i]=min+1;
            }
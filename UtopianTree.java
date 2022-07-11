043. Utopian Tree goes through 2 cycles of growth every year. Each sprint, it doubles in height. Each summer, its height increases by 1 meter. How tall will the tree be after n growth cycles.
Example 1
n = 5
Period  Height
0           1
1           2
2           3
3           6
4           7
5          14

Hint : Using HashMap

int n = 7, height = 0, flag = 0,currHeight = 1;
HashMap<Integer,Integer> map = new HashMap<>();
for(int i=0;i<=60;i++)
{
     if(i==0)
            map.put(i,1);
     else
     {     if(flag == 0)
           {     currHeight *= 2;
                 map.put(i,currHeight);
                 flag = 1;
            }
            else
            {    currHeight += 1;
                 map.put(i,currHeight);
                 flag = 0;
            }
      }
}
System.out.println(map);
System.out.println(map.get(n));
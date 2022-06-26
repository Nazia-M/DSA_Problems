014. Apples and Oranges at a distance from home
s=7, t=10, a=4, b=12
Apples[2,3,-4]
Oranges[3,-2,-4,-4]
a+Apples = [4+2,4+3,4+-4]  -> [6,7,0] 
         count of values in range of s and t -> 7 
         -> Output = 1
b+Oranges = [12+3,12+-2,12+-4,12+-4] -> [15,10,8,8]
         count of values in range of s and t -> 10,8,8 
        -> Output = 3

int s=7,t=10,a=4,b=12;
ArrayList<Integer> apples = new ArrayList<>();
        apples.add(2);
        apples.add(3);
        apples.add(-4);
ArrayList<Integer> oranges = new ArrayList<>();
        oranges.add(3);
        oranges.add(-2);
        oranges.add(-4);
        oranges.add(-4);

 int appleCount=0,orangeCount=0;
for(int i=0; i<apples.size(); i++)
{
            if((a+apples.get(i) >= s)  && (a+apples.get(i) <= t))
           {
                appleCount += 1;
            }
            apples.set(i, (a+apples.get(i)));
}
System.out.println(apples);
System.out.println(appleCount);

 for(int i=0; i<oranges.size(); i++)
{
            if((b+oranges.get(i) >= s)  && (b+oranges.get(i) <= t))
            {
                orangeCount += 1;
            }
            oranges.set(i, (b+oranges.get(i)));
}
System.out.println(oranges);
System.out.println(orangeCount);
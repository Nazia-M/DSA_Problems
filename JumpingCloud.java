047. jumping On Clouds
n=8,k=2,e=100
cloud = {0,0,1,0,0,1,1,0}
1)move 0 -> 2 , value at index 2(1) then -1 and -2, e = 100-1-2= 97
2)move 2 -> 4 , value at index 4(0) then -1, e = 97-1=96
3)move 4 -> 6 , value of index6(1) then -1 and -2,  e = 96-1-2 = 93
4)move 6 -> 0 , value of index0(0) then -1,  e = 93-1 = 92
Hint : clockwise rotating in array, i%n

static int jumpingOnClouds(int[] c, int k) 
{
        int n=c.length, i=0,e=100;
        while(i<n)
       {
            i = (i+k)%n;
            int value = c[i];
            if(value == 1)
                e = e-1-2;
            else if(value == 0)
                e = e-1;
            System.out.println("i :"+i+" value "+value+" e :"+e);
            if(i==0)
                break;
        }
        return e;
}
public static void main(String[] args) 
{
        int k=3;
        int[] cloud = {1,1,1,0,1,1,0,0,0,0};
        System.out.println(jumpingOnClouds(cloud,k));
}
025. Given an array of integers and a positive integer k, determine the number of(i,j) pairs where i<j and ar[i]+ar[j] is divisible by k.
Input
ar = [1, 3, 2, 6, 1, 2], n=6, k=3
Output 
5 , [1,2], [1,2], [3,6], [2,1], [1,2]
public static int divisibleSumPairs(int n, int k, List<Integer> ar) 
{       int pairCount =0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(((ar.get(i)+ar.get(j))%k) == 0)
                    pairCount += 1;
            }
        }
        return(pairCount);
}
010. Given positive integer array, sum the other n-1 numbers, calculate min and max
Input [1 2 3 4 5]
1. Sum everything except 1, sum is 2+3+4+5=14
2. Sum everything except 2, sum is 1+3+4+5=13
3. Sum everything except 3, sum is 1+2+4+5=12
4. Sum everything except 4, sum is 1+2+3+5=11
5. Sum everything except 5, sum is 1+2+3+4=10
Output 10 14
Hint: Beware of integer overflow! Use 64-bit integer (64 bit integer is long data type)


long min=0, max = 0;
for(int i=0;i<arr.size();i++)
{
            long sum =0;
            for(int j=0;j<arr.size();j++)
            {
                if(j != i)
                {
                    sum += arr.get(j);
                }
            }
            if(i==0)
            {
                min = sum; max = sum;
            }
            if(sum < min)
            {
                min = sum;
            }
            if(sum > max)
            {
                max = sum;
            }
}
System.out.println(+min+" "+max);
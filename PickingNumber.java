039. Picking Number. Given an array of integers, find the longest subarray where the absolute difference between any two elements is less than or equal to 1.
Example 1
a = [1,1,2,2,4,4,5,5,5]
There are two subarrays meeting the criteria [1,1,2,2] and [4,4,5,5,5]
The maximum length subarray has 5 elements. Return 5
Example 2
a [98,3,99,1,97,2]
Max lenght of subarray is 2
Hint: Always sort first

int max=0,count=0;
Collections.sort(a);
for(int i=0;i<a.size();i++)
{
         for(int j=i+1;j<a.size();j++)
        {
             if(Math.abs(a.get(i)-a.get(j))<=1)
                 count++;
         }
        if(count>max)
        max=count;
        count=0;
}
return(max+1);
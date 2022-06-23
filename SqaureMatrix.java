007. Sqaure Matrix, find sum of left diagonal and right diagonal and return there difference
input
5   // size of square matrix
10   20   -10     18     9
4     1      23      20    49
8     -9    -45    -15     56
10   8      24     17      92
-5   16     19     9        66
-------------------------------------------
int j, ldCount =0, rdCount=0, diffLR=0;
for(int i=0;i<arr.size();i++)     // This is moving through left diagonal [0,0] [1,1] [2,2] [3,3] [4,4]
{      
        j = i;
        ldCount += arr.get(i).get(j);
}
for(int i=0;i<arr.size();i++)
{
        j = (arr.size())-i-1;
        rdCount += arr.get(i).get(j);
}
diffLR = ldCount - rdCount;      
return Math.abs(diffLR);
------------------------------------------
Note
If you want to run through 2D array where i is increasing and j is n-1, then go with j = n-i-1;
First create the matrix and mark the indexes
Check for a pattern in index, which can be used to get right diagonal and left diagonal
for loop can accept multiple initialization and increment/decrement, but one condition, so instead of creating 2 for loops we can create only one in certain critea


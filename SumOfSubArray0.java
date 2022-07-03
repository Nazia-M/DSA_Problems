031. If sum of subArray is 0 print true else false
Input arr [4,2,-3,1,6]
Explanation here 2-3+1 = 0
Output true
Hint - Use HashSet to check if sum already present

int[] arr = {4, 2, -3, 1, 6};
int sum = 0;
Set<Integer> hs = new HashSet<Integer>();

for (int i = 0; i < arr.length; i++)
{
    sum += arr[i];

    // Return true in following cases
    // a) Current element is 0
    // b) sum of elements from 0 to i is 0
    // c) sum is already present in hash set
    if (arr[i] == 0 || sum == 0 || hs.contains(sum))
        return true;

    hs.add(sum);
}
// We reach here only when there is
// no subarray with 0 sum
return false;
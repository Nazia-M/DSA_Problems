050. Equalize Array, Given an array of integers, determine the minimum number of elements to delete to leave only elements of equal value.
Example arr = [1,2,2,3]
Delete the 2 elements 1 and 3 leaving arr[2,2] . If both twos plus either the 1 or the 3 are deleted, it takes 3 deletions to leave either [3] or [1]. The minimum number of deletions is 2. Return 2


ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(37,32,97,35,76,62));
HashMap<Integer,Integer> map = new HashMap<>();
int max=0, n =arr.size();
for(int i=0;i<n;i++)
{
     if(map.containsKey(arr.get(i)))
           map.put(arr.get(i), map.get(arr.get(i))+1);
     else
          map.put(arr.get(i), 1);
     if(map.get(arr.get(i)) > max)
          max = map.get(arr.get(i));
}
System.out.println(map);
System.out.println(max);
System.out.println(n-max);
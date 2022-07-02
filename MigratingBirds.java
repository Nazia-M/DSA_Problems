028. Migrating birds, brids type from 1 to 5, count maxCount of each type and give maxCount lowest bird type from (1-5)
Example 1
arr = [1,2,3,4,5,4,3,2,1,3,4]
Output - 3
Explanation {1=2, 2=2, 3=3, 4=3, 5=1}
MaxCount is 3 and 4, 3 is the lowest bird type so print 3
Hint: Using HashMap

ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,4,3,2,1,3,4));
HashMap<Integer,Integer> map = new HashMap();
for(int i=0;i<arr.size();i++)
{   
    if(map.containsKey(arr.get(i)))
           map.put(arr.get(i), map.get(arr.get(i))+1);
    else
          map.put(arr.get(i),1);            
}
int maxValue =0;
for(Map.Entry<Integer, Integer> entry: map.entrySet()) 
{
    if (entry.getValue() > maxValue)
        maxValue = entry.getValue();
}
int minKey =0;
for(Map.Entry<Integer, Integer> entry: map.entrySet()) 
{
    if (entry.getValue() == maxValue) 
    {
        minKey = entry.getKey();
        break;
    }
}
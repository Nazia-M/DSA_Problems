023. Breaking the records, 
Input [10, 5, 20, 20, 4, 5, 2, 25, 1]

- At Game 0, Highest Score and Lowest Score will be same as Score
- Traverse to each score, 
      if score is lower than current Lowest score -> make the score as Lowest score and increment LS counter
     if score is greater than current Highest score -> make score the Highest score value  and increment HS counter
Output Return list of Array with HS and LS counter value [2 , 4]
Note : 
1. How to initialize values in ArrayList
2. How to set value in ArrayList

public static void main(String[] args) 
{
        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(10,5,20,20,4,5,2,25,1));
        System.out.println(breakingRecords(scores));
}
public static List<Integer> breakingRecords(List<Integer> scores) 
{
        int ls = 0, hs =0;
        ArrayList<Integer> count = new ArrayList<>(Arrays.asList(0,0));
        for(int i=0;i<scores.size();i++)
        {
            if(i==0)
           {
                ls = scores.get(i); 
                hs = scores.get(i);  
            }
            if(scores.get(i) < ls)
            {
               ls = scores.get(i);
               count.set(1, count.get(1)+1);
            }
            else if(scores.get(i) > hs)
           {
                hs = scores.get(i);
                count.set(0, count.get(0)+1);
            }
        }
        return(count);
}
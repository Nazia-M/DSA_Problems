013. Convert students grade
if grade < 38
         No rounding print grade
else
         if(grade - nextMultiple of 5) <3
                        print nextMultiple of 5
         else
                     No rounding print grade
I/P    [84,29,57,73,67,38,33]
O/P  [85,29,57,75,67,40,33]
Note: 
Find next round multiple of 5, input 73 next multiple of 5 is 75
int rem = num % 5;   // Get reminder 73%5 = 3
int value = 5 - rem;   //value that needs to be added to num to make it next multiple of 5, 5 - 3 = 2
int nextMultiple = num + value;   // got nextMultiple 73 + 2 = 75

public static List<Integer> gradingStudents(List<Integer> grades) 
{
        for(int i = 0; i<grades.size();i++)
        {
             if(grades.get(i) >= 38)
            {
                int rem = grades.get(i) % 5;
                int addValue = 5 - rem;
                int nextRound = grades.get(i) + addValue;
                if((nextRound-grades.get(i)) < 3)
                    grades.set(i,nextRound);
            }
            grades.set(i, grades.get(i));
        }
        return(grades);
    }
036. Counting Valleys, An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly steps, for every step it was noted if it was an uphill U, or a downhill D step. Hikes always start and end at sea level, and each step up or down represents a  unit change in altitude. We define the following terms: A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level. A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level. Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.
Example 1
path = DDUUUUDD
Output(No of vallyes) 1 
Example 2
path = UDDDUDUU
Output(No of vallyes) 1 

String path = "UUUDDUUDDDDDUDUDUUUDDUUUUDDDDDDDUUUU";
int counter = 0, valleyCount = 0, flag =0, n=path.length();
for(int i=0;i<n;i++)
{     if (path.charAt(i) == 'U')
            counter++;
      else
            counter--;
       if(counter == -1 && flag == 0)
                flag =1;
      if(counter == 0 && flag == 1)
      {
                valleyCount++;
                flag =0;
      }
}
System.out.println(valleyCount);
051. ACM ICPC Team, Given a list of topics known by each attendee, presented as binary strings, determine the maximum number of topics a 2-person team can know. Each subject has a column in the binary string, and a '1' means the subject is known while '0' means it is not. Also determine the number of teams that know the maximum number of topics. Return an integer array with two elements. The first is the maximum number of topics known, and the second is the number of teams that know that number of topics.
Input 
4 5
10101
11100
11010
00101
output 5, 2
Calculating topics known for all permutations of 2 attendees we get:
(1,2) -> 4
(1,3) -> 5
(1,4) -> 3
(2,3) -> 4
(2,4) -> 4
(3,4) -> 5
The 2 teams (1, 3) and (3, 4) know all 5 topics which is maximal.

ArrayList<String> topic = new ArrayList<>(Arrays.asList("10101","11100","11010","00101"));
ArrayList<Integer> ac = new ArrayList<>(topic.size());
int max=0, count =0, total=0;
for(int i=0;i<topic.size();i++)
{
    for(int j=i+1;j<topic.size();j++)
    {
         count =0;
         String str1 = topic.get(i);
         int l = str1.length();
         String str2 = topic.get(j);
         for(int k=0;k<l;k++)
         {
               if(str1.charAt(k)=='1' || str2.charAt(k)=='1')
                        count++;
         }
         if(count == max)
                    total++;
         else if(count > max)
         {
                    max = count;
                    total =1;
                }
            }
}
ac.add(max);
ac.add(total);
System.out.println(ac);
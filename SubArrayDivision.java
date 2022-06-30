024. SubArray Division - At a time can take m numbers from list, if addition of m consecutive numbers is d increment counter
Example 1 
d=4 m=2
S = [2,2,1,3,2]
Output is 2,  [[2+2][1+3]]
Example 2
d=4 m=1
S = [4]
Output is 1, [4]
Example 3
d=18 m=7
S = [2,5,1,3,4,4,3,5,1,1,2,1,4,1,3,3,4,2,1]
Output is 3, [[2+1+4+1+3+3+4],[1+4+1+3+3+4+2],[4+1+3+3+4+2+1]]

int d=18, m=7,sum=0,counter=0,n = s.size();
List<Integer> s = new ArrayList<>(Arrays.asList(2,5,1,3,4,4,3,5,1,1,2,1,4,1,3,3,4,2,1));

for (int i=0;i<=n-m;i++)
{
      sum = s.get(i);
      if(i==0 && n==1)
      {     if(s.get(i)==d)
                    counter = 1;
                else
                    counter = 0;
                break;
      }
      for(int j=i+1;j<=i+m-1;j++)
      {
                sum=sum+s.get(j);
      }
      if(sum == d)
     {     counter += 1;
      }
}
System.out.println(counter);
032. Bill Division -  Anna and Brian want to split bill at dinner. k is item in the bill Anna did not eat. b is the amount Anna paid to Brain. If Brain has to pay amount back to Anna print the amount else print Bon Appetit
Example 1
k = 1, b =12 
bill = [3,10,2,9]
Output 5
Explanation : 
Remove item k from bill and take sum (3+2+9) = 14
Divide sum into half 14/2 = 7
Check amount Brain needs to pay to Anna 7-b = 7-12 = 5 (Output)
Example 2
k = 1, b = 7
bill = [3,10,2,9]
Output Bon Appetit
Explanation :
Remove item k from bill and take sum (3+2+9) = 14
Divide sum into half 14/2 = 7
Check amount Brain needs to pay to Anna 7-b = 7-7 = 0(Bon Appetit)

ArrayList<Integer> bill = new ArrayList<>(Arrays.asList(2,4,6));
int k=2,b=6,sum=0,div=0;
for(int i=0;i<bill.size();i++)
{
      if(i != k)
                sum = sum + bill.get(i);
}
div = sum/2;
if(div-b == 0)
      System.out.println("Bon Appetit");
else
     System.out.println(Math.abs(div-b));
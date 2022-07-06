037.  Electornics shop. A person wants to determine the most expensive computer keyboard and USB drive that can be purchased with a give budget. Given price lists for keyboards and USB drives and a budget, find the cost to buy them. If it is not possible to buy both items, return -1.
Example 1
b = 60
k = [40,50,60] d = [5,8,12]
output 58
Explanation
40+5 = 45    50+5 = 55       60+5=65
40+8 = 48    50+8 = 58       60+8=68
40+12 = 52    50+12 = 62   60+12=72
in the above combination 58 is coming the budget
Example 2 
b =10, k =[ 3,1], d = [5,2,8]
Output 9
Example 3
b = 5, k =4, d=5
output = -1

int[] keyboards = {40,50,60};
int[] drives = {5,8,12};
int b = 60;
int cost = -1;
for (int i = 0; i < keyboards.length; i++) 
{
            for (int j = 0; j < drives.length; j++) 
            {
                int cost = keyboards[i] + drives[j];
                if (cost > b)
                    continue;
                cost = Math.max(cost, sum);
            }
}
System.out.println(cost );
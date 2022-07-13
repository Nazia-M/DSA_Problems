Beautiful Days at the Movies

Lily likes to play games with integers. She has created a new game where she determines the difference between a number and its reverse. For instance, given the number 12, its reverse is 21. Their difference is 9. The number 120 reversed is 21, and their difference is 99.

She decides to apply her game to decision making. She will look at a numbered range of days and will only go to a movie on a beautiful day.

for(i;i<=j;i++)
{
x=i;
while(x!=0)
{
rem=x%10;
sum=(sum*10)+rem;
x=x/10;
}
if(abs(i-sum)%k==0)
count=count+1;
sum=0;
}
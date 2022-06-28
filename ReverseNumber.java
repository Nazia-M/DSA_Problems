022. Reverse a Number, number can be negative
Input -12345
Output -54321

int n = -12345,rev = 0,rem=0;  
boolean negative = false;
if(n < 0)
{
            n = Math.abs(n);
            negative = true;
}
while(n>0)
{
            rem = n%10;
            rev = (rev*10) + rem;
            n = n/10;
}
 if(negative==true)
            rev = ~(rev - 1);
System.out.println(rev);
020. Sum Of Digits
Input - 492
Output 4+9+2 =15


int n = 492;
int digit =0,sum=0;
while(n > 0)
{     digit = n %10;
      sum = sum+digit;
      n=n/10;
}
System.out.println(sum);
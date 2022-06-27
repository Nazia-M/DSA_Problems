017. If value of Array if prime print 1 else 0
{3,4,6,7,8,9,10,11}
Output
{1,0,0,1,0,0,0,1}

int[] array = {3,4,6,7,8,9,10,11};
for (int i = 0; i < array.length; i++)
{
        boolean isPrime = true;
        if (array[i] == 1)
       {
                isPrime = false;
       }
       else
       {
            for (int j = 2; j <= array[i] / 2; j++)
            {
                    if (array[i] % j == 0)
                    {
                        isPrime = false;
                        break;
                    }
            }
      }
      if (isPrime)
      {
                if (array[i] == 0){}
                else
                {
                   System.out.print(array[i] + " , ");
                    array[i] =1;
                }
        }
}
System.out.println(" Are the prime number in the array ");
for(int i=0;i<array.length;i++)
{
            if(array[i] > 1)
                array[i]=0;
            System.out.println(array[i]);
}
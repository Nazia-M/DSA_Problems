021. Find factorial 
1.Using Recursion

public static long factorial(int n) 
{
       if (n == 0)
              return 1;
        return n*factorial(n-1);
}
public static void main(String args[] ) throws Exception 
{
        System.out.println(factorial(5));
}

Output 
Factorial of 5 = 5*4*3*2*1 = 120
Factorail of 3 = 3*2 = 6
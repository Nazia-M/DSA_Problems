018. There will be two arrays of integers. Determine all integers that satisfy the following two conditions:
The elements of the first array are all factors of the integer being considered
The integer being caonsidered is a factor of all elements of the second array
These numbers are referred to as being between the two arrays. Determine how many such numbers exist.
Example 1
a = [2,6]
b= [24,36]
There are two numbers between the arrays:6  and 12 .
6%2 =0, 6%6 =0, 24%6 = 0 and 36%6 =0 for the first value.
12%2 =0, 12%6 =0, 24%12 =0, 36%12 =0 for the second value. Return 2
Example 2
a = [3,4]
b= [24,48,9,45,99]
- lcm of all elements of a is 12
- how many elements of b are divisible by 12(24 and 48), returns count 2
Example 3
a = [2,4]
b = [16,32,96]
2 and 4 divide evenly into 4,8,12 and 16
4,8 and 16 divide evenly into 16,32,96
4,8 and 16 are 3 numbers for which each element of a is factor and each factor of all elements of b. Return 3
Hint
1.  Find lcm of a Euclidean Algo
2. Traverse through b and check if lcm is divisible by each element, if divisible increase the counter

public class set2Integers 
{       static int getGCD(int n1, int n2) 
        {     if (n2 == 0)
                   return n1;
              return getGCD(n2, n1 % n2);
         }
        static int getLCM(int n1, int n2) 
        {     if (n1 == 0 || n2 == 0)
                   return 0;
              else 
              {     int gcd = getGCD(n1, n2);
                     return Math.abs(n1 * n2) / gcd;
              }
        }
        static int getTotalX(List<Integer> a, List<Integer> b) 
       {       int result = 0;

               // Get LCM of all elements of a
                int lcm = a.get(0);
                for (Integer integer : a) 
                {      lcm = getLCM(lcm, integer);      }

               // Get GCD of all elements of b
               int gcd = b.get(0);
               for (Integer integer : b) 
               {       gcd = getGCD(gcd, integer);      }

             // Count multiples of lcm that divide the gcd
               int multiple = 0;
               while (multiple <= gcd) 
               {     multiple += lcm;
                     if (gcd % multiple == 0)
                            result++;
                }
                return result;
    }
    public static void main(String[] args) 
    {
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(16,32,96));
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(2,4));
        System.out.println(getTotalX(a,b));
    }
}

Note 
1. Euclidean Algorithm for GCD
       If we subtract a smaller number from a larger (we reduce a larger number), GCD doesn’t change. So if we keep subtracting repeatedly the larger of two, we end up with GCD.
Now instead of subtraction, if we divide the smaller number, the algorithm stops when we find remainder 0.
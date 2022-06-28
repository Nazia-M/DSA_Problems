019. Find gcd and lcm - Euclidean Algo
GCD and LCM of each number in array
static int getGCD(int n1, int n2) 
{   if (n2 == 0) 
       return n1;
    return getGCD(n2, n1 % n2);
}
static int getLCM(int n1, int n2) 
{   if (n1 == 0 || n2 == 0)
        return 0;
    else 
    {   int gcd = getGCD(n1, n2);
        return Math.abs(n1 * n2) / gcd;
    }
}
static int getGCDLCM()
{    ArrayList<Integer> b = new ArrayList<>(Arrays.asList(16,32,96));
     ArrayList<Integer> a = new ArrayList<>(Arrays.asList(2,4));
        
     // Get LCM of all elements of a
     int lcm = a.get(0);
     for (Integer integer : a) 
     {   lcm = getLCM(lcm, integer); }

     // Get GCD of all elements of b
     int gcd = b.get(0);
     for (Integer integer : b) 
     {   gcd = getGCD(gcd, integer); }
}
GCD and LCM of more than one number
public static int gcd(int num1,int num2)
{  if (num2 == 0)
         return num1;
   return gcd (num2, num1 % num2);
}
static int lcm(int num1,int num2)
{   int lcm = (num1 / gcd(num1, num2)) * num2;
         return lcm;
}
public static void main (String[]args)
{    int gcd = gcd(a.get(i),a.get(i+1));
     System.out.println("-----GCD :"+gcd);
     int lcm = lcm(a.get(i),a.get(i+1));
     System.out.println(" LCM :"+lcm);
}

Note:
Euclidean Algorithm for GCD, LCM
· If we subtract a smaller number from a larger (we reduce a larger number), GCD doesn’t change. So if we keep subtracting repeatedly the larger of two, we end up with GCD.
· Now instead of subtraction, if we divide the smaller number, the algorithm stops when we find remainder 0.
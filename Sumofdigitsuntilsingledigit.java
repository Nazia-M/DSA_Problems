016. Sum of digits until single digit
Hint: Recursion

 public static void main(String[] args) {
        int n=45632;
    System.out.println(recursiveSumDigits(n));
    }
    static int recursiveSumDigits(int n) {
        int sum = 0;
        while (n > 0 || sum > 9)
        {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
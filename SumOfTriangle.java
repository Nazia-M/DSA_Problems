027. Sum triangle from array
Input : A = {1, 2, 3, 4, 5}
Output : [48]
[20, 28] -->(20 + 28 = 48)
[8, 12, 16] -->(8 + 12 = 20, 12 + 16 = 28)
[3, 5, 7, 9] -->(3 + 5 = 8, 5 + 7 = 12, 7 + 9 = 16)
[1, 2, 3, 4, 5] -->(1 + 2 = 3, 2 + 3 = 5, 3 + 4 = 7, 4 + 5 = 9)
Hint - Recursion

Approach
1. At each iteration create a new array which contains Sum of consecutive elements in array passes as parameter
2. Make recursive call and pass newly created array in previous step
3. While back tracking print the array(for printing in reverse order)

public static void printTriangle(int[] A)
{     
        if (A.length < 1)    // Base case
            return; 
        int[] temp = new int[A.length - 1];        // Create new array, contains Sum of consecutive elements in the array passes as parameter.
        for (int i = 0; i < A.length - 1; i++)
        {
            int sum = A[i] + A[i + 1];
            temp[i] = sum;
        }
        printTriangle(temp);          // Make a recursive call and pass the newly created array      
        System.out.println(Arrays.toString(A));  // Print current array in the end so that smaller arrays are printed first
}
public static void main(String[] args)
{
        int[] A = { 1, 2, 3, 4, 5 };
        printTriangle(A);
}
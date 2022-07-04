Repeating and the missing numbers
You are given an unsorted array of size n. Elements are in the range from 1 to n. One number from set {1, 2, …n} is missing and one number occurs twice in the array. Find these two numbers.
Examples: 
Input: arr[] = {3, 1, 3}
Output: Missing = 2, Repeating = 3
Explanation: In the array, 
2 is missing and 3 occurs twice 
Input: arr[] = {4, 3, 6, 2, 1, 1}
Output: Missing = 5, Repeating = 1

  int[] arr = {4, 3, 6, 2, 1, 1};
        int size=arr.length,i,missing=0;
        for (i = 0; i < size; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
            else
                System.out.println("Repeating no is : "+abs_val);
        }
        for (i = 0; i < size; i++) {
            if (arr[i] > 0)
                missing = i + 1;
        }
        System.out.println("Missing number is : "+missing);
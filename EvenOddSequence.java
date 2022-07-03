030. Keep even numbers is starting and odd numbers in end of array
Example 1
Input     arr = [14, 36, 47, 11, 10, 92, 5]
Output  arr = [14, 36, 10, 92, 47, 11, 5]
Hint : Use quick sort

int[] arr = {14, 36, 47, 11, 10, 92, 5};
int j = -1, temp;

// quick sort method
for (int i = 0; i < arr.length; i++) 
{
            if (arr[i] % 2 == 0) 
           {
                j++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
}
System.out.println(Arrays.toString(arr));
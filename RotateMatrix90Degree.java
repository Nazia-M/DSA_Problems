034. Rotate Matrix to 90 Degree
Input:
1 2 3 
4 5 6
7 8 9  
Output:
7 4 1 
8 5 2
9 6 3
Input:
1 2
3 4
Output:
3 1
4 2 

int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int n = arr.length;

        for (int i = 0; i < n / 2; i++)
        {
            for (int j = i; j < n - i - 1; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[n - 1 - j][i];
                arr[n - 1 - j][i] = arr[n - 1 - i][n - 1 - j];
                arr[n - 1 - i][n - 1 - j] = arr[j][n - 1 - i];
                arr[j][n - 1 - i] = temp;
            }
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print( arr[i][j] + " ");
            System.out.println();
        }
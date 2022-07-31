Hourglass Sum

2D Array
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Output 19

2 4 4
  2
1 2 4


 public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
          int max = Integer.MIN_VALUE;
          int total = 0;
        for(int row = 0; row < 4; row++){

            for(int col = 0; col < 4; col++ ){

                total = arr.get(row).get(col) + arr.get(row).get(col+1) + arr.get(row).get(col+2);
                total += arr.get(row+1).get(col+1);
                total += arr.get(row+2).get(col) + arr.get(row+2).get(col+1) + arr.get(row+2).get(col+2);
                max = total>max?total:max;
            }
        }
        return max;
    }

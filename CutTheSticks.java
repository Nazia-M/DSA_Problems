CutTheSticks
You are given a number of sticks of varying lengths. You will iteratively cut the sticks into smaller sticks, discarding the shortest pieces until there are none left. At each iteration you will determine the length of the shortest stick remaining, cut that length from each of the longer sticks and then discard all the pieces of that shortest length. When all the remaining sticks are the same length, they cannot be shortened so discard them.

Given the lengths of n sticks, print the number of sticks that are left before each iteration until there are none left.
Example 1
arr = [5, 4, 4, 2, 2, 8]
Explanation
sticks-length        length-of-cut   sticks-cut
5 4 4 2 2 8             2               6
3 2 2 _ _ 6             2               4
1 _ _ _ _ 4             1               2
_ _ _ _ _ 3             3               1
_ _ _ _ _ _           DONE            DONE
Output [6, 4, 2, 1]

package a_zJava.Variables.array1;

import variables.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CutTheSticks {

    public static void main(String[] args) {
//        ArrayList arr = new ArrayList(Arrays.asList(5,4,4,2,2,8));
        ArrayList arr = new ArrayList(Arrays.asList(8,8,14,10,3,5,14,12));
        System.out.println(cutTheSticks(arr));
    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        ArrayList<Integer> tempList = new ArrayList<>();
        Collections.sort(arr);
        int n = arr.size();
        tempList.add(n);
        int shorttest = arr.get(0);
        tempList(arr,n,shorttest,tempList);
       return tempList;
    }

    public static List<Integer> tempList(List<Integer> arr, int n, int shorttest,ArrayList<Integer> tempList){
        if(arr.size() ==1)
            return tempList;
        Collections.sort(arr);
        int value;
        for (int i = 0; i < n; i++) {
            value = arr.get(i) - shorttest;
            if (value == 0) {
                arr.remove(i);
                i = i - 1;
                n = n - 1;
            } else {
                arr.set(i, value);
            }
        }
        arr.size();
        if(arr.size() ==0)
            return tempList;
        tempList.add(arr.size());
        n = arr.size();
        shorttest = arr.get(0);
        System.out.println("temp "+tempList);
        tempList(arr, n,shorttest,tempList);

        return tempList;
    }
}

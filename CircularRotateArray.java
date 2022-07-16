//044. Right circular rotation on an array, a is initial Array, k number of rotations, queries are indexes of rotated array, return values at indexes provided in queries array
//        Example 1
//        a = [3,4,5] , k =2, queries = [1,2]
//        rotation1 = [5,3,4]
//        rotation2 = [4.5.3]
//        return = value at index 1 = 5, value at index 2 = 3
//        Example 2
//        a = [4,8,9,10,15,20] , k =3, queries = [1,2]
//        rotation1 = [20,4,8,9,10,15]
//        rotation2 = [15,20,4,8,9,10]
//        rotation3 = [10,15,20,4,8,9]
//        return = value at index 1 = 5, value at index 2 = 3
//        Hint:
//        1) To traverse through array in circle use modulus

package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class circularArrayRotate1_Optimize {
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries){
        int modInitialIndex=0, n = queries.size(), m = a.size();
        int relativeStep = k % (a.size());
        for(int i=0;i<n;i++){
            modInitialIndex = queries.get(i) - relativeStep;
            if(modInitialIndex < 0)
                modInitialIndex += m;
            queries.set(i,a.get(modInitialIndex));
            System.out.println(a.get(modInitialIndex));
        }
        return queries;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(4,8,9,10,15,20));
        int k = 3;
        List<Integer> queries = new ArrayList<>(Arrays.asList(0,3,5));

        System.out.println(circularArrayRotation(a,k,queries));
    }
}

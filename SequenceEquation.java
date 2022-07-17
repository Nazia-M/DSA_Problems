//Sequence Equation
//p = [5,2,1,3,4]
//| x = 1 | p(3) | p(4)=3 | p(p(4))=1 |
//| x = 2 | p(2) | p(2)=2 | p(p(2))=2 |
//| x = 3 | p(4) | p(5)=4 | p(p(5))=3 |
//| x = 4 | p(5) | p(1)=5 | p(p(1))=4 |
//| x = 5 | p(1) | p(3)=1 | p(p(3))=5 |
// Output = [4,2,5,1,3]

package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SequenceEquation {
    public static List<Integer> permutationEquation(List<Integer> p) {
        int n= p.size();
        ArrayList newP = new ArrayList();
        for(int i=1;i<=n;i++){
            int firstIndex = p.indexOf(i)+1;
            int secondIndex = p.indexOf(firstIndex)+1;
            newP.add(secondIndex);
        }
        return newP;
    }
    public static void main(String[] args) {

        ArrayList p = new ArrayList(Arrays.asList(5,2,1,3,4));
        System.out.println(permutationEquation(p));
    }
}

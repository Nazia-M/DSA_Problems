036. Print all permutations of givem String, if string length is greater than 3 print NA
Hint
use left and right pointers
swap
Convert string to charArray
charArray to String

public static  void stringPermutations(String str, int left, int right) 
{
        if (left == right)
            System.out.println(str);
        else
        {
            for (int i = left; i <= right; i++)
            {
                str = swap(str,left,i);
                stringPermutations(str, left+1, right);
                str = swap(str,left,i);
            }
        }
}
public static String swap(String a, int i, int j)
{
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
}
public static void main(String args[]) 
{
        String str = "ABC";
        int len = str.length();
        if(len <= 3)
            stringPermutations(str,0,len-1);
        else
            System.out.print("NA");
}
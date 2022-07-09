025. Check string palindrome or not
Hint : Remove all special characters
Remove all spaces
Use left and right pointer and check each character

public static boolean checkpalindrome(String s) 
{
        s = s.replaceAll("[^a-zA-Z0-9]", " ");    //Replace all special characters with space
        s = s.replaceAll("\\s", "");                     //Remove all spaces
        int i = 0, j = s.length() - 1;

        boolean flag = false;
        while (i < j) 
       {
            if(s.charAt(i) == s.charAt(j))
                flag = true;
            if(s.charAt(i) != s.charAt(j))
           {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        return flag;
}
public static void main(String[] args) 
{
        String s = "was it a car or a cat i saw?";
        System.out.println(checkpalindrome(s));
}
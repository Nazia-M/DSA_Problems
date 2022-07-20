048. 2 strings of lowercase are given , 2 operations can be performed on the string delete from last character and append to end of string. Also delete operation can be performed on empty string. Return "Yes" if String s and t are equal after k moves, else return "No"
Example 1
s = "hackerhappy" , t = "hackerrank" , k=9, output = "Yes"
move 1 - delete y from s = "hackerhapp"
move 2 - delete p from s = "hackerhap"
move 3 - delete p from s = "hackerha"
move 4 - delete a from s = "hackerh"
move 5 - delete a from s = "hacker"
move 6 - append r from t to s = "hackerr"
move 7 - append a from t to s = "hackerra"
move 8 - append n from t to s = "hackerran"
move 9 - append k from t to s = "hackerrank"
Example 2 
s="aba" t ="aba" k = 7, output = "Yes"
move 1 - delete a from s = "ab"
move 2 - delete b from s = "a"
move 3 - delete a from s = " "
move 4 - delete from empty s = " "
move 5 - append t to s = "a"
move 6 - append t to s = "ab"
move 7 - append t to s = "aba"
Example 3
s="ashley" t="ash" k =2, output = "No"
move 1 -  delete y from s = "asle"
move 2 -  delete e from s = "asl"

public static String appendAndDelete(String s, String t, int k) 
{
        String result ="";
        int sLength = s.length();
        int tLength = t.length();
        int i = 0,minOps=0,oper=0;
        if (sLength+tLength <= k)
            result = "Yes";
        else
        {
            for (   ; i<sLength && i<tLength; i++) 
                  if (s.charAt(i) != t.charAt(i)) 
                      break;
            minOps = (sLength - i) + (tLength - i);
            oper = k-minOps;
            if(k>=minOps && oper%2==0)
                result = "Yes";
            else
                result = "No";
        }   
        return result;
}
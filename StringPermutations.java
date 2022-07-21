036. Print all permutations of given String
Recursion

public static void main(String[] args) 
{
        String s = "cat";
        permutations(s, "");
}
static void permutations(String str, String str2)
{
        if (str.length() == 0)
            System.out.println(str2 + " ");
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            String str3 = str.substring(0, i) + str.substring(i + 1);
            System.out.println("i :"+i+" ch :"+ch+" str5 :"+str3);
            permutations(str3, str2 + ch);
        }
}
----------------------------------------------------------------------
str = cat
i :0 ch :c str5 :at
i :0 ch :a str5 :t
i :0 ch :t str5 :
cat 
i :1 ch :t str5 :a
i :0 ch :a str5 :
cta 
i :1 ch :a str5 :ct
i :0 ch :c str5 :t
i :0 ch :t str5 :
act 
i :1 ch :t str5 :c
i :0 ch :c str5 :
atc 
i :2 ch :t str5 :ca
i :0 ch :c str5 :a
i :0 ch :a str5 :
tca 
i :1 ch :a str5 :c
i :0 ch :c str5 :
tac
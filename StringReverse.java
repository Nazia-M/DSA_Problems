023. Reverse String
Hint
1. temp toCharArray()
2.Left and right
String str = "Apple for you?";
char[] temparray = str.toCharArray();
char temp;
int left, right = 0;
right = temparray.length - 1;

for (left = 0; left < right; left++, right--) 
{
            temp = temparray[left];
            temparray[left] = temparray[right];
            temparray[right] = temp;
}
String reversedString = new String(temparray);
System.out.println(reversedString);

Output
?uoy rof elppA

Explanation
1. Set the left index equal to 0 and right index equal to the length of the string -1.
2. Swap the characters of the start index scanning with the last index scanning one by one. After that, increase the left index by 1 (left++) and decrease the right by 1 i.e., (right--) to move on to the next characters in the character array .
3. Continue till left is less than or equal to the right.
4.Create a new String and with char[] array as it's parameter to print 
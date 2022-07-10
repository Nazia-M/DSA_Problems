042. There is a list of 0 to 25 index for eahc character a to z. Get the tallest letter from word and multiple it by lenght of word
Example 1:
h = [1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5]
word = "abc"
a=1, b=3, c=1. tallest b=3, 3*3(word length) = 9
Example 2
h = [1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,7]
word = "zaba"
z=7, a=1, b=3, a=1, tallest z=7, 7*4 = 28

int hLength = h.size(), value=0, maxValue=1,result =0;
String word = "abc";
int wordLength = word.length();
char alphabet = 'a';
HashMap<Character,Integer> map = new HashMap<Character, Integer>();
for(int i=0;i<hLength;i++)
{
    map.put(alphabet,h.get(i));
    alphabet++;
}
for(int i=0;i<wordLength;i++)
{
    value = map.get(word.charAt(i));
    if(value > maxValue)
         maxValue = value;
}
result = maxValue * wordLength;
     System.out.println(result);
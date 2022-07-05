006. Print even numbers between 1 to 10
Hint : Use Recursion

public static void main(String[] args) 
{
        printNum(1,100);
}
static void printNum(int startNum, int endNum)
{
        if(startNum > endNum)
               return;
        else if(startNum%2 == 0)
               System.out.println(startNum);
        startNum++;
        printNum(startNum,endNum);
}
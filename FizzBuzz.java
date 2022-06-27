016. Print Fizz if n is multiple of 3, print buzz if n is multiple of 5, print FizzBuss if multiple of 3 and 5
Output
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz

2 Approaches 
      1. Modules 
      2.Addition counter to get modules, as modules is an expensive computation
1. Using modules
for(int i=1;i<=15;i++)
{
            if(i%3 != 0 && i%5 != 0)
                System.out.print(i);
            if(i%3 ==0)
                System.out.print("Fizz");
            if(i%5 ==0)
                System.out.print("Buzz");
            System.out.println();
}
2.Using Addition counter
int counter3 = 1,counter5 =1;
for(int i=1;i<=15;i++)
{
      if(counter3 != 3 && counter5 != 5)
                System.out.print(i);
      if(counter3 == 3)
      {
                System.out.print("Fizz");
                counter3 = 1;
       }
       else
                counter3 += 1;
       if(counter5 == 5)
       {
                System.out.print("Buzz");
                counter5 = 1;
      }
      else
                counter5 += 1;
     System.out.println();
}
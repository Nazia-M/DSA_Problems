009. Print pattern 
      #
    ##
  ###
####
Hint : 
Using 2 for loops to traverse
If you want to traverse from right to left use n-i-1


for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {
          if(j >= (n-i-1))
                    System.out.print("#");
          else
                    System.out.print(" ");
    }
    System.out.println();
}
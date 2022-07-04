033. Drawing Book, Student can either start from front or back, page 1 is always on right, then page and 3 and so on till page n. Find how many turns it takes to reach page p from front and from back. print mimimum turns taken.
Example 1
n = 5, p = 3

From front it takes 1 turn to reach page 3
From back it takes 1 turn to reach page 3, return 1
Example 2
n = 6, p = 2

From front it takes 1 turn to reach page 2

From back it takes 2 turn to reach page 2, return min 1

public static int pageCount(int n, int p) 
{
        int TotalpageTurn,FrontCount,BackCount;
        TotalpageTurn = n/2;
        FrontCount = p/2;
        BackCount = TotalpageTurn - FrontCount;
        if(FrontCount < BackCount)
            return FrontCount;
        else
            return BackCount;
}
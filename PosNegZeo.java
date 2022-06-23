008. ArrayList of size n
count total num of positive, negative and zero values
total num of positive/n
total num of negative/n
total num of zero/n
print output to 6 decimal points, in next line
---------------------------------------
Input n = 6
ArrayList [-4, 3, -9, 0, 4, 1]
--------------------------------
Output
0.500000     
0.333333
0.166667
-----------------------------
Hint: 
 To print 6 decimal values, use double type and System.out.format("%.6f",num);
Convert int to double double a = (double) n/2;
-------------------------------------------------
double posDec=0.0d, nevDec=0.0d, zeroDec=0.0d;
int pos=0,nev=0,zero=0;
for(int i=0;i<arr.size();i++)
{
           if((arr.get(i)) >= 1)
                 pos += 1;
            else if((arr.get(i)) < 0)
                 nev += 1;   
            else if((arr.get(i)) == 0)
                 zero += 1;  
}
int arrSize = arr.size();

 posDec = (double) pos/arrSize;
System.out.format("%.6f",posDec);
System.out.println();

nevDec = (double) nev/arrSize;
System.out.format("%.6f",nevDec);
System.out.println();

zeroDec = (double) zero/arrSize;
System.out.format("%.6f",zeroDec);
System.out.println();

-------------------------------------------
To print 6 decimal values, use double type and System.out.format("%.6f",num);
pos = 3, 3 positive numbers are present(3,4,1)
nev= 2, 2 negative numbers are present(-4,-9)
zero = 1, 1 zero
posDec = pos/n = 3/6 = 0.50000
nevDec = nev/n = 2/6 = 0.333333
zeroDec = zero/n = 1/6 = 0.166667
029. Day of Programmer, Julain to Gregorian calendar
 /* Year to Day of Programmer
2100 - 13.09.2100 
2200 - 13.09.2200
2300 - 13.09.2300 
2500 - 13.09.2500
2600 - 13.09.2600
2700 - 13.09.2700
1918 - 26.09.1918
2016 - 12.09.2016 (Leap Year)
1800 - 12.09.1800

int year = 1918;  
int day=0;
if(year == 1918)
       day = 26;
else if(((year <= 1917) & (year%4 == 0)) || ((year%400 == 0) || ((year%4 ==0) & (year%100 != 0))))
        day = 12;
else
        day = 13;
String str = day+".09."+year;
System.out.println(str);
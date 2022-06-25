012. Time conversion 12 hr to 24 hr
Input 12:56:18AM -> 00:56:18
Input 02:23:43AM -> 02:23:43
Input 12:34:54PM -> 12:34:54
Input 02:23:43PM -> 14:23:43

Note: 
1) Convert String to integer
String str = "Hello";
int a = Integer.parseInt(str1);

2) Convert int to String
int a = 20;
String str = String.valueOf(a);



String hr = s.substring(0,2);
int hrInt = Integer.parseInt(hr);
String min = s.substring(3,5);
String sec = s.substring(6,8);
String amPm = s.substring(8,10);

String milTime="";
if(hr.equals("12") && amPm.equals("AM"))
            hr = "00";
else if(amPm.equals("PM") && hrInt>=1 && hrInt<=11)
{
            hrInt += 12;
            hr = String.valueOf(hrInt);
}
return(hr+":"+min+":"+sec);
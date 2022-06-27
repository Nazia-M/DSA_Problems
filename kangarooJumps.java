015. 2 Kangaross x1 and x2 jump at a interval, x1 jumps at interval v1 and x2 jumps at interval v2, check if both the kangaroos meet print YES else print No
 Input [0 3 4 2]  -> [x1 v1 x2 v2]

Kangaroos meet at position 12
Output YES
Note : v(velocity) = d(distace) / t(time)

int j,xdiff,vdiff;
xdiff = x1-x2;
vdiff = v1-v2;
if(vdiff == 0)
         j = 0;
else
        j = (x1-x2) % (v1-v2);
if(v1 > v2)
{       if(j == 0)
              return "YES";
         else
              return "NO";
}
return "NO";

v=d/t;  -> v=d/j(jump)
d=v*j
x1+v1*j = x2+v2*j
v1*j - v2*j = x2-x1
j(v1-v2) = x2-x1
j = (x2-x1) / (v1-v2)
reminder(j) = (x2-x1) % (v1-v2)
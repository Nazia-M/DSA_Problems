049. Sherlock and Squares
Given a range find the numbers which have square root
a = 24, b = 49 , square integers [25, 36, 49] return 3


int aVal = (int)Math.ceil(Math.sqrt(a));
int bVal = (int)Math.floor(Math.sqrt(b));
int square_count = bVal - aVal + 1;
return(square_count);
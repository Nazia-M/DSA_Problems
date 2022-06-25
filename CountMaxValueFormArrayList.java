Get count of the maximum value in ArrayList
Input [4,4,1,3,2,3,4,2,3,4,4,4]
Output 6
int maxCount=0;
int maxElement[] = {0};
for(int i=0;i<candles.size();i++)
{
            if(i==0)
            {
                maxElement[0] = candles.get(i);
                maxCount =1;
            }
            else if((candles.get(i)) > maxElement[0])
            {
                maxElement[0] = candles.get(i);
                maxCount =1;
            }
            else if((candles.get(i)) == maxElement[0])
            {
                maxCount +=1;
            }
}
return(maxCount);
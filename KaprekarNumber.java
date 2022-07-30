Kaprekar Numbers - 
Take sqaure of the Number, divide the sqaure to half and add both side of numbers, if the sum == number it is kaprekar number
package stringa;

public class KaprekarNumbers {
    public static void main(String[] args) {
        int  len, mid, rem;
        int p = 1, q=99999;

//        int num =77778;
        for(int j=p; j<=q;j++){

        long i = (long) j;

        long sqr = i * i;

        String sNum = Long.toString(sqr);
            len = sNum.length();
            mid = len/2;
            if(len%2 != 0)
                mid = mid+1;
            rem = len-mid;
            int l = (int) Math.pow(10,mid);
            double left = sqr/l;

            int r = (int) Math.pow(10,rem);
            double right = sqr%l;
            double sum = left+right;
           System.out.println("num :"+i+" sqr :"+sqr+" sNum :"+sNum+" len :"+len+" mid :"+mid+" rem : "+rem+" l:"+l+" left :"+left+" r:"+r+" right :"+right+" sum :"+sum);

            if(i == sum)
                System.out.println("----------Kaprekar Numbers "+i+" "+sum);


        }

    }
}

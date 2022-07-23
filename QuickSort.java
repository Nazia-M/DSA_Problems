Quick sort

package a_zJava.Variables.sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {534,76,43,768,453,768,54,7,43,74,855,8};
        int len = arr.length;

        QuickSort qsm = new QuickSort();
        qsm.quickSortRecursion(arr, 0, len-1);

        for(int i: arr)
            System.out.println(i+ " ");

    }

    int partition(int[] arr, int low, int high){

        int pivot = arr[(low+high)/2];
        while(low<=high){

             while (arr[low] < pivot){
                 low++;
             }
             while(arr[high] > pivot){
                 high --;
             }
             if(low<=high){
                 int temp = arr[low];
                 arr[low] = arr[high];
                 arr[high] = temp;

                 low++;
                 high--;

             }
        }
        return low;
    }
    void quickSortRecursion(int[] arr, int low, int high){
        int pi = partition(arr,low,high);
        if(low < pi-1){
            quickSortRecursion(arr, low, pi-1);
        }
        if(pi< high){
            quickSortRecursion(arr,pi, high);
        }
    }


}

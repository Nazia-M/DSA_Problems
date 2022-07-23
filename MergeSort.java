Merge Sort
public class MergeSort {
    int[] arr = {48,36,13,52,19,94,21};
    int[] tempArr;
    int length;
    public static void main(String[] args) {
        int[] inputArr = {48,36,13,52,19,94,21};
        MergeSort ms = new MergeSort();
        ms.sort(inputArr);
        for(int i:inputArr){
            System.out.println(i+" ");
        }
    }
    public void sort(int inputArr[]){

        this.arr = inputArr;
        this.length = inputArr.length;
        this.tempArr = new int[length];
        divideArray(0, length-1);
    }
    public void divideArray(int low, int high){
        if(low < high){
            int mid = low + (high-low)/2;
            divideArray(low,mid);
            divideArray(mid+1, high);
            mergeArray(low, mid, high);
        }
    }
    public void mergeArray(int low, int mid, int high){
        for(int i=low;i<=high;i++){
            tempArr[i] = arr[i];
        }
        int i = low;
        int j = mid +1;
        int k = low;
        while (i<=mid && j<=high){
            if(tempArr[i] <= tempArr[j]){
                arr[k] = tempArr[i];
                i++;
            }
            else{
                arr[k] = tempArr[j];
                j++;
            }
            k++;
        }
        while (i<=mid){
            arr[k] = tempArr[i];
            k++;
            i++;
        }
    }
}
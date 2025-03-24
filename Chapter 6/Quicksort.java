public class Quicksort {
    static void qsort(char arr[]){
        quick_sort(arr,0,arr.length - 1);
    }
    static void quick_sort(char arr[], int left, int right){
        if(left < right){
            int pi = partition(arr,left,right);
            quick_sort(arr,left,pi-1);
            quick_sort(arr,pi+1,right);
        }
    }
    static int partition(char arr[], int left, int right){
        int i = left - 1;
        char pivot = arr[right];
        char temp;

        for(int j = left; j < right; j++){
            if(arr[j] < pivot){
                i++;
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        temp = arr[i+1];
        arr[i+1] = pivot;
        arr[right] = temp;

        return i+1;
    }
}

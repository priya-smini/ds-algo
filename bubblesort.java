// "static void main" must be defined in a public class.
public class Main {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            boolean swapped = false;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j+1] < arr[j]){
                    swapped = true;
                    swap(arr,j,j+1);
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,3,9,1,5};
        bubbleSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

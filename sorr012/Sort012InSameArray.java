package sorr012;

public class Sort012InSameArray {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void swap(int[] arr, int a, int b){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    public static void sorting012InSameArray(int[] arr) {
        int n = arr.length;
        int nZero = 0, nTwo = n-1;
        for(int i = 0; i < n;){
            if(arr[i] == 0){
                swap(arr, i, nZero);
                nZero++;
                i++;
            }
            else if(arr[i] == 1) {
                i++;
            }
            else if(arr[i] == 2){
                swap(arr, i, nTwo);
                nTwo--;
            }
        }      
    }

    public static void main(String[] args) {
        int [] arr = {1, 0, 2, 1, 0, 1, 2 , 0};
        sorting012InSameArray(arr);
        printArray(arr);
    }
}

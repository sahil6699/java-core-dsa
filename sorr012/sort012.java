package sorr012;

public class sort012 {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sorting012(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int nextZero = 0, nextTwo = n-1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                temp[nextZero] = arr[i];
                nextZero++;
            } else if(arr[i] == 2) {
                temp[nextTwo] = arr[i];
                nextTwo--;
            }
        }
        int nextOne = nextZero;
        while (nextOne <= nextTwo) {
            temp[nextOne] = 1;
            nextOne++;
        }
        //printArray(temp);
       // System.out.println();

       //arr = temp; this will make the arr point to temp array// so we have to manually copy the values of temp in arr
       for (int i = 0; i < temp.length; i++) {
           arr[i] = temp[i];
       }
    }
    public static void main(String[] args) {
       // TODO: sort the array with only 0, 1, 2 as its elements the help of another temporary array
        int [] arr = {1, 0, 2, 1, 0, 1, 2 , 0};
        sorting012(arr);
        printArray(arr);
    }
}
    
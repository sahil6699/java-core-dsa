package sumoftwoarrays;

public class SumOfTwoARR {


    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sumOfArray(int[] a1, int[] a2, int[] a3) {
        int i = a1.length-1, j = a2.length-1,  k = a3.length-1;
        int carri = 0, num = 0;
        while (i >= 0 || j >= 0) {
            if(i >= 0 && j >= 0){
                num = a1[i] + a2[j] + carri;
            }else if (i >= 0 && j < 0) {
                num = a1[i] + carri;
            }else{
                num = a2[j] + carri;
            }
            carri = num / 10;
            a3[k] = num % 10;
            i--;j--;k--;
        }
        a3[0] = carri;
    }

    public static void main(String[] args) {
        int[] a1 = {9, 9, 9, 1, 3, 9};
        int[] a2 = {2, 0, 6, 6};
        int n;
        if (a1.length > a2.length) {
            n = a1.length + 1;
        } else {
            n = a2.length + 1;
        }
        int[] a3 = new int[n];
        sumOfArray(a1, a2, a3);

        printArray(a3);
    }
    
}

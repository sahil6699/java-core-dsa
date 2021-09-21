public class secLar {

    public static int secondLargest1(int[] arr) {
        int n = arr.length;
        int curr = 0; 
        int lar = Integer.MIN_VALUE;
        int seclar = Integer.MIN_VALUE;
        while (curr < n){
            if (arr[curr] > lar) {
                seclar = lar;
                lar = arr[curr];
            }else if (curr > seclar && curr != lar) {
                seclar = arr[curr];
            }
            curr++;
        }
        return seclar;
    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 9, 7};
        System.out.println(secondLargest1(arr));
       
    }
}

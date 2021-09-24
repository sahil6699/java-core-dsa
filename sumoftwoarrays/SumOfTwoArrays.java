package sumoftwoarrays;

public class SumOfTwoArrays {


    public static void sumofArr(int[] arr1, int[] arr2, int[] otp){
        int carry = 0, sum  = 0;
        int n = arr1.length; //int m = arr2.length; int o = otp.length;
        int i = n-1;
        while(i >= 0){
            sum = arr1[i] + arr2[i] + carry;
            carry = sum / 10;
            sum = sum % 10;
            otp[i+1] = sum;
            i--;
        }
        otp[0] = carry;
        
    }


    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        int n = arr1.length, m = arr2.length;
        if(n== 0 && m == 0) return;
        if(n == m){
            sumofArr(arr1, arr2, output);
        }else if(m < n){
            int d = n - m;
            int[] temp = new int[m+d];
            for(int i = 0; i < m+d; i++){
                if(i < d){
                    temp[i] = 0;
                }else{
                    temp[i] = arr2[i-d];
                }
            }
            arr2 = temp;
            sumofArr(arr1, arr2, output);
        }else{
            int d = m - n;
            int[] temp = new int[n+d];
            for(int i = 0; i < n+d; i++){
                if(i < d){
                    temp[i] = 0; 
                }else{
                     temp[i] = arr1[i-d];
                }
               
            }
            arr1  = temp;
            sumofArr(arr1, arr2, output);
        }
        
    }
    public static void main(String[] args) {
        int[] arr1 = {9, 7, 6, 1};
        int[] arr2 = {4, 5, 9};
        int[] output = new int[arr1.length + 1];
        sumOfTwoArrays(arr1, arr2, output);
    }    
}

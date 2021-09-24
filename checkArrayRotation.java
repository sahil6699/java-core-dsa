public class checkArrayRotation {
    public static int checkArrayRotationfun(int[] arr) {

        //approach
        // to find the array ration:-
        // 1) find the index of the minimum ele
        // 2) now this index represents how much the pos of 1st element has changes from 0
        // 3) which is possbile only when array is rotated, hence the roatation of array = change in position of minimum element

        // to achieve above we things -
        // as we can see array is sorted in inc order but some elements are roated 
        // but these rotated elements will also be inc,
        // and there will be a terminal pt where the rotated ele and the first ele (without rotaion first or min ele) will meet
        // here the difference between the diffrence b/w last rotated ele and the first or min ele will be negative
        //and the index next to terminal pt will be indicating the index of the first element 
        // and this index will be equal to the array rotation as explained above    
        for (int i = 0; i < arr.length; i++) {
            int d = arr[i+1] - arr[i];
            if(d < 0){
                return i+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
       int[] arr = {5, 6, 7, 0, 2, 3, 4};
       System.out.println(checkArrayRotationfun(arr));
    }
}

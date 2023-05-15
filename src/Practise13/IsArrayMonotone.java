package Practise13;

public class IsArrayMonotone {
    public static void main(String[] args) {
        int[] arr1 = {0,0,1,1,1,2,3};
        System.out.println(isMonotone(arr1));
        int[] arr2 = {1,0,1,1,1,2,3};
        System.out.println(isMonotone(arr2));
        int[] arr3 = {0,0,1,1,1,2,1};
        System.out.println(isMonotone(arr3));
        int[] arr4 = {0,0,1,0,1,2,3};
        System.out.println(isMonotone(arr4));
        int[] arr5 = {0,0,1,1,2,3,2};
        System.out.println(isMonotone(arr5));
        int[] arr6 = {1,1,1,1,1,1};
        System.out.println(isMonotone(arr6));
    }
    public static boolean isMonotone (int[] array){
        boolean flag = true;
        for (int i = 1; i < array.length-1; i++) {
            int a = i-1 , b = i+1;
            if ((array[i]<array[a] && array[i]<array[b]) || (array[i]>array[a] && array[i]>array[b])){
                flag = false;
                break;
            }
        }
        return flag;
    }
}

package Practise13;


public class RotateArray {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int counter = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = counter;
                counter++;
            }
        }
        printArray(array);
        System.out.println("----------------");
        int[][] newArray = rotateArray(array);
        printArray(newArray);
    }
    public static int[][] rotateArray (int[][] inputArray){
        int[][] answer = new int[inputArray.length][inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                answer[i][j] = inputArray[inputArray.length-1-j][i];
            }
        }
        return answer;
    }
    private static void printArray (int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

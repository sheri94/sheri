package Ls18;

public class ArraySort {

    public static void sortirovka(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j<array.length; j++){
                if (array[i]<array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 1, 5};
        sortirovka(arr);
    }
}

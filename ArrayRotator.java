package algorithms;
public class ArrayRotator {

    public int[] rotateLeft(int[] arr, int n){
        int h = arr.length;


        int[] rotated = new int[h];


        System.arraycopy(arr, n, rotated, 0, h - n);
        System.arraycopy(arr, 0, rotated, h - n, n);
        return rotated;
    }


}

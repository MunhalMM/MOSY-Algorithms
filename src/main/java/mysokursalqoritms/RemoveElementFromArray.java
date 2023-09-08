package mysokursalqoritms;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        RemoveElementFromArray remove = new RemoveElementFromArray();
        int[] arr = {1, 2, 3, -2, 3, 6, 3, 9, 3};
        int key = 3;
        System.out.println(remove.remove(arr, key));
    }

    public int remove(int[] arr, int key) {
        int nextElement = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != key) {
                arr[nextElement] = arr[i];
                nextElement++;
            }
        }
        return nextElement;
    }
}
public class bubblesort {
    public static void Sort(int []arr){
        for (int turn = 1; turn < arr.length; turn++) {
            for (int j = 0; j < arr.length-turn; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int []arr = {10,34,12,12,6,23,20};
        Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

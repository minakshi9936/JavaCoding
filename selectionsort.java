public class selectionsort {
    public static void sort(int []arr){
        for (int i = 0; i < arr.length; i++) {
            int mini = i;           //index
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
    }
   public static void main(String[] args) {
    int []arr = {15,12,10,16,87,61,34};
    sort(arr);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
   }
}

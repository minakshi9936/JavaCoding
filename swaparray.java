        // not swap 
public class swaparray {
    // public static void swap(int a,int b){
    //     int temp = a;
    //     a=b;
    //     b=temp;
    // }
    // public static void main(String[] args) {
    //     int []arr = {10,20,30,40,50,60};
    //     System.out.println(arr[0] + " " + arr[1]);
    //     swap(arr[0],arr[1]);
    //     System.out.println(arr[0] + " " + arr[1]);
    // }

    // now value change
    public static void swap(int []arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int []arr = {10,20,30,40,50,60};
        System.out.println(arr[0] + " " + arr[1]);
        swap(arr, 0, 1);
        System.out.println(arr[0] + " " + arr[1]);
    }
}

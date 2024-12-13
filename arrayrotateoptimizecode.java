
import java.util.Scanner;

public class arrayrotateoptimizecode {
    public static void rotate(int []arr, int k){
        int n = arr.length;
        k = k % n;
        reverse(arr,0, n-k-1);
        reverse(arr, n-k,n-1);
        reverse(arr, 0, n-1);

    }

    public static void reverse(int []arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your size of the array: ");
        int size = sc.nextInt();
        int []arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element of the array: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of rotation k: ");
        int k = sc.nextInt();
        rotate(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

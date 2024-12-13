import java.util.Scanner;

public class reversearray {
    public  static void inputarrayreverse(int []arr,int i, int j){
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
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int []arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element of the array: ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter the index number i: ");
        int i = sc.nextInt();
        System.out.print("Enter the index number j: ");
        int j = sc.nextInt();
        System.out.println();
        inputarrayreverse(arr,i,j);
        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.print(arr[j2] + " ");
        }
    }
}

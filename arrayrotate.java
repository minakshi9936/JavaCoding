import java.util.Scanner;

public class arrayrotate {
    public static void rotatearray(int []arr, int k){
        for (int j = 0; j < k; j++) {     
            int lastelement = arr[arr.length-1];
            for (int i = arr.length-2; i >=0; i--) {
                arr[i+1] = arr[i];
            }
            arr[0] = lastelement;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int []arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element of the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number of rotation k: ");          //no of ratation of the array
        int k = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        rotatearray(arr,k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

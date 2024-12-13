import java.util.Scanner;

public class Minnum {
    public static int maxnumber(int []arr){
        int smallestnum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>smallestnum){
                smallestnum = arr[i];
            }
        }
        return smallestnum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int []arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element of the array: ");
            arr[i] = sc.nextInt();
        }
        int result = maxnumber(arr);
        System.out.print("This is the maximum number: "+result);
    }
}

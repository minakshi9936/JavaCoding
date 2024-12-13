import java.util.Scanner;

public class Linear_Search {
    public static int linearsearch(int []arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter you element of the array:  ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Enter your search key:  ");
        int key = sc.nextInt();
        int result = linearsearch(arr,key);

        if(result==-1){
            System.out.println("Key not found to the array");
        } else {
            System.out.println("Key found at index number: "+ result);
        }
    }
}

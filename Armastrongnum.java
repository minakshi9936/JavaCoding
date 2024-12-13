
import java.util.Scanner;

public class Armastrongnum{
        //Number of count digit
        public  static int Countofdigit(int n){
            int count = 0;
            while (n>0) { 
                n = n/10;
                count++;
            }
            return  count;
        }

    public static boolean  isArmastrongnum(int n){
        int d = Countofdigit(n);
        int p = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = (int)(sum + Math.pow(rem, d));   // Typecasting because pow return double value
            n=n/10;
        }
        if(sum==p){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter your Input: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = isArmastrongnum(n);
        System.out.println(result);
      
    }
}
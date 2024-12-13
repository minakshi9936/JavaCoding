    //important concept how the java execute the code 

public class globalscope {
    public static void main(String[] args) {
        System.out.println("hey");
        int x = 60;
        System.out.println(val);
        fun(x);
        System.out.println(val);
        func(x);
        System.out.println(val);
    }
    static  int val = 100;

    public static void fun(int x){
        int a = 90;
        System.out.println(x);
        // val = 120;           // It change the global scope val value 100 to 120
        System.out.println(val);
    }

    public static void func(int x ){
        int a = 60;
        System.out.println(x);
        int val = 17;          // It's value is locally only inside a function frame
        System.out.println(val);
        globalscope.val = 90;            // now it change the locally funtion value by val 90  // because there is locally variable present so it promote local variable.
        System.out.println(val);

        //but one question i want locally variable is still there but i want to change the value of global variable then how i can do let see 

        System.out.println(globalscope.val);     // class name.variable to make change in global variable.
        //Note : All the global and non-premitive are made inside a heap remaining are work in stack.

    }
}

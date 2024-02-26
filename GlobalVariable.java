/**
 * GlobalVariable
 */
public class GlobalVariable {
    public static void main(String[] args) {
        // Global variable
        int a = 100;
        int b = 200;
        System.out.println(a);

        {
            //lacal variable
            int c = 300;
            System.out.println(c);
        }
        System.out.println(b);
       System.out.println(Integer.MIN_VALUE);
       System.out.println(Float.MIN_VALUE);

    }

}
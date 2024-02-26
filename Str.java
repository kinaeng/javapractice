public class Str {
    public static void main(String[] args) {
        /*
         * string คือชนิดข้อมูลที่เก็บชึดข้อความ
         * symbol = " "
         * 
         * char คือ เก็บตัวอักษร
         * symbol ' '
         * 
         */
        /*
         * String a="100", b="200";
         * int c;
         * // string -> int
         * c=Integer.parseInt(a);
         * c=c+50;
         * 
         * System.out.println(a);
         * System.out.println(b);
         * System.out.println(c);
         */
        /*
         * String a="100", b="200";
         * //string-> double
         * double c = Double.parseDouble(a);
         * double e = Double.parseDouble(b);
         * c= c+e+42.2;
         * System.out.println(c);
         */
        // int-> string
        int num1 = 100;
        String age = String.valueOf(num1);
        System.out.println(age);
    }
}

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        // true,false
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนตัวเลขที่ 1 = ");
        int a = sc.nextInt();

        System.out.print("ป้อนตัวเลขที่ 2 = ");
        int b = sc.nextInt();

        System.out.println(a + " มีค่าเท่ากับ " + b + "หรือไม่ =" + (a == b));// แสดงผลเลย
        System.out.println(a + " มีค่าไม่ท่ากับ " + b + "หรือไม่ =" + (a != b));// แสดงผลเลย
        System.out.println(a + " มีค่าน้อยกว่าหรือเท่ากับ " + b + "หรือไม่ =" + (a <= b));// แสดงผลเลย
        System.out.println(a + " มีค่ามากกว่าหรือเท่ากับ " + b + "หรือไม่ =" + (a >= b));// แสดงผลเลย
        System.out.println(a + " มีค่าน้อยกว่า " + b + "หรือไม่ =" + (a < b));// แสดงผลเลย
        System.out.println(a + " มีค่ามากกว่า " + b + "หรือไม่ =" + (a > b));// แสดงผลเลย
    }
}

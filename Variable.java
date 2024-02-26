/**
 * Variable
 */
public class Variable {

    public static void main(String[] args) {
        // นิยามตัวแปรแบบไม่ระบุค่าเริ่มต้น
        int num1;
        boolean status;
        char ice;
        float num2;
        double num3;

        // นิยามตัวแปรแบบระบุค่าเริ่มต้น
        final int NUM1 = 10 + 15; // แสดงผลอันนี้
        num2 = 15.5f * 15.5f; // Use 'f' to indicate a float literal
        ice = 'A';
        status = true;
        num1 = 100;

        // หลายบรรทัดในครั้งเดียว
        int a = 0, b = 1, c = 2;
        System.out.println("ค่าตัวเลขที่ 1 " + NUM1);
        
    }
}

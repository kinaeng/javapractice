import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        // รับค่าข้อมูล (Scanner)
        // รับข้อมูลแบบไหน ตัวเลข integer, float, long, double, ข้อความ string
        // ข้อความทำอะไร
        // ตัวเลขแบบใด๋ (คำนวณได้ไหม)

        // ประกาศใช้scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Text =  ");
        String name = sc.nextLine();// รับค่า string จากแป้นพิมพ์ไปที่ name
        /*
         * System.out.print("Age =");
         * int age = sc.nextInt(); // รับค่า intจากแป้นพิมพ์ไป age
         */
        System.out.print("Weight = ");
        Float weight = sc.nextFloat();

        System.out.print("Year = ");
        int year = sc.nextInt();

        int age = 2024 - year; // คำนวนอายุ

        System.out.println("Your Username =" + name); // แสดงข้อความ

        System.out.println("Your weight =" + weight);
        System.out.println("Your weight =" + year);
        System.out.println("Your age =" + age);
        
        //nextLine อ่านข้อความทั้งบรรทัด
        //next รับค่าจากแป้นพิมพืไม่อ่านค่าว่าง
        

    }
}
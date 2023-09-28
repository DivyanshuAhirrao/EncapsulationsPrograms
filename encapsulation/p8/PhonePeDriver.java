package assignments.encapsulation.p8;

import java.lang.reflect.Array;
import java.util.Scanner;

public class PhonePeDriver {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            PhonePe p = new PhonePe("Sample",123,456,8524);

            System.out.println("Enter the Pin : ");
            int peen = sc.nextInt();
            System.out.println("Enter new Pin : ");
            int newpin = sc.nextInt();

            p.changePin(peen,newpin);
            System.out.println(p.getPin());
            p.payment(564);
        }
}

package assignments.encapsulation.p10;

import java.util.Scanner;

public class FitnessDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Fitness f1 = new Fitness("John", 456);
        Fitness f2 = new Fitness("Chao", 159);

        String n = sc.next();
        long l1 = sc.nextLong();
        f1.checkln(n, l1);

    }
}

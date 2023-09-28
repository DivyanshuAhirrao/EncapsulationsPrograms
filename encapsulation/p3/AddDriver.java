package assignments.encapsulation.p3;

// --------------------------------------Solution By Divyanshu-----------------------------------------------
public class AddDriver {
    public static void main(String[] args) {
        Addition add1 = new Addition(10,50,100);
        Addition add2 = add1;

        double num1 = add1.Addition(10,50,100);
        double num2 = num1;

        System.out.println(num1);
        System.out.println(num2);
    }
}

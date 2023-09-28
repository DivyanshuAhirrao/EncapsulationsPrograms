package assignments.encapsulation.p2;

// --------------------------------------Solution By Divyanshu-----------------------------------------------
public class InstaDriver {
    public static void main(String[] args) {


        Instagram insta1 = new Instagram("John", "Tiger", "John123@gmail.com");
        Instagram insta2 = insta1;

        System.out.println("Name :- "+insta1.getName());
        System.out.println("pwd :-"+insta2.getPwd());
    }
}

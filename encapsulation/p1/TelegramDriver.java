package assignments.encapsulation.p1;
// --------------------------------------Solution By Divyanshu-----------------------------------------------

public class TelegramDriver {
    static Telegram t1 = new Telegram("Tom",9909873471L, "Tom12@gmail.com");
    static Telegram t2 = new Telegram("Jerry",9909873471L, "Jerry124@gmail.com");

    static String name = t1.getName();
    static long cno = t2.getContact_no();

    public static void main(String[] args) {

        System.out.println("First Object Values are : ");
        System.out.println("Name : "+name);
        System.out.println("Email : "+t1.getEmail());
        System.out.println("Contact no : "+t1.getContact_no());
        System.out.println("-------------------------------------");
        System.out.println();
        System.out.println("Second Object Values are : ");
        System.out.println("Name : "+t2.getName());
        System.out.println("Email : "+t2.getEmail());
        System.out.println("Contact no : "+cno);


    }
}

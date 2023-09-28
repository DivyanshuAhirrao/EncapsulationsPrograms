package assignments.encapsulation.p10;

public class Fitness {
    private String name;
    private long num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public Fitness(String name, long num) {
        this.name = name;
        this.num = num;
    }
    public Fitness() {

    }

    public void bookingDetails(){
        System.out.println(name);
        System.out.println(num);

        System.out.println("your class is booked !!");
    }

    public void checkln(String str,long l){
        if (str.equalsIgnoreCase(name) && l==num){
            bookingDetails();
        }
        else {
            System.out.println("Invalid Details !!");
        }
    }

}

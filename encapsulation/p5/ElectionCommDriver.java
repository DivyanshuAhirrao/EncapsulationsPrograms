package assignments.encapsulation.p5;

public class ElectionCommDriver {
    public static void main(String[] args) {

        ElectionComm ec1 = new ElectionComm("Indin","graduate",25);

            System.out.println(ec1.getAge());
            System.out.println(ec1.getNationality());
            System.out.println(ec1.getQualification());

    }
}

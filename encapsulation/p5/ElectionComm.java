package assignments.encapsulation.p5;

// --------------------------------------Solution By Divyanshu-----------------------------------------------
public class ElectionComm {
    private String nationality;
    private String qualification;
    private int age;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality.toLowerCase();
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification.toLowerCase();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

            this.age = age;

    }

    public ElectionComm(String nationality, String qualification, int age) {

        if (nationality.equalsIgnoreCase("Indian") && age >=25 && qualification.equalsIgnoreCase("graduate")) {
            this.nationality = nationality;
            this.qualification = qualification;
            this.age = age;
        }
        else {
            System.out.println("Candidate not Eligible");
        }
    }

}

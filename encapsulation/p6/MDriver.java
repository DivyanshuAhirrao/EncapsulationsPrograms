package assignments.encapsulation.p6;

// --------------------------------------Solution By Divyanshu-----------------------------------------------
public class MDriver {
    public static void main(String[] args) {

        Matrimony m = new Matrimony();

        Matrimony m1 = new Matrimony("Adams", 25,"Male");
        Matrimony m2 = new Matrimony("Smith", 28,"Male");
        Matrimony m3 = new Matrimony("Jenny", 26,"Female");
        Matrimony m4 = new Matrimony("Sheela", 28,"Female");
        Matrimony m5 = new Matrimony("Disha", 25,"Female");

        if ((m1.getGender() != m2.getGender()) && ( m1.getAge() == m2.getAge()) ){
            System.out.println(m1.getName()+" and "+m2.getName()+" its a perfect match");
        }

        if ((m1.getGender() != m3.getGender()) && ( m1.getAge() == m3.getAge()) ){
            System.out.println(m1.getName()+" and "+m3.getName()+" its a perfect match");
        }

        if ((m1.getGender() != m4.getGender()) && ( m1.getAge() == m4.getAge()) ){
            System.out.println(m1.getName()+" and "+m4.getName()+" its a perfect match");
        }

        if ((m1.getGender() != m5.getGender()) && ( m1.getAge() == m5.getAge()) ){
            System.out.println(m1.getName()+" and "+m5.getName()+" Congratulations !! its a perfect match \uD83D\uDE00");
        }

        if ((m2.getGender() != m3.getGender()) && ( m2.getAge() == m3.getAge()) ){
            System.out.println(m2.getName()+" and "+m3.getName()+" its a perfect match");
        }

        if ((m2.getGender() != m4.getGender()) && ( m2.getAge() == m4.getAge()) ){
            System.out.println(m2.getName()+" and "+m4.getName()+" Congratulations !! its a perfect match \uD83D\uDE00");
        }

        if ((m2.getGender() != m5.getGender()) && ( m2.getAge() == m5.getAge()) ){
            System.out.println(m2.getName()+" and "+m5.getName()+" Congratulations !! its a perfect match \uD83D\uDE00");
        }


        if ((m3.getGender() != m4.getGender()) && ( m3.getAge() == m4.getAge()) ){
            System.out.println(m3.getName()+" and "+m4.getName()+" Congratulations !! its a perfect match \uD83D\uDE00");
        }

        if ((m3.getGender() != m5.getGender()) && ( m3.getAge() == m5.getAge()) ){
            System.out.println(m3.getName()+" and "+m5.getName()+" its a perfect match");
        }

        if ((m5.getGender() != m4.getGender()) && ( m5.getAge() == m4.getAge()) ){
            System.out.println(m5.getName()+" and "+m4.getName()+" its a perfect match");
        }

    }
}



















//        Matrimony m6 = new Matrimony("Gera", 21,"Female");
//        Matrimony m7 = new Matrimony("Juan", 22,"Male");
//        Matrimony m8 = new Matrimony("Siri", 26,"Female");
//        Matrimony m9 = new Matrimony("Katrina", 22,"Female");
//        Matrimony m10= new Matrimony("David", 26,"Male");

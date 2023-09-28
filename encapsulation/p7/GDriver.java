package assignments.encapsulation.p7;
// --------------------------------------Solution By Divyanshu-----------------------------------------------
public class GDriver {
    public static void main(String[] args) {

        Games g1 = new Games("Hardik", 26,"Cricket");
        Games g2 = new Games("PV Sindhu", 29,"Badminton");
        Games g3 = new Games("Rohit", 32,"Cricket");
        Games g4 = new Games("Bumraah", 27,"Cricket");
        Games g5 = new Games("Anant", 33,"Chess");

        boolean b1 = Games.details( g1.getSportsName(),g2.getSportsName());
        if (b1 == true){
            System.out.println(g1.getPlayerName()+" and "+g2.getPlayerName()+" are playing "+g1.getSportsName());
        }
        boolean b2 = Games.details( g1.getSportsName(),g3.getSportsName());
        if (b2 == true){
            System.out.println(g1.getPlayerName()+" and "+g3.getPlayerName()+" are playing "+g1.getSportsName());
        }
        boolean b3 = Games.details( g1.getSportsName(),g4.getSportsName());
        if (b3 == true){
            System.out.println(g1.getPlayerName()+" and "+g4.getPlayerName()+" are playing "+g1.getSportsName());
        }
        boolean b5 = Games.details( g1.getSportsName(),g5.getSportsName());
        if (b5 == true){
            System.out.println(g1.getPlayerName()+" and "+g5.getPlayerName()+" are playing "+g5.getSportsName());
        }
        boolean b6 = Games.details( g2.getSportsName(),g3.getSportsName());
        if (b6 == true){
            System.out.println(g2.getPlayerName()+" and "+g3.getPlayerName()+" are playing "+g3.getSportsName());
        }
        boolean b7 = Games.details( g2.getSportsName(),g4.getSportsName());
        if (b7 == true){
            System.out.println(g4.getPlayerName()+" and "+g2.getPlayerName()+" are playing "+g4.getSportsName());
        }
        boolean b8 = Games.details( g2.getSportsName(),g5.getSportsName());
        if (b8 == true){
            System.out.println(g2.getPlayerName()+" and "+g5.getPlayerName()+" are playing "+g5.getSportsName());
        }

        boolean b9 = Games.details( g3.getSportsName(),g4.getSportsName());
        if (b9 == true){
            System.out.println(g3.getPlayerName()+" and "+g4.getPlayerName()+" are playing "+g3.getSportsName());
        }
        boolean b10 = Games.details( g3.getSportsName(),g5.getSportsName());
        if (b10 == true){
            System.out.println(g3.getPlayerName()+" and "+g5.getPlayerName()+" are playing "+g5.getSportsName());
        }
        boolean b11 = Games.details( g4.getSportsName(),g5.getSportsName());
        if (b11 == true){
            System.out.println(g4.getPlayerName()+" and "+g5.getPlayerName()+" are playing "+g4.getSportsName());
        }

    }
}

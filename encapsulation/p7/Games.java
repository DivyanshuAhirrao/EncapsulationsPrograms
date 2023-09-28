package assignments.encapsulation.p7;

public class Games {
    private String playerName;
    private int pAge;
    private String sportsName;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getpAge() {
        return pAge;
    }

    public void setpAge(int pAge) {
        this.pAge = pAge;
    }

    public String getSportsName() {
        return sportsName;
    }

    public void setSportsName(String sportsName) {
        this.sportsName = sportsName;
    }

    public Games(String playerName, int pAge, String sportsName) {
        this.playerName = playerName;
        this.pAge = pAge;
        this.sportsName = sportsName;
    }

    public static boolean details(String s1, String s2){
        boolean flag = true;
        if (s1.equalsIgnoreCase(s2)){
            return flag;
        }
        else {
            return false;
        }
    }
}

package assignments.encapsulation.p9;

public class NoBroker {

    private String ownName;
    private long num;
    private String addr;


    public String getOwnName() {
        return ownName;
    }

    public void setOwnName(String ownName) {
        this.ownName = ownName;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }


    public NoBroker(String ownName, long num, String addr) {
        this.ownName = ownName;
        this.num = num;
        this.addr = addr;
    }
    public void showDetails(){
        System.out.println(getOwnName());
        System.out.println(getNum());
        System.out.println(getAddr());
    }

    public void subscribe(){
        showDetails();
    }

}

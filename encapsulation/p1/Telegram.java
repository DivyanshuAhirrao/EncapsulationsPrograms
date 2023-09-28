package assignments.encapsulation.p1;

public class Telegram {
    private String name;
    private long contact_no;
    private String email;

    String Name = getName();
    long cno = getContact_no();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getContact_no() {
        return contact_no;
    }

    public void setContact_no(long contact_no) {
        this.contact_no = contact_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public Telegram(){

    }
    public Telegram(String name, long contact_no, String email) {
        this.name = name;
        this.contact_no = contact_no;
        this.email = email;
    }
}

package assignments.encapsulation.p8;

import java.util.Scanner;

public class PhonePe {

    private String name;
    private long phNum;
    private long cNum;
    private int pin;
    String orgPin = ""+pin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhNum() {
        return phNum;
    }

    public void setPhNum(long phNum) {
        this.phNum = phNum;
    }

    public long getcNum() {
        return cNum;
    }

    public void setcNum(long cNum) {
        this.cNum = cNum;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        orgPin = ""+pin;
        if (orgPin.length() == 4) {
            this.pin = pin;
        }
        else {
            System.out.println("Invalid Pin !! Enter 4 digit pin.");
        }
    }


    public PhonePe(String name, long phNum, long cNum, int pin) {
        this.name = name;
        this.phNum = phNum;
        this.cNum = cNum;
        this.pin = pin;
        orgPin = ""+this.pin;
    }
    public void payment(int inr){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the pin : ");
        int userPin = sc.nextInt();

        orgPin = ""+getPin();
        if (userPin==getPin() && orgPin.length() == 4){
            System.out.println("Payment of rs"+inr+ "/- Done Successfull");
        }
        else {
            System.out.println("Invalid Pin");
        }
    }
    public void checkBalance(int p){
        if (p == getPin()) {
            System.out.println("PIN verified successfully!! ");;
        }
        else System.out.println("PIN Invalid");
    }
    public void changePin(int pp1, int pp2){

        String p1= ""+pp1;
        String p2 = ""+pp2;

        if ( pp1==getPin() && p2.length()==4 && p1!=p2 && p2.matches("[0-9]+")){
            setPin(pp2);
            System.out.println("Pin Changed Successfully !!");
        }
        else {
            System.out.println("Invalid Input, Try Again !!");
        }
    }


}

package assignments.encapsulation.p3;

public class Addition {
    private double num1;
    private double num2;
    private double num3;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum3() {
        return num3;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }

    public Addition(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public double Addition(double num1, double num2, double num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        double total = num1+num2+num3;
        return total;
    }
}

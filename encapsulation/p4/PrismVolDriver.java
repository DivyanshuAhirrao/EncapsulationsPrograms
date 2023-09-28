package assignments.encapsulation.p4;

// --------------------------------------Solution By Divyanshu-----------------------------------------------
public class PrismVolDriver {
    static PrismVolume pv1 = new PrismVolume(40,10,200);
    static PrismVolume pv2 = pv1;

    public static void main(String[] args) {

        System.out.println(pv1.getBase()+"\n"+pv1.getHeight()+"\n"+pv1.getLength());
        System.out.println("Volume of Prism = "+prismVol1());
        System.out.println("----------------------------");
        System.out.println(pv1.getBase()+"\n"+pv1.getHeight()+"\n"+pv1.getLength());
        System.out.println("Volume of Prism = "+prismVol2());

    }
    public static double prismVol1(){
        double vol = pv1.getBase()*pv1.getHeight();
        return vol;
    }
    public static double prismVol2(){
        double vol = pv2.getBase()*pv2.getHeight();
        return vol;
    }
}

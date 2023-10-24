package AdapterPattern;

public class ViewerApp {

    public static void main(String[] args){

        Laptop laptop = new Laptop();
        PowerOutlet lPw = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet rPw = new RefrigeratorAdapter(refrigerator);

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet scPw = new SmartphoneAdapter(smartphoneCharger);

        System.out.println(lPw.plugIn());
        System.out.println(rPw.plugIn());
        System.out.println(scPw.plugIn());
    }
}

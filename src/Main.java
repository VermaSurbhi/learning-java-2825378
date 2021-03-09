import sun.lwawt.macosx.CSystemTray;

public class Main {

    public static void calculateTotalMealPrice(double listedMealPrice,
                                               double taxRate,
                                               double tipRate) {
        double tax = listedMealPrice * taxRate;
        double tip = listedMealPrice * tipRate;
        double result = listedMealPrice + tax + tip;

        System.out.println("The total meal price is " + result);
    }

    public static void main(String[] args) {
        calculateTotalMealPrice(15,.2,.08);
        calculateTotalMealPrice(25,.18,.08);
    }

}

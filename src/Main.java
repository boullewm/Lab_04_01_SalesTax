public class Main {
    public static void main(String[] args)
    {
        double purchasePrice = 10.50;
        double salesTax = 0.05;
        double finalPrice;
        finalPrice = purchasePrice * salesTax + purchasePrice;
        System.out.println("The purchase price is " + purchasePrice);
        System.out.println("The sales tax is 5%");
        System.out.println("The final price is " + finalPrice);

    }
}
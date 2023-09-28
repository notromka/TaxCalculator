public class Main {
    public static void main(String[] args)
    {
        person shirt = new person();
        shirt.price = 499;
        shirt.tax = 13.5;
        shirt.quantity = 80;
        shirt.total = shirt.price * shirt.quantity * shirt.tax;



        System.out.println("Total cost with tax is = " + shirt.total);
    }
}
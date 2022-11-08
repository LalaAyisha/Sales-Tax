import java.util.Scanner;
public class salesTax {
    public static void main(String[] args) {
        Scanner lala = new Scanner(System.in);

        double purchase;
        double stateSaleTax = 0.04;
        double countySalesTax = 0.02;
        double totalSalesTax;
        double totalSales;

        System.out.println("Enter your amount of purchase");
        purchase= lala.nextDouble();

        totalSalesTax = stateSaleTax + countySalesTax;
        totalSales= purchase + totalSalesTax;

        System.out.println("Purchase=" + purchase);

        System.out.println("state Sale Tax=" + totalSalesTax);

        System.out.println("county Sales Tax=" + countySalesTax);

        System.out.println("The Total Sales Tax=" +stateSaleTax);

        System.out.println("Finally,The Total Sales=" +totalSales );
    }
    }

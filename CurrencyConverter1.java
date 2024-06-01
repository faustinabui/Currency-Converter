import java.util.Scanner;
/**
 *  CurrencyConverter.java.
 *  Use a loop to convert dollars to Euros.
 *  @author Faustina Bui
 *  @version June 26 2023
 */
public class CurrencyConverter1  //classic "primed" sentinel loop version
{
    /**
     *  Convert dollars to Euros.
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dollar to Euro Currency Converter");
        System.out.println("=================================\n");

        System.out.print("How much (in $) is one Euro? ");
        double euro = in.nextDouble();
        
        // Ask user for a dollar value
        System.out.print("Dollar value (Q to quit): ");
        String dollarStr = in.next();
        
        while (!dollarStr.equals("Q"))
        {

        double dollars = Double.parseDouble(dollarStr);
        double euros = dollars / euro;
        System.out.printf("%.2f dollars = %.2f Euros%n", dollars, euros);
        
        // Ask user for a dollar value
        System.out.print("Dollar value (Q to quit): ");
        dollarStr = in.next();
    }

        System.out.println();
        System.out.println("--done-- Thanks for using Currency Converter");
    }
}


import java.util.Scanner;
/**
 *  CurrencyConverter.java.
 *  Use a loop to convert dollars to Euros.
 *  @author <your name here>
 *  @version Summer 2019
 */
public class CurrencyConverter2  //flag-controlled version
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
        
        // Loop
        
        
        // End of loop
        
        System.out.println();
        System.out.println("--done-- Thanks for using Currency Converter");
    }
}

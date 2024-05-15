package Day1;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Currency Conversion ----");

        while(true){
            // Ask if the current currency is USD or EUR
            System.out.print("What kind of currency do you want to convert (USD) or (EUR): ");
            String currency = scanner.nextLine();

            if(currency.equals("USD") || currency.equals("EUR")) {
                //ask for amount
                System.out.print("Enter amount: ");
                double amount = scanner.nextDouble();

                if(currency.equals("USD")){
                    double euro = amount * 0.919967;
                    System.out.println("EUR: " + euro);
                    break;
                }else{
                    double usd = amount * 1.08705;
                    System.out.println("USD: " + usd);
                    break;
                }
            }
        }
    }
}

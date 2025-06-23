import java.util.Scanner;

public class currency_converter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continueConversion = true;

        System.out.println("Welcome to Currency Converter!");

        while (continueConversion) {
            System.out.println("\nChoose an option:");
            System.out.println("1. USD to Rupee");
            System.out.println("2. Rupee to USD");
            System.out.println("3. Euro to Rupee");
            System.out.println("4. Rupee to Euro");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter the amount in USD: ");
                    double USD = scanner.nextDouble();
                    double Rupee = usdToRupee(USD);
                    System.out.println("Converted amount in Rupee: " + Rupee);
                    break;
                }
                case 2: {
                    System.out.print("Enter the amount in Rupee: ");
                    double Rupee = scanner.nextDouble();
                    double USD = RupeeToUsd(Rupee);
                    System.out.println("Converted amount in USD: " + USD);
                    break;
                }
                case 3: {
                    System.out.print("Enter the amount in Euro: ");
                    double EURO = scanner.nextDouble();
                    double Rupee = euroToRupee(EURO);
                    System.out.println("Converted amount in Rupee: " + Rupee);
                    break;
                }
                case 4: {
                    System.out.print("Enter the amount in Rupee: ");
                    double Rupee = scanner.nextDouble();
                    double EURO = RupeeToEuro(Rupee);
                    System.out.println("Converted amount in Euro: " + EURO);
                    break;
                }
                case 5: {
                    continueConversion = false;
                    System.out.println("Thank you for using the currency converter. Goodbye!");
                    break;
                }
                default:
                    System.out.println("Invalid choice. Please select a number between 1 and 5.");
            }
        }

        scanner.close();
    }

    public static double usdToRupee(double USD) {
        return USD * 86.25; 
    }

    public static double RupeeToUsd(double Rupee) {
        return Rupee * 0.012; 
    }

    public static double euroToRupee(double EURO) {
        return EURO * 99.43; 
    }

    public static double RupeeToEuro(double Rupee) {
        return Rupee * 0.01;
    }
}

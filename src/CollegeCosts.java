import java.util.Scanner;

public class CollegeCosts {
    static Scanner in = new Scanner(System.in);
    public static void main() {
        // TODO
    }

    public static String getName() {
        System.out.println("Enter student name: ");
        String name = in.nextLine();
        return name;
    }

    public static String getYear() {
        System.out.println("Year of study (First, Second, Third, Fourth, Postgraduate)? ");
        return in.nextLine();
    }

    public static void totalCosts(String name) {
        // TODO
    }

    public static boolean onCampus(String name) {
        boolean invalidResponse = true;
        do {
            System.out.println("Is " + name + " living on Campus? (yes/no)");
            String response = in.nextLine();
            if (response.equalsIgnoreCase("yes"))
                return true;
            else if (response.equalsIgnoreCase("no"))
                return false;
            else
                System.out.println("Invalid response.");
        } while (invalidResponse);
        return false;
    }


    public static double livingExpenses() {
        System.out.println("How many weeks will you be staying on campus? ");
        int lengthOfStay = in.nextInt();
        System.out.println("What are your estimated weekly living expenses?");
        double weeklyExpenses = in.nextDouble();
        System.out.println("What is the estimated cost of room and board for the year?");
        double roomAndBoard = in.nextDouble();
        double expensesTotal = lengthOfStay * weeklyExpenses + roomAndBoard;
        return expensesTotal;
    }

    public static double academicSupplies() {
        System.out.println("Enter estimated cost of books and other academic supplies: ");
        return in.nextDouble();
    }

    public static int creditHours() {
        System.out.println("How many credit hours will be taken over the next academic year? ");
        return in.nextInt();
    }

    public static double costPerCredit() {
        System.out.println("What is the cost per credit hour?");
        return in.nextDouble();
    }

    public static double calculateCostsWithCampusAccom(double expenses, double supplies, double credits, double cost ) {
        return expenses + supplies + (credits * cost);

    }

    public static double calculateCostsWithoutCampusAccom(double supplies, double credits, double cost) {
        return supplies + (credits * cost);
    }


    }

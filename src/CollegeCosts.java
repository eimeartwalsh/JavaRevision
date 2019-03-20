import java.util.Scanner;

public class CollegeCosts {
    static Scanner in = new Scanner(System.in);
    public static void main() {
        // TODO
    }

    public static String getName() {
        System.out.println("Enter student name: ");
        return in.nextLine();
    }

    public static String getYear() {
        System.out.println("Year of study (First, Second, Third, Fourth, Postgraduate)? ");
        return in.nextLine();
    }

    public static void totalCosts(String name) {
        // TODO
    }

    public static boolean onCampus() {
        // TODO
    }


    public static double livingExpenses() {
        // TODO
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

    public static double calculateCosts() {
        // TODO
    }

}

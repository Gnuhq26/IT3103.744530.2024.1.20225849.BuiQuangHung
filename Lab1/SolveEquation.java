import java.util.Scanner;

public class SolveEquation {
    public static void FirstDegreeEquation() {
        Scanner sc = new Scanner(System.in);
        double a, b;
    
        // Input a
        do {
            System.out.print("Enter a (a must not be 0): ");
            a = sc.nextDouble();
            if (a == 0) {
                System.out.println("'a' cannot be 0. Please enter a non-zero value.");
            }
        } while (a == 0);
    
        // Input b
        System.out.print("Enter b: ");
        while (!sc.hasNextDouble()) {
            System.out.println("That's not a valid number. Please try again.");
            sc.next(); // Consume the invalid input
        }
        b = sc.nextDouble();
    
        // Calculate and display the solution
        double x = -b / a;
        System.out.println("The solution of the equation is x = " + x);
    }

    public static void SystemFirstDegreeEquations() {
        // Enter coefficient
        // a1*x + b1*y = c1
        // a2*x + b2*y = c2
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a1: ");
        double a1 = sc.nextDouble();
        System.out.print("Enter b1: ");
        double b1 = sc.nextDouble();
        System.out.print("Enter c1: ");
        double c1 = sc.nextDouble();
        System.out.print("Enter a2: ");
        double a2 = sc.nextDouble();
        System.out.print("Enter b2: ");
        double b2 = sc.nextDouble();
        System.out.print("Enter c2: ");
        double c2 = sc.nextDouble();

        // Calculate the determinant coefficient
        double det = a1 * b2 - a2 * b1;

        // Check if the system of equations has a solution or not
        if (det == 0) {
            if (c1 / c2 == a1 / a2) {
                System.out.println("The system of equations has infinitely many solutions");
            } else {
                System.out.println("The system of equations has no solution");
            }
        } else {
            // Calculate x and y
            double x = (c1 * b2 - c2 * b1) / det;
            double y = (a1 * c2 - a2 * c1) / det;
            System.out.println("The solution of the system is (x;y) = (" + x + "," + y + ")");
        }
    }

    public static void SecondDegreeEquations() {
        Scanner sc = new Scanner(System.in);

        // Enter the coefficients a, b, c
        double a;
        do {
            System.out.print("Enter a (a != 0): ");
            a = sc.nextDouble();
            if (a == 0) {
                System.out.println("Invalid! Please enter a again:");
            }
        } while (a == 0);
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        // Calculate Delta
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            // Two real solutions
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The solution of equation is:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            // Double solution
            double x = -b / (2 * a);
            System.out.println("The solution of equation is:");
            System.out.println("x1 = x2 = " + x);
        } else {
            //No solution
            double re = -b / (2 * a);
            double im = Math.sqrt(-delta) / (2 * a);
            System.out.println("The equation has no solution");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi! I'm Bui Quang Hung 20225849. Please choose one of threes programs: \n"
        + " 1. Solve the first-degree quation (linear equation) with one variable.\n"
        + " 2. Solve the system of first-degree quations (linear system) with two variables.\n"
        + " 3. Solve the second-degree quation with one variable.\n"
        + " 4. Exit.\n"
        + "Your chose is: ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                FirstDegreeEquation();
                main(null);
                break;
            case 2:
                SystemFirstDegreeEquations();
                main(null);
                break;
            case 3:
                SecondDegreeEquations();
                main(null);
                break;
            case 4:
                System.out.println("Program is stopping!");
                System.exit(option);
            default:
            System.out.println("Invalid option. Please choose again.");
        }
    }
}
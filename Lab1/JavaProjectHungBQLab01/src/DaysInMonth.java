import java.util.Scanner;

public class DaysInMonth {
    // Check if the month input is valid
    private static boolean isValidMonth(String month) {
        return month.matches("(?i)^(january|jan\\.?|1|"
                            + "february|feb\\.?|2|"
                            + "march|mar\\.?|3|"
                            + "april|apr\\.?|4|"
                            + "may|5|"
                            + "june|jun\\.?|6|"
                            + "july|jul\\.?|7|"
                            + "august|aug\\.?|8|"
                            + "september|sept?\\.?|9|"
                            + "october|oct\\.?|10|"
                            + "november|nov\\.?|11|"
                            + "december|dec\\.?|12)$");
    }

    // Check if the year input is valid
    private static boolean isValidYear(String year) {
        return year.matches("^\\d{4}$");
    }

    // Check the leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Function to get month number
    private static int getMonthNumber(String monthStr) {
        monthStr = monthStr.toLowerCase().replaceAll("\\.$", ""); // Remove trailing period if present
        String[] monthNames = {"january", "february", "march", "april", "may", "june", "july", "august", 
        "september", "october", "november", "december"};
        String[] monthAbbreviations = {"jan", "feb", "mar", "apr", "may",
         "jun", "jul", "aug", "sep", "oct", "nov", "dec"};
        
        for (int i = 0; i < monthNames.length; i++) {
            if (monthStr.equals(monthNames[i]) || monthStr.equals(monthAbbreviations[i]) ||
                monthStr.equals(String.valueOf(i + 1))) {
                return i + 1;
            }
        }
        return -1;
    }

    // Function to get days in a month
    private static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        
        return daysInMonth[month - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String monthInput;
        int year;

        // Input month
        while (true) {
            System.out.println("Enter the month (name, abbreviation, or number):");
            monthInput = sc.nextLine().trim();
            if (isValidMonth(monthInput)) {
                break;
            } else {
                System.out.println("Invalid month input. Please try again.");
            }
        }

        // Input year
        while (true) {
            System.out.println("Enter the year (4 digits):");
            String yearInput = sc.nextLine().trim();
            if (isValidYear(yearInput)) {
                year = Integer.parseInt(yearInput);
                break;
            } else {
                System.out.println("Invalid year input. Please try again.");
            }
        }

        int month = getMonthNumber(monthInput);
        int days = getDaysInMonth(month, year);
        System.out.printf("Number of days in %s %d: %d%n", monthInput, year, days);

        sc.close();
    }
}
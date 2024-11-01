// Example  5: Calculate.java
import java.util.Scanner;
public class Calculate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Bui Quang Hung 20225849 - Please enter fisrt number: ");
        double firstNum = sc.nextDouble();
        System.out.print("Bui Quang Hung 20225849 - Please enter second number: ");
        double secondNum = sc.nextDouble();
        System.out.println("____________________");
        System.out.println("Sum of two numbers is: " + (firstNum + secondNum));
        System.out.println("Difference of two numbers is: " + Math.abs(firstNum - secondNum));
        System.out.println("Product of two numbers is: " + (firstNum * secondNum));
        System.out.println("Quotient of two numbers is: " + (firstNum / secondNum));
    }
}
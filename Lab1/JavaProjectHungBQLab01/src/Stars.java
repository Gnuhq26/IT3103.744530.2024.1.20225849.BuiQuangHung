
import java.util.Scanner;
public class Stars {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("20225849-Enter the n");
        int n = keyboard.nextInt();
        for (int i = 1; i <= n; i++) {
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            for(int k=1 ; k <= 2*i - 1 ; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}

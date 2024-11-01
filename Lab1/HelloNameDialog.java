// Examole 3: HelloNameDialog.java
import javax.swing.JOptionPane;
public class HelloNameDialog {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog("Please enter your name:");
        JOptionPane.showMessageDialog(null, "Hi "
         + result + " I am Bui Quang Hung 20225849! Nice to meet you");
         System.exit(0);
    }
}
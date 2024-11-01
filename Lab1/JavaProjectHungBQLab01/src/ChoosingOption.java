
import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        Object[] options = {"I do", "I don't" };
        int option = JOptionPane.showOptionDialog(null, 
        "Hi, I'm Bui Quang Hung 20225849.Do you want to change the first class ticket?", 
        "Choose options", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,
        options[0]);

        JOptionPane.showMessageDialog(null, 
        "You 've chosen:" + (option==JOptionPane.YES_OPTION?"YES": "NO"));
        System.exit(0);
    }
}

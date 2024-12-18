package hust.soict.dsai.aims.screen.cart;
import java.io.IOException;
import javax.swing.JFrame;
import hust.soict.dsai.aims.cart.CartHungBQ;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
public class CartScreenHbq extends JFrame{
    private CartHungBQ cart;
    public CartScreenHbq(CartHungBQ cart) {
        super();
        this.cart = cart;
        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);
        this.setTitle("Cart");
        this.setVisible(true);

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/hust/soict/dsai/aims/screen/cart/CartHbq.fxml"));
                    loader.setController(new CartScreenControllerHbq(cart));
//                    CartScreenControllerHbq controller = new CartScreenControllerHbq(cart);
//                    loader.setController(controller);
                    Parent root = loader.load();
                    fxPanel.setScene(new Scene(root));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

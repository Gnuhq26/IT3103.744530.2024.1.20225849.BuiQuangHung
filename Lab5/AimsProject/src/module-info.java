module Lab5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.swing;

    opens hust.soict.dsai.aims.demo to javafx.graphics, javafx.fxml;
    opens hust.soict.dsai.aims.screen.cart to javafx.fxml;
    exports hust.soict.dsai.aims.demo;
    exports hust.soict.dsai.aims.screen.cart;
}

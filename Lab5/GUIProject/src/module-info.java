module GUIProject {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.swt;
    requires java.desktop;

    opens hust.soict.dsai.javafx to javafx.fxml;
    exports hust.soict.dsai.javafx;
}

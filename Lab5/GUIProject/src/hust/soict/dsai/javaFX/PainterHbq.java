package hust.soict.dsai.javaFX;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PainterHbq extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // Tải file FXML
        Parent root = FXMLLoader.load(getClass().getResource("/hust/soict/dsai/javafx/PainterHbq.fxml"));

        // Tạo Scene từ file FXML
        Scene scene = new Scene(root);

        // Thiết lập tiêu đề và hiển thị Stage
        stage.setTitle("Painter");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

package hust.soict.dsai.aims.screen.cart;
import hust.soict.dsai.aims.cart.CartHungBQ;
import hust.soict.dsai.aims.media.CompactDiscHbq;
import hust.soict.dsai.aims.media.DVDHungBQ;
import hust.soict.dsai.aims.media.MediaHbq;
import javafx.application.Platform;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class CartScreenControllerHbq {
    private CartHungBQ cart;
    @FXML
    private Button btnPlay;
    @FXML
    private Button btnRemove;
    @FXML
    private TableColumn<MediaHbq, String> colMediaCategory;
    @FXML
    private TableColumn<MediaHbq, Float> colMediaCost;
    @FXML
    private TableColumn<MediaHbq, String> colMediaTitle;
    @FXML
    private ToggleGroup filterCategory;
    @FXML
    private TableView<MediaHbq> tblMedia;
    @FXML
    private RadioButton radioBtnFilterId;
    @FXML
    private RadioButton radioBtnFilterTtile;
    @FXML
    private TextField tfFilter;
    @FXML
    private Label lblTotalCost;
    @FXML
    private Button btnPlaceOrder;

    public CartScreenControllerHbq (CartHungBQ cart) {
        super();
        this.cart = cart;
    }
    @FXML
    private void initialize() {
        colMediaTitle.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTitleHbq()));
        colMediaCategory.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCategoryHbq()));
        colMediaCost.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getCostHbq()));
        tblMedia.setItems(FXCollections.observableArrayList(cart.getItemsHbq()));

        btnPlaceOrder.setOnMouseEntered(event -> btnPlaceOrder.setCursor(javafx.scene.Cursor.HAND));
        btnPlaceOrder.setOnMouseExited(event -> btnPlaceOrder.setCursor(javafx.scene.Cursor.DEFAULT));


        btnPlay.setVisible(true);
        btnRemove.setVisible(true);
        tblMedia.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<MediaHbq>() {
                    @Override
                    public void changed(ObservableValue<? extends MediaHbq> observable, MediaHbq oldValue, MediaHbq newValue) {
                        if (newValue != null) {
                            updateButtonBar(newValue); // Cập nhật lại trạng thái khi chọn item mới
                        }
                    }
                });
        tfFilter.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue <? extends String> observable, String oldValue, String newValue) {
                showFiterMedia(newValue);
            }
        });
        updateTotalCost();
    }
    void updateButtonBar(MediaHbq media) {
        btnRemove.setVisible(true);  // Luôn hiển thị nút Remove

        // Kiểm tra kiểu media và xác định có thể phát không
        if (media instanceof DVDHungBQ || media instanceof CompactDiscHbq) {
            btnPlay.setVisible(true);  // Hiển thị nút Play nếu là DVD hoặc CD
        } else {
            btnPlay.setVisible(false); // Ẩn nút Play nếu không phải DVD hoặc CD (ví dụ là Book)
        }
    }

    void showFiterMedia(String s) {
        cart.searchByTitleHbq(s);
    }

    @FXML
    private void btnRemovePressed(ActionEvent event) {
        MediaHbq media = tblMedia.getSelectionModel().getSelectedItem();
        if (media != null) {
            cart.removeMediaHbq(media);
            // Refresh the TableView to reflect the updated cart
            tblMedia.setItems(FXCollections.observableArrayList(cart.getItemsHbq()));

            updateTotalCost();
        }
    }

    @FXML
    private void btnPlaceOrderPressed(ActionEvent event) {
        // Hiển thị thông báo đặt hàng thành công
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Order Placed");
        alert.setHeaderText(null);
        alert.setContentText("Your order has been placed successfully!");
        alert.showAndWait();

        // Xóa tất cả các mặt hàng khỏi giỏ hàng
        cart.clearHbq();

        // Cập nhật lại tổng giá trị
        updateTotalCost();

        // Cập nhật lại giao diện
        tblMedia.setItems(FXCollections.observableArrayList(cart.getItemsHbq()));
    }

    private void updateTotalCost() {
        float totalCost = 0;
        for (MediaHbq media : cart.getItemsHbq()) {
            totalCost += media.getCostHbq();
        }

        float finalTotalCost = totalCost;
        Platform.runLater(() -> {
            lblTotalCost.setText(String.format("Total: %.2f $", finalTotalCost));
        });
    }

}

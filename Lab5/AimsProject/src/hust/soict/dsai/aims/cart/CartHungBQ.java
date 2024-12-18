package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.*;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Collections;
public class CartHungBQ {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ObservableList<MediaHbq> itemsOrdered = FXCollections.observableArrayList();;  // Giỏ hàng chứa các đối tượng Media

    // Thêm Media vào giỏ hàng (DigitalVideoDisc, Book, CompactDisc...)
    public void addMediaHbq(MediaHbq media) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media);
            System.out.println("The " + media.getClass().getSimpleName() + " \"" + media.getTitleHbq() + "\" has been added to your cart!");
        } else {
            System.out.println("Your cart is full, cannot add more!");
        }
    }
    // Xóa Media khỏi giỏ hàng
    public void removeMediaHbq(MediaHbq media) {
        if (itemsOrdered.isEmpty()) {
            System.out.println("Your cart is empty!");
            return;
        }
        boolean found = false;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (itemsOrdered.get(i).getTitleHbq().equals(media.getTitleHbq())) {
                itemsOrdered.remove(i);
                found = true;
                System.out.println("Remove " + media.getClass().getSimpleName() + " \"" + media.getTitleHbq() + "\" successfully!");
                break;
            }
        }
        if (!found) {
            System.out.println("Media not found in the cart.");
        }
    }
    // Tính tổng chi phí của tất cả các Media trong giỏ hàng
    public float totalCostHbq() {
        float total = 0f;
        for (MediaHbq media : itemsOrdered) {
            total += media.getCostHbq();  // Giả sử mỗi lớp con của Media đều có phương thức getCostHbq()
        }
        return total;
    }
    // Liệt kê tất cả các ID của Media trong giỏ hàng
    public void listID() {
        if (itemsOrdered.size() == 0) {
            System.out.println("Your cart is empty!");
            return;
        }
        System.out.println("List of items in the cart:");
        for (MediaHbq media : itemsOrdered) {
            System.out.println(media.getClass().getSimpleName() + " ID: " + media.getIdHbq() +
                    ", Title: " + media.getTitleHbq());
        }
    }
    // In giỏ hàng với thông tin chi tiết của các Media
    public void printCartHbq() {
        if (itemsOrdered.isEmpty()) {
            System.out.println("The cart is currently empty");
        } else {
            StringBuilder output = new StringBuilder("*********************CART************************** \nOrdered items: \n");
            for (MediaHbq media : itemsOrdered) {
                output.append(media.toString()).append("\n"); // Thêm thông tin media vào StringBuilder
            }
            output.append("Total: ").append(totalCostHbq()).append(" $\n");
            output.append("***************************************************\n");
            System.out.println(output);
        }
    }
    
    // Tìm Media theo ID
    public MediaHbq searchByIDHbq(int id) {
        for (MediaHbq media : itemsOrdered) {
            if (media.getIdHbq() == id) {
                System.out.println(media.toString());
                return media; // Trả về đối tượng Media tìm thấy
            }
        }
        System.out.println("No Media found with Id = " + id + " in cart");
        return null; // Trả về null nếu không tìm thấy
    }
    // Tìm Media theo Title
    public MediaHbq searchByTitleHbq(String title) {
        for (MediaHbq media : itemsOrdered) {
            if (media.isMatch(title)) {  // Giả sử là phương thức kiểm tra tiêu đề trong Media
                System.out.println(media.toString());
                return media; // Trả về đối tượng Media tìm thấy
            }
        }
        System.out.println("No Media found with title \"" + title + "\"" + " in cart");
        return null; // Trả về null nếu không tìm thấy
    }
    // Sắp xếp theo comparator
    public void sortCartByTitleThenCost() {
        Collections.sort(itemsOrdered, MediaHbq.COMPARE_BY_TITLE_COST);
        System.out.println("Cart sorted by title then cost.");
    }

    public void sortCartByCostThenTitle() {
        Collections.sort(itemsOrdered, MediaHbq.COMPARE_BY_COST_TITLE);
        System.out.println("Cart sorted by cost then title.");
    }
    // Phương thức clear() để xóa tất cả các phần tử trong giỏ hàng
    public void clearHbq() {
        itemsOrdered.clear();  // Dùng phương thức clear() của ArrayList để xóa tất cả các phần tử
        System.out.println("The cart has been cleared.");
    }
    // Kiểm tra giỏ hàng trống hay không
    public boolean isEmptyHbq() {
        return itemsOrdered.isEmpty(); // itemsInCartHbq là danh sách chứa các Media trong giỏ
    }

    public ObservableList<MediaHbq> getItemsHbq() {
        return itemsOrdered;
    }
}

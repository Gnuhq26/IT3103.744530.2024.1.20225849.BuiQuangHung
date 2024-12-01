package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.*;
import java.util.ArrayList;
public class CartHungBQ {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<MediaHbq> itemsOrdered = new ArrayList<MediaHbq>();  // Giỏ hàng chứa các đối tượng Media

    // Thêm Media vào giỏ hàng (DigitalVideoDisc, Book, CompactDisc...)
    public void addMediaHbq(MediaHbq media) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media);
            System.out.println("The " + media.getClass().getSimpleName() + " \"" + media.getTitleHbq() + "\" has been added!");
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
        StringBuilder output = new StringBuilder("*********************CART************************** \nOrdered items: \n");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            MediaHbq media = itemsOrdered.get(i);
            output.append(i + 1).append(". ").append(media.getClass().getSimpleName()).append(" - [")
                    .append(media.getTitleHbq()).append("] - [")
                    .append(media.getCategoryHbq()).append("] - [");

            if (media instanceof DiscHbq) {  // Nếu là Disc (DVD, CompactDisc)
                DiscHbq disc = (DiscHbq) media;
                output.append(disc.getAuthorHbq()).append("] - [")
                        .append(disc.getLengthHbq()).append("]: ");
            } else if (media instanceof BookHbq) {  // Nếu là Book
                BookHbq book = (BookHbq) media;
                output.append(book.getAuthorsHbq()).append("] - [");
            }
            output.append(media.getCostHbq()).append(" $\n");
        }
        output.append("Total: ").append(totalCostHbq()).append(" $\n");
        output.append("***************************************************\n");
        System.out.println(output);
    }
    // Tìm Media theo ID
    public void searchByIDHbq(int id) {
        boolean found = false;
        System.out.println("Search results for Id \"" + id + "\":");
        for (MediaHbq media : itemsOrdered) {
            if (media.getIdHbq() == id) {
                System.out.println("Your cart has Media with Id = " + id + ", its title is " + media.getTitleHbq());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No Media found with Id = " + id);
        }
    }
    // Tìm Media theo Title
    public void searchByTitleHbq(String title) {
        boolean found = false;
        System.out.println("Search results for title \"" + title + "\":");
        for (MediaHbq media : itemsOrdered) {
            if (media.isMatch(title)) {  // Giả sử là phương thức kiểm tra tiêu đề trong Media
                System.out.println("Your cart has Media with title " + media.getTitleHbq() + ", its Id is " + media.getIdHbq());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No Media found with title \"" + title + "\"");
        }
    }
}

package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.*;
import java.util.ArrayList;
import java.util.List;
public class StoreHungBQ {
    public static final int MAX_NUMBERS_IN_STORE = 100;

    // Attribute: danh sách động các đối tượng Media có sẵn trong cửa hàng
    private List<MediaHbq> itemsInStoreHbq;
    // Constructor để khởi tạo cửa hàng
    public StoreHungBQ() {
        itemsInStoreHbq = new ArrayList<>(); // Sử dụng ArrayList để thay đổi kích thước động
    }
    // Method to add a Media to the store (DigitalVideoDisc, Book, CompactDisc...)
    public void addMediaHbq(MediaHbq media) {
        if (itemsInStoreHbq.size() >= MAX_NUMBERS_IN_STORE) {
            System.out.println("The store is full, cannot add more items.");
            return;
        }
        itemsInStoreHbq.add(media);
        System.out.println("The " + media.getClass().getSimpleName() + " \"" + 
        media.getTitleHbq() + "\" has been added to the store!");
    }
    // Method to remove a Media from the store
    public void removeMediaHbq(MediaHbq media) {
        boolean found = false;
        for (MediaHbq storeMedia : itemsInStoreHbq) {
            if (storeMedia == media) {
                itemsInStoreHbq.remove(storeMedia);
                System.out.println("The " + storeMedia.getClass().getSimpleName() + 
                " \"" + storeMedia.getTitleHbq() + "\" has been removed from the store.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No media found in the store that matches the given media.");
        }
    }
    // Method to search for a Media by its title
    public MediaHbq searchByTitleHbq(String title) {
        for (MediaHbq media : itemsInStoreHbq) {
            if (media.getTitleHbq().equalsIgnoreCase(title)) {
                
                return media; // Trả về đối tượng Media tìm thấy
            }
        }
        System.out.println("No media with the title \"" + title + "\" was found in the store.");
        return null; // Trả về null nếu không tìm thấy
    }
    // Hiển thị danh sách tất cả media trong store
    public void displayStoreHbq() {
        if (itemsInStoreHbq.isEmpty()) {
            System.out.println("The store is currently empty.");
            return;
        }
        for (MediaHbq media : itemsInStoreHbq) {
            System.out.println(media.toString());
        }
    }
    public void printMediaInfo(MediaHbq media) {
        if (media == null) {
            System.out.println("Media not found.");
            return;
        }
        // In thông tin thông qua phương thức toString()
        System.out.println(media.toString());
    }
}

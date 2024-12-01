package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.disc.DVDHungBQ;
public class StoreHungBQ {
     // Attribute: danh sách động các đĩa DVD có sẵn trong cửa hàng
    private List<DVDHungBQ> itemsInStoreHbq;
    //Constructor để khởi tạo cửa hàng
    public StoreHungBQ() {
        itemsInStoreHbq = new ArrayList<>(); // Sử dụng ArrayList để thay đổi kích thước động
    }
    // Method to add a DVD to the store
    public void addDVDBQH(DVDHungBQ dvd) {
        if (dvd == null) {
            System.out.println("Cannot add a null DVD to the store.");
            return;
        }
        itemsInStoreHbq.add(dvd);
        System.out.println("The DVD \"" + dvd.getTitleHbq() + "\" has been added to the store!");
    }
    // Method to remove a DVD from the store 
    public void removeDVDBQH(DVDHungBQ dvd) {
        if (dvd == null) {
            System.out.println("Cannot remove a null DVD from the store.");
            return;
        }
        boolean found = false;
        for (DVDHungBQ storeDVD : itemsInStoreHbq) {
            if (storeDVD == dvd) {  
                itemsInStoreHbq.remove(storeDVD);
                System.out.println("The DVD \"" + storeDVD.getTitleHbq() + "\" has been removed from the store.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found in the store that matches the given DVD.");
        }
    }
    
}
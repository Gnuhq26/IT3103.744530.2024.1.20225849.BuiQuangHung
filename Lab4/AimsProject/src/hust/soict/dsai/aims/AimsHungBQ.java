package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.media.*;

public class AimsHungBQ {
    public static void main(String[] args) {
         // Tạo đối tượng Cart
         CartHungBQ cart = new CartHungBQ();

         // Tạo đối tượng DVD, Book, CompactDisc
         DVDHungBQ dvd1 = new DVDHungBQ("DVD Title 1", "Action",  "Director 1", 120, 0.5f);
 
         BookHbq book1 = new BookHbq(3, "Book Title 1", "Fiction", 15.0f);
         book1.addAuthor("Author 1");
         book1.addAuthor("Author 2");
 
         CompactDiscHbq cd1 = new CompactDiscHbq(4, "CD Title 1", "Music", "Artist 1", "Cak", 100 , 12.5f);
         cd1.addTrackHbq(new TrackHbq( "Track 1", 3));
         cd1.addTrackHbq(new TrackHbq( "Track 2", 4));
 
         // Thêm các đối tượng vào giỏ hàng
         cart.addMediaHbq(dvd1);
         cart.addMediaHbq(book1);
         cart.addMediaHbq(cd1);
 
         // In giỏ hàng
         cart.printCartHbq();
 
         // Tính tổng chi phí
         System.out.println("Total Cost: " + cart.totalCostHbq() + " $");
     }

}


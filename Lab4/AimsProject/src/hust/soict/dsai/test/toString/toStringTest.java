package hust.soict.dsai.test.toString;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import hust.soict.dsai.aims.media.*;
public class toStringTest {
   public static void main(String[] args) {
        // Tạo danh sách các đối tượng Media
        List<MediaHbq> mediaList = new ArrayList<>();
        
        mediaList.add(new CompactDiscHbq(1, "Big Bang concert", "Music", "G-Dragon", "Top", 180, 9f));
        mediaList.add(new DVDHungBQ("Dragon Ball", "Anime", 12f));
        mediaList.add(new BookHbq(3, "Book 10000 question why", "hihi", 5f));
        
        // In ra trước khi sắp xếp
        System.out.println("Before sorting:");
        for (MediaHbq m : mediaList) {
            System.out.println(m);
        }

        // Sắp xếp theo tiêu đề và chi phí (theo thứ tự bảng chữ cái và chi phí giảm dần)
        Collections.sort(mediaList, MediaHbq.COMPARE_BY_TITLE_COST);
        
        System.out.println("\nAfter sorting by title and then cost:");
        for (MediaHbq m : mediaList) {
            System.out.println(m);
        }
        
        // Sắp xếp theo chi phí và sau đó theo tiêu đề (theo chi phí giảm dần và tiêu đề theo bảng chữ cái)
        Collections.sort(mediaList, MediaHbq.COMPARE_BY_COST_TITLE);
        
        System.out.println("\nAfter sorting by cost and then title:");
        for (MediaHbq m : mediaList) {
            System.out.println(m);
        }
    }
}

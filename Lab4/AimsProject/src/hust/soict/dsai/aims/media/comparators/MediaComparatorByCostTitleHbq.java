package hust.soict.dsai.aims.media.comparators;
import java.util.Comparator;
import hust.soict.dsai.aims.media.MediaHbq;

public class MediaComparatorByCostTitleHbq implements Comparator<MediaHbq> {
    @Override
    public int compare(MediaHbq m1, MediaHbq m2) {
        // Sắp xếp theo chi phí giảm dần
        int costCompare = Float.compare(m2.getCostHbq(), m1.getCostHbq());        
        // Nếu chi phí giống nhau, sắp xếp theo tiêu đề
        if (costCompare == 0) {
            return m1.getTitleHbq().compareToIgnoreCase(m2.getTitleHbq()); 
        }
        return costCompare;
    }
}

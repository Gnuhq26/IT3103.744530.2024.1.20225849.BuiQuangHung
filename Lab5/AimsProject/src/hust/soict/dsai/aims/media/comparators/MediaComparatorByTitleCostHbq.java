package hust.soict.dsai.aims.media.comparators;
import java.util.Comparator;
import hust.soict.dsai.aims.media.MediaHbq;
public class MediaComparatorByTitleCostHbq implements Comparator<MediaHbq> {
    @Override
    public int compare(MediaHbq m1, MediaHbq m2) {
        // Sắp xếp theo tiêu đề
        int titleCompare = m1.getTitleHbq().compareToIgnoreCase(m2.getTitleHbq());
        // Nếu tiêu đề giống nhau, sắp xếp theo chi phí giảm dần
        if (titleCompare == 0) {
            return Float.compare(m2.getCostHbq(), m1.getCostHbq()); 
        }
        return titleCompare;
    }
}

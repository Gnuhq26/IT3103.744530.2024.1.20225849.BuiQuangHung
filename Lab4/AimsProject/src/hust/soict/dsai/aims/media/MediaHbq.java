package hust.soict.dsai.aims.media;
import java.util.Comparator;
import hust.soict.dsai.aims.media.comparators.*;

public abstract class MediaHbq implements Comparable<MediaHbq>{
    @Override
    public int compareTo(MediaHbq other) {
        // So sánh theo title
        int titleComparison = this.title.compareToIgnoreCase(other.title);
        if (titleComparison != 0) {
            return titleComparison;
        }

        // Nếu title giống nhau, so sánh theo category
        int categoryComparison = this.category.compareToIgnoreCase(other.category);
        if (categoryComparison != 0) {
            return categoryComparison;
        }

        // Nếu title và category giống nhau, so sánh theo cost
        return Float.compare(this.cost, other.cost);
    }
    
    // @Override
    // public int compareTo(MediaHbq o) {
    //     // So sánh theo title
    //     int titleComparison = this.title.compareToIgnoreCase(o.title);
    //     if (titleComparison != 0) {
    //         return titleComparison;
    //     }
    //     // Nếu title giống nhau, so sánh theo cost 
    //     return Float.compare(o.cost, this.cost);
    // }
    private int id;
    private String title;
    private String category;
    private float cost;

    public static final Comparator<MediaHbq> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCostHbq();
    public static final Comparator<MediaHbq> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitleHbq();
    // Constructor
    public MediaHbq() {}
    public MediaHbq(String title, float cost) {
        this.title = title;
        this.cost = cost;
    }
    public MediaHbq(String title, String category, float cost) {
        this(title, cost);
        this.cost = cost;
    }
    public MediaHbq(int id, String title, String category, float cost) {
        this(title, category, cost);
        this.id = id;
    }    
    // Getters and Setters
    public int getIdHbq() {
        return id;
    }
    public String getTitleHbq() {
        return title;
    }
    public String getCategoryHbq() {
        return category;
    }
    public void setCategoryHbq(String category) {
        this.category = category;
    }
    public float getCostHbq() {
        return cost;
    }
    // Phương thức kiểm tra khớp tiêu đề
    public boolean isMatch(String title) {
        return this.getTitleHbq().equalsIgnoreCase(title); // So sánh tiêu đề không phân biệt chữ hoa/thường
    }
    @Override
    public boolean equals(Object obj) {
        // Kiểm tra nếu tham chiếu đến chính nó
        if (this == obj) return true;
        // Kiểm tra nếu obj là null hoặc không cùng kiểu lớp
        if (obj == null || getClass() != obj.getClass()) return false;
        // Ép kiểu obj thành MediaHbq
        MediaHbq media = (MediaHbq) obj;
        // So sánh title (không phân biệt chữ hoa/thường)
        return this.isMatch(media.getTitleHbq());
    }
    @Override
    public String toString() {
        return "Media [Id=" + getIdHbq() + ", Title=" + getTitleHbq() + ", Category=" + getCategoryHbq() + ", Cost=" + getCostHbq() + "]";
    }
}
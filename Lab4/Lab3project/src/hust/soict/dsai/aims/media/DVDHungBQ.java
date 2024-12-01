package hust.soict.dsai.aims.media;
public class DVDHungBQ extends MediaHbq{
    private static int nbDigitalVideoDiscsHbq = 0;
    private int length;
    private String author;

    public DVDHungBQ(int id, String title, String category, float cost, int length, String author) {
        super(id, title, category, cost);
        this.length = length;
        this.author = author;
    }
    public void setLengthHbq(int lengthSet) { 
        length = lengthSet; 
    }
    public int getLengthHbq() {
        return length;
    }
    public DVDHungBQ(String title) {
        super(++nbDigitalVideoDiscsHbq, title, null, 0.0f); 
    }
    public DVDHungBQ(String title, String category, float cost) {
        this(title); 
        this.setCategoryHbq(category);
        this.setCostHbq(cost); 
    }
    public DVDHungBQ(String title, String category, String author, float cost) { 
        this(title, category, cost);
        this.author = author;     
    }
    public DVDHungBQ(String title, String category, String author, int length, float cost) {    
        this(title, category, author, cost);
        this.length = length;
    }
    public boolean isMatch(String title) {
        return this.getTitleHbq().equalsIgnoreCase(title); // So sánh tiêu đề không phân biệt chữ hoa/thường
    }
}
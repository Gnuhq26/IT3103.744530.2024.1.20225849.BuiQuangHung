package hust.soict.dsai.aims.media;
public class DiscHbq extends MediaHbq {
    private int length;
    private String author;
    // Constructor đầy đủ
    public DiscHbq(int id, String title, String category, float cost, int length, String author) {
        super(id, title, category, cost); // Gọi constructor lớp Media
        this.length = length;
        this.author = author;
    }
    public DiscHbq(String title, float cost) {
        super(title, cost);
    }
    // Getters
    public int getLengthHbq() {
        return length;
    }
    public String getAuthorHbq() {
        return author;
    }
    // Setter
    public void setLengthHbq (int length) {
        this.length = length;
    }
    public void setAuthorHbq (String author) {
        this.author = author;
    }
}

package hust.soict.dsai.aims.media;

public class DiscHbq extends MediaHbq {
    private int length;
    private String director;
    // Constructor đầy đủ
    public DiscHbq(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost); // Gọi constructor lớp Media
        this.length = length;
        this.director = director;
    }
    // Getters
    public int getLength() {
        return length;
    }
    public String getDirector() {
        return director;
    }
    // Constructor không có length và director
    public DiscHbq(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }
}

package hust.soict.dsai.aims.media;
public class TrackHbq implements PlayableHbq{
    // Private fields
    private String title;
    private int length;  // Length in seconds
    public void play() {
        System.out.println("Playing track: " + this.getTitleHbq());
        System.out.println("Track length: " + this.getLengthHbq());
    }
    // Constructor
    public TrackHbq(String title, int length) {
        // Validate title
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
        // Validate length
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0.");
        }
        this.title = title;
        this.length = length;
    }
    // Getter
    public String getTitleHbq() {
        return title;
    }
    public int getLengthHbq() {
        return length;
    }
    @Override
    public boolean equals(Object obj) {
        // Kiểm tra nếu tham chiếu đến chính nó
        if (this == obj) return true;
        // Kiểm tra nếu obj là null hoặc không cùng kiểu lớp
        if (obj == null || getClass() != obj.getClass()) return false;
        // Ép kiểu obj thành TrackHbq
        TrackHbq track = (TrackHbq) obj;
        // So sánh title và length
        return this.title.equalsIgnoreCase(track.title) && this.length == track.length;
    }
}

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
}

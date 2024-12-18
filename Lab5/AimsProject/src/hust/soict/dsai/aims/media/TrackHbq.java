package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerExceptionHbq;

public class TrackHbq implements PlayableHbq{
    // Private fields
    private String title;
    private int length;  // Length in seconds

    public void play() throws PlayerExceptionHbq {
        if (this.getLengthHbq() <= 0) {
            // Print error message to the system
            System.err.println("Error: The length of the media is invalid (<= 0). Cannot play the media: " + this.getTitleHbq());
            // Raise the PlayerException
            throw new PlayerExceptionHbq("Cannot play the media. Length is less than or equal to 0.");
        }

        // If length is valid, proceed with playing the media (simulation)
        System.out.println("Playing " + this.getTitleHbq());
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

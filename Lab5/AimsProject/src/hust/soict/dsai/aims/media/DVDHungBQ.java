package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerExceptionHbq;

public class DVDHungBQ extends DiscHbq implements PlayableHbq {
    private static int nbDigitalVideoDiscsHbq = 0;

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
    // Constructor với tự động tạo id
    public DVDHungBQ(String title) {
        super(++nbDigitalVideoDiscsHbq, title, null, null, 0, 0.0f);
    }
    // Constructor chỉ với title và cost
    public DVDHungBQ(String title, float cost) {
        super(title, cost); // Gọi constructor của DiscHbq
    }
    // Constructor chỉ với title, category và cost
    public DVDHungBQ(String title, String category, float cost) {
        this(title, cost);
        this.setCategoryHbq(category);
    }
    // Constructor chỉ với title, category, author và cost
    public DVDHungBQ(String title, String category, String author, float cost) {
        this(title, category, cost);
        this.setAuthorHbq(author);
    }
    // Constructor chỉ với title, category, author, length và cost
    public DVDHungBQ(String title, String category, String author, int length, float cost) {
        this(title, category, author, cost);
        this.setLengthHbq(length);
    }
    // Phương thức kiểm tra khớp tiêu đề
    public boolean isMatch(String title) {
        return this.getTitleHbq().equalsIgnoreCase(title); // So sánh tiêu đề không phân biệt chữ hoa/thường
    }
    @Override
    public String toString() {
        return "DVD [" + getTitleHbq() + 
        " - " + getCategoryHbq() + 
        " - " + getAuthorHbq() + 
        " - " + getLengthHbq() + 
        " - " + getCostHbq() + "]";
    }
}

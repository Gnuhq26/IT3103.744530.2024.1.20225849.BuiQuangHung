package hust.soict.dsai.aims.media;
import java.util.ArrayList;
public class CompactDiscHbq extends DiscHbq implements PlayableHbq{
    private String artist;  
    private ArrayList<TrackHbq> tracks;  //ArrayList chứa các đối tượng TrackHbq    

    public void play() {
        System.out.println("Playing CompactDisc: " + this.getTitleHbq());
        System.out.println("Artist: " + this.artist);
        System.out.println("Tracks on this CD:");
        // Lặp qua tất cả các track và gọi phương thức play() của từng track
        for (TrackHbq track : tracks) {
            track.play();
        }
    }
    // Constructor với title và cost
    public CompactDiscHbq(String title, float cost) {
        super(title, cost); 
        this.tracks = new ArrayList<TrackHbq>();  // Khởi tạo danh sách tracks
    }
    // Constructor với các tham số đầy đủ
    public CompactDiscHbq(int id, String title, String category,  String author, String artist, int length, float cost) {
        super(id, title, category, cost, length, author); 
        this.artist = artist;  // Gán giá trị cho trường artist
        this.tracks = new ArrayList<TrackHbq>();  // Khởi tạo danh sách tracks
    }
    // Getter cho artist
    public String getArtistHbq() {
        return artist;
    }
    // Phương thức thêm track vào danh sách tracks
    public void addTrackHbq(TrackHbq track) {
        // Kiểm tra xem track đã tồn tại chưa
        if (tracks.contains(track)) {
            System.out.println("Track already exists in the list.");
        } else {
            tracks.add(track);
            System.out.println("Track added.");
        }
    }
    // Phương thức xóa track khỏi danh sách tracks
    public void removeTrackHbq(TrackHbq track) {
        // Kiểm tra xem track có trong danh sách không
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed.");
        } else {
            System.out.println("Track not found.");
        }
    }
    // Phương thức tính tổng length của CompactDisc từ các track
    public int getLengthHbq() {
        int totalLength = 0;
        for (TrackHbq track : tracks) {
            totalLength += track.getLengthHbq();  // Cộng tổng length của từng track
        }
        return totalLength;
    }
}

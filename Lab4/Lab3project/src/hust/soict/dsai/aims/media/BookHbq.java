package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;
public class BookHbq extends MediaHbq {
    private List<String> authors = new ArrayList<>();
    public BookHbq(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }
    // Add an author 
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println(authorName + " has been added.");
        } else {
            System.out.println(authorName + " is already in the list.");
        }
    }
    // Remove an author
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println(authorName + " has been removed.");
        } else {
            System.out.println(authorName + " is not in the list.");
        }
    }
}
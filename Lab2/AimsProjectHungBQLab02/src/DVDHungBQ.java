public class DVDHungBQ {
    //Khai báo thuộc tính
    private String title;
    private String category;
    private String author;
    private int length;
    private float cost;

    //Các phương thức của lớp DVD
    public String getTitleHbq() {
        return title;
    }

    public String getCategoryHbq() {
        return category;
    }

    public String getAuthorHbq() {
        return author;
    }

    public int getLengthHbq() {
        return length;
    }

    public float getCostHbq() {
        return cost;
    }

    // Create DVD by title
    public DVDHungBQ(String title) { 
        this.title = title;             
    }

    //Create DVD by title, category and price
    public DVDHungBQ(String title, String category, float cost) { 
        this.title = title; 
        this.category = category;
        this.cost = cost;
    }

    //Create DVD by title, category, price and author
    public DVDHungBQ(String title, String category, String author, float cost) { 
        this.title = title; 
        this.category = category;
        this.author = author;
        this.cost = cost;
    }

    //Create DVD by title, category, price, author and length
    public DVDHungBQ(String title, String category, String author, int length, float cost) { 
        this.title = title; 
        this.category = category;
        this.author = author;
        this.length = length;
        this.cost = cost;
    }
}

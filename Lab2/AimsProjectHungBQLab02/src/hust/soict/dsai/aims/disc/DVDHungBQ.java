package hust.soict.dsai.aims.disc;
public class DVDHungBQ {
    //Khai báo thuộc tính
    private static int nbDigitalVideoDiscsHbq = 0;
    private int id;

    private String title;
    private String category;
    private String author;
    private int length;
    private float cost;

    //Các phương thức để chỉnh sửa thuộc tính của DVD
    public void setTitleHbq(String titleSet) { 
        title = titleSet; 
    }
    public void setCategoryHbq(String categorySet) { 
        category = categorySet; 
    }
    public void setAuthorHbq(String authorSet) { 
        author = authorSet; 
    }
    public void setLengthHbq(int lengthSet) { 
        length = lengthSet; 
    }
    public void setCostHbq(float costSet) { 
        cost = costSet; 
    }

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
    public int getIDHbq() {
        return id;
    }

    // Create DVD by title
    public DVDHungBQ(String title) { 
        this.title = title;        
        this.id = ++nbDigitalVideoDiscsHbq;     
    }
    //Create DVD by title, category and price
    public DVDHungBQ(String title, String category, float cost) { 
        this(title);
        this.category = category;
        this.cost = cost; 
    }
    //Create DVD by title, category, price and author
    public DVDHungBQ(String title, String category, String author, float cost) { 
        this(title, category, cost);
        this.author = author;     
    }
    //Create DVD by title, category, price, author and length
    public DVDHungBQ(String title, String category, String author, int length, float cost) { 
        // this.title = title; 
        // this.category = category;
        // this.author = author;
        // this.length = length;
        // this.cost = cost;        
        // this.id = ++nbDigitalVideoDiscsHbq;     
        this(title, category, author, cost);
        this.length = length;
    }
    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title); // So sánh tiêu đề không phân biệt chữ hoa/thường
    }
    
}

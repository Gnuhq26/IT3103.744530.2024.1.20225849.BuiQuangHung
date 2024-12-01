package hust.soict.dsai.aims.media;
public abstract class MediaHbq {
    private int id;
    private String title;
    private String category;
    private float cost;

    // Constructor
    public MediaHbq() {}
    public MediaHbq(String title, float cost) {
        this.title = title;
        this.cost = cost;
    }
    public MediaHbq(String title, String category, float cost) {
        this(title, cost);
        this.cost = cost;
    }
    public MediaHbq(int id, String title, String category, float cost) {
        this(title, category, cost);
        this.id = id;
    }    

    // Getters and Setters
    public int getIdHbq() {
        return id;
    }

    public void setIdHbq(int id) {
        this.id = id;
    }

    public String getTitleHbq() {
        return title;
    }

    public void setTitleHbq(String title) {
        this.title = title;
    }

    public String getCategoryHbq() {
        return category;
    }

    public void setCategoryHbq(String category) {
        this.category = category;
    }

    public float getCostHbq() {
        return cost;
    }

    public void setCostHbq(float cost) {
        this.cost = cost;
    }
}

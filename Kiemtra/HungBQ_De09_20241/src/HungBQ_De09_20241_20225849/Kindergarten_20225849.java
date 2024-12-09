package HungBQ_De09_20241_20225849;
public class Kindergarten_20225849 extends Child_20225849 {

    private String favoriteToy;

    // Constructor
    public Kindergarten_20225849(String name_20225849, int age_20225849, String className_20225849, String favoriteToy) {
        super(name_20225849, age_20225849, className_20225849);
        this.favoriteToy = favoriteToy;
    }

    // Getter
    public String getFavoriteToy_20225849() {
        return favoriteToy;
    }
    // Setter
    public void setFavoriteToy_20225849(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    @Override
    public void displayInfo_20225849() {
        System.out.println("Kindergarten_20225849" + toString() + favoriteToy);
    }
}

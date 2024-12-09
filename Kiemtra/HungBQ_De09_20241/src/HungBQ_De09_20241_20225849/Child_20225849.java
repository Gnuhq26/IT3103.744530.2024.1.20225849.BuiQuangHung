package HungBQ_De09_20241_20225849;
public class Child_20225849 {

    private String name_20225849;
    private int age_20225849;
    private String className_20225849;

    // Constructor
    public Child_20225849(String name_20225849, int age_20225849, String className_20225849) {
        this.age_20225849 = age_20225849;
        this.name_20225849 = name_20225849;
        this.className_20225849 = className_20225849;
    }
    public Child_20225849() {}

    // Getter
    public String getName_20225849() {
        return name_20225849;
    }
    public int getAge_20225849() {
        return age_20225849;
    }
    public String getClassName_20225849() {
        return className_20225849;
    }
    // Setter
    public void setName_20225849(String name_20225849) {
        this.name_20225849 = name_20225849;
    }
    public void setAge_20225849(int age_20225849) {
        this.age_20225849 = age_20225849;
    }

    public void setClassName_20225849(String className_20225849) {
        this.className_20225849 = className_20225849;
    }

    public String toString() {
        return " Name = " + getName_20225849() + ", age = " + getAge_20225849() + ", Classname = " + getClassName_20225849() + ", ";
    }
    public void displayInfo_20225849() {
        System.out.println(toString());
    }
}

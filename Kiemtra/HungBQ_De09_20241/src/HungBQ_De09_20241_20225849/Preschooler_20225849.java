package HungBQ_De09_20241_20225849;
public class Preschooler_20225849 extends Child_20225849 {

    private String guardian;

    // Constructor
    public Preschooler_20225849(String name_20225849, int age_20225849, String className_20225849, String guardian) {
        super(name_20225849, age_20225849, className_20225849);
        this.guardian = guardian;
    }

    // Getter
    public String getGuardian_20225849() {
        return guardian;
    }

    // Setter
    public void setGuardian_20225849(String guardian) {
        this.guardian = guardian;
    }

    @Override
    public void displayInfo_20225849() {
        System.out.println("Preschooler_20225849" + toString() + guardian);
    }
}

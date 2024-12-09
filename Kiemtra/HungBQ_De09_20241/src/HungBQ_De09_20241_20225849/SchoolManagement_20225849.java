package HungBQ_De09_20241_20225849;
import java.util.ArrayList;

public class SchoolManagement_20225849 {
    private ArrayList<Child_20225849> Childs;
    public SchoolManagement_20225849() {
        Childs = new ArrayList<>();
    }
    
    public void addChild_20225849(Child_20225849 child) {
        Childs.add(child);
    }
    public void displayAll_20225849() {
        for (Child_20225849 child : Childs) {
            child.displayInfo_20225849();
        }
    }
    
    public void searchByName_20225849(String name) {
        for (Child_20225849 child : Childs) {
            if (child.getName_20225849().equalsIgnoreCase(name)) {
                child.displayInfo_20225849();
                return;
            }
        }
        System.out.println("Khong tim thay");
    }
}

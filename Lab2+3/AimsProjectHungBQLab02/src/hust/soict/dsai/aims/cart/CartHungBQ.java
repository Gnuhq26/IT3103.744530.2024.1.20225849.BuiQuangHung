package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DVDHungBQ;
public class CartHungBQ {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DVDHungBQ itemsOrdered[] = new DVDHungBQ[MAX_NUMBERS_ORDERED];

    private int qtyOrdered = 0;

    //Add DVD
    public void addDVDHbq(DVDHungBQ disc) {
        if(qtyOrdered < 20) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The DVD " + '\"' + disc.getTitleHbq() + '\"' + " has been added!");
        } else {
            System.out.println("Your cart is full, can not add more!");
        }
    }
    //Method add a list of DVDs to the current cart. 
    // public void addDVDHbq(DVDHungBQ [] dvdListHbq) {
    //     for(DVDHungBQ  disc : dvdListHbq) {
    //         addDVDHbq(disc);
    //     }
    //     System.out.println("DVDS have been added to the cart");
    // }

    //Method với tham số đầu vào là tùy ý
    public void addDVDHbq(DVDHungBQ... dvdListHbq) {
        for (DVDHungBQ disc : dvdListHbq) {
            addDVDHbq(disc);
        }
        System.out.println("DVDs have been added to the cart");
    }

    // Overloading by differing of number of parameters
    public void addDVDHbq(DVDHungBQ dvd1, DVDHungBQ dvd2) {
        addDVDHbq(dvd1);
        addDVDHbq(dvd2);
        System.out.println("DVDs have been added to the cart");
    }   
    //Remove DVD 
    public void removeDVDHbq(DVDHungBQ disc) {
        if(itemsOrdered[0] == null) {
            System.out.println("Your cart is empty!"); return ;
        }
        for(int i=0; i<qtyOrdered; i++){
            if(itemsOrdered[i].getTitleHbq().equals(disc.getTitleHbq())){
                for(int j=i; j<qtyOrdered-1; j++){
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                itemsOrdered[qtyOrdered-1] = null;
                qtyOrdered--;
                System.out.println("Remove DVD " + '\"' + disc.getTitleHbq() + '\"' + " successfully!");
                break;
            }
        }
    }

    //Caculate total cost
    public float totalCostHbq(){
        float total = 0;
        for(int i=0; i<qtyOrdered; i++){
            total += itemsOrdered[i].getCostHbq();
        }
        return total;
    }

    // Method to list all DVDs in the cart with their IDs
    public void listID() {
        if (qtyOrdered == 0) {
            System.out.println("Your cart is empty!");
            return;
        }
        System.out.println("List of DVDs in the cart:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println("DVD ID: " + itemsOrdered[i].getIDHbq() +
             ", Title: " + itemsOrdered[i].getTitleHbq());
        }
    }

    // Print cart
    public void printCartHbq() {
        StringBuilder output = new StringBuilder("*********************CART************************** \nOrdered items: \n");
        for (int i = 0; i < qtyOrdered;i++) {
            output.append(i+1 + ". DVD - [" + itemsOrdered[i].getTitleHbq() + "] - [" + itemsOrdered[i].getCategoryHbq() + "] - ["
                    + itemsOrdered[i].getAuthorHbq() + "] - [" + itemsOrdered[i].getLengthHbq() + "]: "
                    + itemsOrdered[i].getCostHbq() + " $\n");
        }
        output.append("Total: ").append(totalCostHbq()).append(" $\n");
        output.append("***************************************************\n");
        System.out.println(output);
    }
    // Search by Id
    public void searchByIDHbq(int id) {
        boolean found = false;
        System.out.println("Search results for Id \"" + id + "\":");
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getIDHbq() == id) {
                System.out.println("Your cart has DVD with Id = " + id + ", it's title is " + itemsOrdered[i].getTitleHbq());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with Id = " + id);
        }
    }
    
    // Search by Title
    public void searchByTitleHbq(String title) {
        boolean found = false;
        System.out.println("Search results for title \"" + title + "\":");
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println("Your cart has DVD with title  " + itemsOrdered[i].getTitleHbq() + ", it's Id is " + + itemsOrdered[i].getIDHbq());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD found with title \"" + title + "\"");
        }
    }
         
}

public class AimsHungBQ {
    public static void main(String[] args) {
        //Create new cart
        CartHungBQ anOrder = new CartHungBQ();

        //Create new DVD and add to cart
        DVDHungBQ DVD1 = new DVDHungBQ("Lion King", "Animation", "Roger Allers", 87, 19.95f);
        // anOrder.addDVDHbq(DVD1);
        DVDHungBQ DVD2 = new DVDHungBQ("Star Wars", "Science Fiction", "Geogre Lucas", 87,  24.95f);
        // anOrder.addDVDHbq(DVD2);
        DVDHungBQ DVD3 = new DVDHungBQ("Aladin", "Animation", 18.99f);
        // anOrder.addDVDHbq(DVD3);

       
        anOrder.addDVDHbq(DVD1, DVD2, DVD3);;
        //Print total cost of DVDs in cart
        System.out.printf("Total cost is: %.2f $ \n", anOrder.totalCostHbq());

        // anOrder.listID();
        
        // System.out.println("\nSearching by Id:");
        // anOrder.searchByID(2); // Should find "Star Wars"
        // anOrder.searchByID(5); // Should not find any DVD

        // Search by Title
        // System.out.println("\nSearching by Title:");
        // anOrder.searchByTitle("Aladin"); // Should find "Aladin"
        // anOrder.searchByTitle("Frozen"); // Should not find any DVD

    }
}

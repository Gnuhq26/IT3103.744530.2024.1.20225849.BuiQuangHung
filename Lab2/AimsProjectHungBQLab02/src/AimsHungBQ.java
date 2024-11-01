public class AimsHungBQ {
    public static void main(String[] args) {
        //Create new cart
        CartHungBQ anOrder = new CartHungBQ();

        //Create new DVD and add to cart
        DVDHungBQ DVD1 = new DVDHungBQ("Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDVDHbq(DVD1);
        DVDHungBQ DVD2 = new DVDHungBQ("Star Wars", "Science Fiction", "Geogre Lucas", 87,  24.95f);
        anOrder.addDVDHbq(DVD2);
        DVDHungBQ DVD3 = new DVDHungBQ("Aladin", "Animation", 18.99f);
        anOrder.addDVDHbq(DVD3);

        //Print total cost of DVDs in cart
        System.out.println("Total cost is: " + anOrder.totalCostHbq() + "$");

        //Remove DVD
        anOrder.removeDVDHbq(DVD3);

        //Print total cost of the DVDs in the cart after remove DVD
        System.out.println("Total cost is: " + anOrder.totalCostHbq() + "$");
        
    }
}

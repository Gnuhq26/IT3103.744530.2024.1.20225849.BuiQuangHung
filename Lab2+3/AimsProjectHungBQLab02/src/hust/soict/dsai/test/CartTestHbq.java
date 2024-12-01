package hust.soict.dsai.test;
import hust.soict.dsai.aims.cart.CartHungBQ;
import hust.soict.dsai.aims.disc.DVDHungBQ;

public class CartTestHbq {
    public static void main(String[] args) {
        CartHungBQ cart = new CartHungBQ();
        
        DVDHungBQ dvd1 = new DVDHungBQ("The Lion King","Animation",
                "Roger Allers",87,19.95f);
        cart.addDVDHbq(dvd1);
        DVDHungBQ dvd2 = new DVDHungBQ("Star wars","Science Fiction",
                "Geogre Lucas",87,24.95f);
        cart.addDVDHbq(dvd2);
        DVDHungBQ dvd3 = new DVDHungBQ("Aladin","Animation",18.99f);
        cart.addDVDHbq(dvd3);

        cart.printCartHbq();

        //Test search by ID method
        cart.searchByIDHbq(3);
        cart.searchByIDHbq(4);

        //Test search by Title method
        cart.searchByTitleHbq("The Lion King");
        cart.searchByTitleHbq("Alan Walker");
    }
}

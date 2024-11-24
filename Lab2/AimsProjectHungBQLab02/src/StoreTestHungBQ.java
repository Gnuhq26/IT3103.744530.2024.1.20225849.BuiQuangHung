public class StoreTestHungBQ {
    public static void main(String[] args) {
        StoreHungBQ myStore = new StoreHungBQ();

        DVDHungBQ DVD1 = new DVDHungBQ("Lion King", "Animation", "Roger Allers", 87, 19.95f);
        myStore.addDVDBQH(DVD1);
        DVDHungBQ DVD2 = new DVDHungBQ("Star Wars", "Science Fiction", "Geogre Lucas", 87,  24.95f);
        myStore.addDVDBQH(DVD2);
        DVDHungBQ DVD3 = new DVDHungBQ("Aladin", "Animation", 18.99f);
        myStore.addDVDBQH(DVD3);

        myStore.removeDVDBQH(DVD2);

    }
}

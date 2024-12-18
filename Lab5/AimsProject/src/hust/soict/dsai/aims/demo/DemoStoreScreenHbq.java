package hust.soict.dsai.aims.demo;
import javax.swing.*;

import hust.soict.dsai.aims.cart.CartHungBQ;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.screen.store.*;
import hust.soict.dsai.aims.store.*;
public class DemoStoreScreenHbq {
    public static void main(String[] args) {
        StoreHungBQ store = new StoreHungBQ();
        CartHungBQ cart = new CartHungBQ();

        MediaHbq m1 = new DVDHungBQ("Doraemon", "Anime", "Hungdeptrai",50,  15f);
        MediaHbq m2 = new BookHbq(0, "10000 questions WHY", "psychology", 17f);
        MediaHbq m3 = new CompactDiscHbq(1, "Deka ranger", "Super sentai", "Haideptrung", "RedDeka", 2, 19f);
        MediaHbq m4 = new DiscHbq(2, "One piece", "Anime", "Oda", 10, 99f);
        MediaHbq m5 = new DVDHungBQ("Naruto", "Anime", 20f);
        MediaHbq m6 = new BookHbq(2, "Atomic Habits", "Self-Help", 12.99f);
        MediaHbq m7 = new DVDHungBQ("Star Wars: Episode IV - A New Hope", "Sci-Fi", 7.99f);
        MediaHbq m8 = new CompactDiscHbq(3, "Coldplay - Parachutes", "Rock", "Coldplay", "Chris Martin",  45, 14.99f);
        MediaHbq m9 = new BookHbq(4, "The Lean Startup", "Business", 15.25f);

        store.addMediaHbq(m1);
        store.addMediaHbq(m2);
        store.addMediaHbq(m3);
        store.addMediaHbq(m4);
        store.addMediaHbq(m5);
        store.addMediaHbq(m6);
        store.addMediaHbq(m7);
        store.addMediaHbq(m8);
        store.addMediaHbq(m9);


        StoreScreenHbq storeScreen = new StoreScreenHbq(store);

        storeScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

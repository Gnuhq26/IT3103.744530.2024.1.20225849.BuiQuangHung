package hust.soict.dsai.aims.demo;

import javax.swing.*;
import hust.soict.dsai.aims.cart.CartHungBQ;
import hust.soict.dsai.aims.screen.cart.CartScreenHbq;
import hust.soict.dsai.aims.media.*;

public class DemoCartScreenHbq {
    public static void main(String[] args) {
        CartHungBQ cart = new CartHungBQ();

        MediaHbq m1 = new DVDHungBQ("Doraemon", "Anime", 15f);
        MediaHbq m2 = new BookHbq(0, "Why we sleep", "Scientific", 9f);
        MediaHbq m3 = new DVDHungBQ("Gao ranger", "Super sentai",  2);
        MediaHbq m4 = new CompactDiscHbq( 1, "Conan", "Anime", "Hihi", "Shinichi", 5,  10);

        cart.addMediaHbq(m1);
        cart.addMediaHbq(m2);
        cart.addMediaHbq(m3);
        cart.addMediaHbq(m4);


        CartScreenHbq cartScreen = new CartScreenHbq(cart);

        cartScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

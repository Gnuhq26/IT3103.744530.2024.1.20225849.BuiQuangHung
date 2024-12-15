package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.media.MediaHbq;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class CartScreenHbq extends JFrame {
    private static final long serialVersionUID = 1L;

    public CartScreenHbq(CartHungBQ cart) {
        setTitle("Your Cart");
        setSize(400, 300);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        // Hiển thị danh sách các mục trong giỏ hàng
        JPanel cartPanel = new JPanel();
        cartPanel.setLayout(new BoxLayout(cartPanel, BoxLayout.Y_AXIS));
        

        if (cart.getItemsHbq().isEmpty()) {
            cartPanel.add(new JLabel("Your cart is empty."));
        } else {
            for (MediaHbq media : cart.getItemsHbq()) {
                JLabel itemLabel = new JLabel(media.getTitleHbq() + " - $" + media.getCostHbq());
                cartPanel.add(itemLabel);
            }
        }

        JScrollPane scrollPane = new JScrollPane(cartPanel);  // Thêm thanh cuộn nếu cần
        cp.add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }
}
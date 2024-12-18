package hust.soict.dsai.aims.screen.store;

import hust.soict.dsai.aims.media.BookHbq;
import hust.soict.dsai.aims.store.StoreHungBQ;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class AddBookToStoreScreenHbq extends JFrame{
    private StoreHungBQ store;
    private JTextField title;
    private JTextField category;
    private JTextField content;
    private JTextField cost;
    private JTextField authors;
    private JButton btnSubmit;
    private JButton btnBack;

    public AddBookToStoreScreenHbq(StoreHungBQ store) {
        this.store = store;
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(6,6));

        cp.add(new JLabel("Enter title"));
        title = new JTextField(20);
        cp.add(title);

        cp.add(new JLabel("Enter authors (separated by space)"));
        authors = new JTextField(20);
        cp.add(authors);

        cp.add(new JLabel("Enter category"));
        category = new JTextField(20);
        cp.add(category);

        cp.add(new JLabel("Enter cost (float)"));
        cost = new JTextField(20);
        cp.add(cost);
        btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new StoreScreenHbq(store);
                dispose();

            }

        });
        btnSubmit = new JButton("Enter");

        btnSubmit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String titleString = title.getText();
                    String categoryString = category.getText();
                    float costFloat = Float.parseFloat(cost.getText());
                    List<String> authorsList = new ArrayList<String>();
                    String [] authorsArray = authors.getText().split(" ");
                    for (String author: authorsArray) {
                        authorsList.add(author);
                    }
                    BookHbq book = new BookHbq(1 ,titleString, categoryString,  costFloat);
                    for (String author: authorsArray) {
                        book.addAuthor(author);
                    }
                    store.addMediaHbq(book);
                    new StoreScreenHbq(store);
                    dispose();
                }catch(IllegalArgumentException ev){
                    JFrame frame = new JFrame();
                    JDialog dialog = new JDialog(frame, "Play media", true);
                    JPanel mainGui = new JPanel(new BorderLayout());

                    mainGui.setBorder(new EmptyBorder(50, 50, 50, 50));
                    mainGui.add(new JLabel("Cost must be float"));
                    JPanel buttonPanel = new JPanel(new FlowLayout());
                    mainGui.add(buttonPanel, BorderLayout.SOUTH);

                    JButton close = new JButton("Close");
                    close.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dialog.setVisible(false);
                            frame.setVisible(false);
                        }

                    });
                    buttonPanel.add(close);
                    frame.setLocationRelativeTo(null);
                    dialog.setContentPane(mainGui);
                    dialog.pack();
                    dialog.setLocationRelativeTo(frame);
                    dialog.setVisible(true);
                }
            }

        });
        cp.add(btnBack);
        cp.add(btnSubmit);

        setTitle("Add Book");
        setSize(600,240);

        setLocationRelativeTo(null);
        setVisible(true);

    }
}

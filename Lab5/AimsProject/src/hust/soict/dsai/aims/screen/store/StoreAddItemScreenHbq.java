package hust.soict.dsai.aims.screen.store;
import hust.soict.dsai.aims.store.StoreHungBQ;

import javax.swing.*;
import java.awt.*;

public class StoreAddItemScreenHbq extends JFrame {
    private StoreHungBQ store;

    JPanel createCenter() {
        JPanel mainCenterPanel = new JPanel();
        mainCenterPanel.setLayout(new BorderLayout());
        mainCenterPanel.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));

        JPanel center = new JPanel();
        center.setLayout(new GridLayout(2, 1, 10, 10));

        // Div trên: chia làm 2 cột
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(1, 2, 10, 10));

        // Left column: Media types
        JPanel leftColumn = new JPanel();
        leftColumn.setLayout(new BoxLayout(leftColumn, BoxLayout.Y_AXIS));

        JLabel mediaTypeLabel = new JLabel("Media Types");
        mediaTypeLabel.setFont(new Font(mediaTypeLabel.getFont().getName(), Font.BOLD, 18));
        mediaTypeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        leftColumn.add(mediaTypeLabel);
        leftColumn.add(Box.createRigidArea(new Dimension(0, 10)));

        String[] mediaTypes = {"CD", "DVD", "BOOK"};
        JComboBox<String> mediaTypeDropdown = new JComboBox<>(mediaTypes);
        mediaTypeDropdown.setMaximumSize(new Dimension(150, 25));
        mediaTypeDropdown.setAlignmentX(Component.CENTER_ALIGNMENT);
        mediaTypeDropdown.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1, true));
        mediaTypeDropdown.setBackground(Color.WHITE);
        mediaTypeDropdown.setForeground(Color.GRAY);
        mediaTypeDropdown.addActionListener(e -> {
            String selectedType = (String) mediaTypeDropdown.getSelectedItem();
            if ("CD".equals(selectedType)) {
                new AddCDToStoreScreenHbq(store);
                dispose();
            } else if ("DVD".equals(selectedType)) {
                new AddDVDToStoreScreenHbq(store);
                dispose();
            } else if ("BOOK".equals(selectedType)) {
                new AddBookToStoreScreenHbq(store);
                dispose();
            }
        });
        leftColumn.add(mediaTypeDropdown);

        // Right column: Input fields
        JPanel rightColumn = new JPanel();
        rightColumn.setLayout(new BoxLayout(rightColumn, BoxLayout.Y_AXIS));

        // Tạo các TextField với placeholder
        JTextField titleField = createPlaceholderTextField("Enter title");
        JTextField categoryField = createPlaceholderTextField("Enter category");
        JTextField directorField = createPlaceholderTextField("Enter director");
        JTextField costField = createPlaceholderTextField("Enter cost");
        JTextField lengthField = createPlaceholderTextField("Enter length");

        // Thêm các TextField với khoảng cách
        rightColumn.add(titleField);
        rightColumn.add(Box.createRigidArea(new Dimension(0, 5))); // Khoảng cách giữa các TextField
        rightColumn.add(categoryField);
        rightColumn.add(Box.createRigidArea(new Dimension(0, 5)));
        rightColumn.add(directorField);
        rightColumn.add(Box.createRigidArea(new Dimension(0, 5)));
        rightColumn.add(costField);
        rightColumn.add(Box.createRigidArea(new Dimension(0, 5)));
        rightColumn.add(lengthField);

        // Thêm hai cột vào div trên
        topPanel.add(leftColumn);
        topPanel.add(rightColumn);

        // Div dưới: Nút add ở trung tâm
        JPanel bottomPanel = new JPanel(new GridBagLayout());
        JButton addButton = new JButton("Add");
        addButton.setPreferredSize(new Dimension(100, 30));
        addButton.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1, true));
        addButton.setBackground(Color.WHITE);
        addButton.setForeground(Color.GRAY);
        bottomPanel.add(addButton);

        // Thêm hai div vào center
        center.add(topPanel);
        center.add(bottomPanel);

        mainCenterPanel.add(center, BorderLayout.CENTER);

        return mainCenterPanel;
    }

    // Phương thức tạo TextField với placeholder
    private JTextField createPlaceholderTextField(String placeholderText) {
        JTextField textField = new JTextField(placeholderText);
        textField.setForeground(Color.GRAY);
        textField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30)); // Giới hạn chiều cao
        textField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (textField.getText().equals(placeholderText)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (textField.getText().isEmpty()) {
                    textField.setText(placeholderText);
                    textField.setForeground(Color.GRAY);
                }
            }
        });
        textField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1, true));
        return textField;
    }

    public StoreAddItemScreenHbq(StoreHungBQ store) {
        this.store = store;

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(createCenter(), BorderLayout.CENTER);

        setTitle("Update Store");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
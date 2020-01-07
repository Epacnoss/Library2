package ui;

import nonUI.BookInfo;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class UIManager{

    JFrame frame;

    public UIManager(List<BookInfo> bks) {
        frame = new JFrame("la bibliothèque.");


        ArrayList<BookInfo> arr = new ArrayList<>();

        for (BookInfo b : bks) {
            arr.add(b);
        }

        frame.setPreferredSize(new Dimension(500, 700));

        frame.add(new Canvas(arr, 4, 15));


        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

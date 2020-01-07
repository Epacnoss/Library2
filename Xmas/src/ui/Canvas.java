package ui;

import main.main;
import nonUI.BookInfo;
import ui.pics.BookObjectUI;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Canvas extends JComponent {

    private ArrayList<BookObjectUI> bksUI;
    private int buffer, bksOnARow;

    public Canvas(ArrayList<BookInfo> bks, int bksOnARow, int buffer) {

        bksUI = new ArrayList<>();

        for (BookInfo b : bks) {
            bksUI.add(new BookObjectUI(b));
        }

        this.buffer = buffer;
        this.bksOnARow = bksOnARow;

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int w = main.w + buffer; //Book px width  + buffer
        int h = main.h + buffer; //Book px height + buffer

        int x = 0; //X on comp
        int y = 0; //Y on comp
        int currentColndex = 0;
        int currentRowIndex = 0;

        for (BufferedImage current : bksUI) {

            x = currentColndex * w;
            y = currentRowIndex * h;

            getGraphics().drawImage(current, x, y, null);

            currentColndex++;

            if(currentColndex == bksOnARow) {
                currentColndex = 0;
                currentRowIndex++;
            }

        }
    }
}

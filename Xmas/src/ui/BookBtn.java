package ui;

import ui.pics.BookObjectUI;

import java.awt.*;

public class BookBtn extends Button {

    public BookBtn(BookObjectUI bkImg) throws HeadlessException {
        Image temp = bkImg;
        getGraphics().drawImage(temp, 0, 0, null);
    }
}

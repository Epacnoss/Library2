package ui.pics;

import main.main;
import nonUI.BookInfo;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class BookObjectUI extends BufferedImage {

    BookInfo bk;

    public BookObjectUI(BookInfo bk_) {
        super(main.w, main.h, TYPE_INT_RGB);

        bk = bk_;
        Image temp = new BufferedImage(1, 1, 1);

        try {
            URL fn = this.getClass().getResource(bk.getFn());
            temp = ImageIO.read(fn);
        } catch (IOException e) {
            e.printStackTrace();
        }

        getGraphics().drawImage(temp, 0, 0, null);
        getGraphics().drawString(bk.getName() + " by: " + bk.getAuthor(), main.h + 10, 0);


        System.out.println();
    }

    public BookInfo getBk() {
        return bk;
    }
}

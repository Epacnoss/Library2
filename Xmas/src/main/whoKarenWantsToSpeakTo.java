package main;

import nonUI.cfgs.CfgReader;
import nonUI.BookInfo;
import ui.UIManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class whoKarenWantsToSpeakTo {

    List<CfgReader> readers;
    List<BookInfo> bks;
    String[] fns;

    public whoKarenWantsToSpeakTo(String[] fns_) {
        fns = fns_;
        readers = new ArrayList<>();
        bks = new ArrayList<>();

        for (int i = 0; i < fns.length; i++) {
            readers.add(new CfgReader(fns[i]));
            bks.add(new BookInfo(readers.get(i)));

        }

        Collections.sort(bks);

        UIManager m = new UIManager(bks);

    }
}

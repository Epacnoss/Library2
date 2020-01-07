package nonUI;

import nonUI.cfgs.CfgReader;

public class BookInfo implements Comparable<BookInfo> {

    private String name, author, series, bookNo, price, description, genre, fn;

    public BookInfo(CfgReader r) {
        String a = "all";


        name = r.get(a, "name").toString();
        author = r.get(a, "author").toString();
        series = r.get(a, "series").toString();
        bookNo = r.get(a, "bookNo").toString();
        price = r.get(a, "price").toString();
        description = r.get(a, "description").toString();
        genre = r.get(a, "genre").toString();
        fn = r.get(a, "pic").toString();
    }

    //region getters
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getSeries() {
        return series;
    }

    public String getBookNo() {
        return bookNo;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getGenre() {
        return genre;
    }

    public String getFn() {
        return fn;
    }
    //endregion

    @Override
    public int compareTo(BookInfo o) { //Sort by author, then series, then book no in series
        if(!author.equals(o.getAuthor())) { //If it isn't the same author, then sort by that
            return author.compareTo(o.getAuthor());
        }else if (!series.equals(o.getSeries())){ //If it isn't the same series
            return series.compareTo(o.getSeries());
        }else { //Same author, same series
            return bookNo.compareTo(o.getBookNo());
        }
    }
}

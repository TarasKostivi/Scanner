package less;

public enum Book {

    GREEN_BOOK(240, "enother text"),
    RED_BOOK(105, "enother text");

    private int pages;
    private String title;

    Book(int pages, String title) {
        this.pages = pages;
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }


    public static Book fromString(String bookString){
        for (Book book : values()){
            if (book.getTitle().equalsIgnoreCase(bookString));
            return book;
        }
        return null;
    }
}

package Book;

public class ChildBook extends Book {
    public ChildBook(String author, int bookCode, String category, String title) {
        super(author, bookCode, category, title, 0, 100);
    }

}

package Book;

public class Book{
    String author;
    int bookCode;
    String category;
    String title;
    double rating;
    private int pagesOfBook;

    public int returnPages(){
        return pagesOfBook;
    }

    Book(String author, int bookCode, String category, String title, double rating, int pagesOfBook) {
        this.author = author;
        this.bookCode = bookCode;
        this.category = category;
        this.title = title;
        this.rating = rating;
        this.pagesOfBook = pagesOfBook;
    }
/*
    public Book(String author, int year, String category, String title, double rating) {
        this.author = author;
        this.year = year;
        this.category = category;
        this.title = title;
        this.rating = rating;
        this.pagesOfBook = 100;
    }*/
    public String getBook(int BookCode){
        String Book = author+" "+BookCode+" "+category+" "+title+" "+rating;
        return Book;
    }

    public String getAuthor() {
        return author;
    }

    public int getBookCode() {
        return bookCode;
    }

    public String getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }

    public int getPagesOfBook() {
        return pagesOfBook;
    }
}

/**
2. Create a class Book with few properties (author, year, category, title etc.) and private
property pagesOfBook and method ReturnPages which will return number of pages. Default
constructor should create a book with 100 pages. Add additional constructor with which you
can set how much pages books will have. Create two more classes ChildBook and AdultBook
which inherit properties from Book. Class ChildBook contains collections of child books and
method ShowChildBook() which will represent all books which are category child. Class
AdultBook contains collections of adult, method ShowAdult Book which will represent all
books which are category adult and method SearchAdultBook which will ask user which book
wants to find typing the title, if that book exist in your collection return year, author, etc.,
otherwise for example ”Book does not exist!”
 */
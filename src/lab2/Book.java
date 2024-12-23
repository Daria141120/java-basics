package lab2;

public class Book {
    private String name;
    private String author;
    private Genre genre;
    private int pageCount;
    private int year;

    public Book() {
    }

    public Book(String name, String author, Genre genre, int pageCount, int year) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.pageCount = pageCount;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book {" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", pageCount=" + pageCount +
                ", year=" + year +
                '}';
    }
}

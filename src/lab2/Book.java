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

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getYear() {
        return year;
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

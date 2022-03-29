import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Book {
    protected String author;
    protected String title;
    protected  HashMap<String, String> genre;
    protected String shortDescription;
    protected ArrayList<String> tags;
    protected int rating;
    protected HashMap<String, Integer> bookId;

    public Book(String author, String title, HashMap<String, String> genre, String shortDescription, ArrayList<String> tags, int rating, HashMap<String, Integer> bookId) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.shortDescription = shortDescription;
        this.tags = tags;
        this.rating = rating;
        this.bookId = bookId;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public HashMap<String, String> getGenre() {
        return genre;
    }
    public void setGenre(HashMap<String, String> genre) {
        this.genre = genre;
    }

    public String getShortDescription() {
        return shortDescription;
    }
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public ArrayList<String> getTags() {
        return tags;
    }
    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    public HashMap<String, Integer> getBookId() {
        return bookId;
    }
    public void setBookId(HashMap<String, Integer> bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", genre=" + genre +
                ", shortDescription='" + shortDescription + '\'' +
                ", tags=" + tags +
                ", rating=" + rating +
                ", bookId=" + bookId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return rating == book.rating && Objects.equals(author, book.author) &&
                Objects.equals(title, book.title) && Objects.equals(genre, book.genre) &&
                Objects.equals(shortDescription, book.shortDescription) &&
                Objects.equals(tags, book.tags) &&
                Objects.equals(bookId, book.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, genre, shortDescription, tags, rating, bookId);
    }
}

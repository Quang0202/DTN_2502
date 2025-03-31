public class Book extends Document {
    private String author;
    private int numberOfPages;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", code='" + code + '\'' +
                ", imprint='" + imprint + '\'' +
                ", totalNumberOfPublications=" + totalNumberOfPublications +
                '}';
    }
}

public class Book {
    public String name;
    private int pageNumber;

    private Author author;

    public Book(String name, int pageNumber, Author author) {
        this.name = name;
        if(pageNumber < 0)
            this.pageNumber = 0;
        else
            this.pageNumber = pageNumber;
        this.author = author;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPageNumber() {
        return this.pageNumber;
    }
    public void setPageNumber(int pageNumber) {
        if(pageNumber < 0)
            this.pageNumber = 0;
        else
            this.pageNumber = pageNumber;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}

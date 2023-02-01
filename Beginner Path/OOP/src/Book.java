/**
 * Class for encapsulation practice
 *
 * @author: Yagmur Yildiz
 * @date: 2 Feb '23
 */
public class Book {
    private int pageNum;
    private String bookName, author;

    //=========== CONSTRUCTOR ===========
    Book(String bookName, int pageNum, String author) {
        this.bookName = bookName;
        this.author = author;

        if(pageNum < 1)
            this.pageNum = 0;
        else
            this.pageNum = pageNum;
    }

    //=========== GETTER ===========
    public int getPageNum() {
        return this.pageNum;
    }
    public String getBookName() {
        return this.bookName;
    }
    public String getAuthor() {
        return this.author;
    }

    //=========== SETTER ===========

    public void setPageNum(int pageNum) {
        if(pageNum < 1)
            this.pageNum = 0;
        else
            this.pageNum = pageNum;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}

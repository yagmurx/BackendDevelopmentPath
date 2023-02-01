/**
 * Encapsulation practice
 *
 * @author: Yagmur Yildiz
 * @date: 2 Feb '23
 */
public class encapsulation {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", 555, "JK Rowling");

        /* IT DOES NOT USE BECAUSE THEY ARE PRİVATE
        System.out.println( "Book name\t: " + book1.bookName +
                            "\nPage Number\t: " + book1.pageNum +
                            "\nAuthor\t: " + book1.author);
        */
        System.out.println( "Book name\t: " + book1.getBookName() +
                            "\nPage Number\t: " + book1.getPageNum() +
                            "\nAuthor\t: " + book1.getAuthor());
        book1.setPageNum(440);

        System.out.println( "Book name\t: " + book1.getBookName() +
                            "\nPage Number\t: " + book1.getPageNum() +
                            "\nAuthor\t: " + book1.getAuthor());
    }
}
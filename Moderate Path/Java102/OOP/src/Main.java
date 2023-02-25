public class Main {
    public static void main(String[] args) {

        Author au1 = new Author("Jose", "Saramago", 101, "Portugal");
        Author au2 = new Author("Aldous", "Huxley", 102, "United Kingdom");

        Book b1 = new Book("Blindless", 275, au1);
        Book b2 = new Book("Brave New World", -300, au2);
        Book b3 = new Book("Seeing", 240, au1);

        // USING GETTER
        System.out.println(b1.getPageNumber());
        System.out.println(b2.getPageNumber());

        // USING GETTER
        System.out.println(au1.getFirstName() + " " + au1.getLastName());

        // USING SETTER
        b2.setPageNumber(300);
        System.out.println(b2.getName());
        System.out.println(b2.getPageNumber());

        // USING SETTER
        System.out.println(b1.getName());
        b1.setName("Blindness");
        System.out.println(b1.getName());

        // INHERITANCE
        Book[] booksJS = {b1, b3};
        System.out.println("Average: " + au1.avgPage(booksJS));

        // AGGREGATION
        System.out.println(b1.getAuthor().getFirstName());
    }
}
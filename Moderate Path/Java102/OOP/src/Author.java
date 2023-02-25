public class Author {
    private String firstName;
    private String lastName;
    private int id;
    private String address;

    public Author(String firstName, String lastName, int id, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.address = address;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double avgPage(Book[] books) {
        double avr = 0.0;
        for(int i = 0; i<books.length; i++) {
            avr += books[i].getPageNumber();
        }
        return avr/books.length;
    }
}

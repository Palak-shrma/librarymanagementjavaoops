public class Records {

    private int book_code;
    private String name;
    private String author;
    private String subject;

    // Constructor
    public Records(int book_code, String name, String author, String subject) {
        this.book_code = book_code;
        this.name = name;
        this.author = author;
        this.subject = subject;
    }

    // Getter and Setter methods (optional)

    public int getbook_code() {
        return book_code;
    }

    public void setbook_code(int book_code) {
        this.book_code = book_code;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getauthor() {
        return author;
    }

    public void setauthor(String author) {
        this.author = author;
    }

    public String getsubject() {
        return subject;
    }

    public void setsubject(String subject) {
        this.subject = subject;
    }
}
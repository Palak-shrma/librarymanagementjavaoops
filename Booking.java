import java.time.LocalDate;

public class Booking {

    private int booking_id;
    private int book_code_bk;
    private int stu_id_bk;
    private LocalDate dated;
    private LocalDate returndated;

    // Constructor
    public Booking(int booking_id, int book_code_bk, int stu_id_bk, LocalDate dated, LocalDate retuDated) {
        this.booking_id = booking_id;
        this.book_code_bk = book_code_bk;
        this.stu_id_bk = stu_id_bk;
        this.dated = dated;
        this.returndated = retuDated;
    }

    // Getter and Setter methods (optional)

    public int getbooking_id() {
        return booking_id;
    }

    public void setbooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public int getbook_code_bk() {
        return book_code_bk;
    }

    public void setbook_code_bk(int book_code_bk) {
        this.book_code_bk = book_code_bk;
    }

    public int getstu_id_bk() {
        return stu_id_bk;
    }

    public void setstu_id_bk(int stu_id_bk) {
        this.stu_id_bk = stu_id_bk;
    }

    public LocalDate getdated() {
        return dated;
    }

    public void setdated(LocalDate dated) {
        this.dated = dated;
    }

    public LocalDate getreturndated() {
        return returndated;
    }

    public void setreturndated(LocalDate returndated) {
        this.returndated = returndated;
    }

}

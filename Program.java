import java.time.LocalDate;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner objInt = new Scanner(System.in);
        Scanner objStr = new Scanner(System.in);

        Records[] aryRecords = new Records[10];
        int idxRecord = 0;
        Students[] aryStudents = new Students[10];
        int idxStudent = 0;
        Booking[] aryBookings = new Booking[10];
        int idxBooking = 0;

        int x = 0;
        int opt = 0;
        while (x == 0) {

            showOptions();
            opt = objInt.nextInt();

            if (opt == 10) {
                System.out.println("Bye bye");
                break;

            } else if (opt == 1) {
                // Add Book
                aryRecords[idxRecord] = getSingleRecord();
                idxRecord = idxRecord + 1;

            } else if (opt == 2) {
                // Add Student
                aryStudents[idxStudent] = getSingleStudent();
                idxStudent = idxStudent + 1;

            } else if (opt == 3) {
                // Show Books
                showBooks(aryRecords);

            } else if (opt == 4) {
                // Show Students
                showStudents(aryStudents);

            } else if (opt == 5) {
                // Get Single Booking
                aryBookings[idxBooking] = getSingleBooking();
                idxBooking = idxBooking + 1;

            } else if (opt == 6) {
                // Show Bookings

                showBooking(aryBookings, aryRecords, aryStudents);

            } else if (opt == 7) {
                // Search Student by name
                String stuName = "";
                System.out.println("Enter student name");
                stuName = objStr.nextLine();

                searchStudentByName(stuName, aryStudents);

            } else if (opt == 8) {
                // Search Book by name
                String bookName = "";
                System.out.println("Enter Book name");
                bookName = objStr.nextLine();

                searchBookByName(bookName, aryRecords);

            } else if (opt == 9) {
                // Search Book by name
                String studentName = "";
                System.out.println("Enter Student name");
                studentName = objStr.nextLine();
                searchBookingByStudentName(studentName, aryBookings, aryStudents, aryRecords);

            }

        }
    }

    public static void showOptions() {
        System.out.println("Press 1 to Add Book");
        System.out.println("Press 2 to Add Student");
        System.out.println("Press 3 to List of Books");
        System.out.println("Press 4 to List of Students");
        System.out.println("Press 5 to Add Booking ");
        System.out.println("Press 6 to List of Bookings");
        System.out.println("Press 7 to Search Student by Name");
        System.out.println("Press 8 to Search Book by Name");
        System.out.println("Press 9 to Search Booking by Student Name");
        System.out.println("Press 10 to Exit");

    }

    public static Records getSingleRecord() {

        Scanner objInt = new Scanner(System.in);
        Scanner objString = new Scanner(System.in);
        int code = 0;
        String name = "", author = "", subject = "";
        // int book_code, String name, String author, String subject
        System.out.println("Enter Book Code : ");
        code = objInt.nextInt();
        System.out.println("Enter Book Name : ");
        name = objString.nextLine();
        System.out.println("Enter Book Author : ");
        author = objString.nextLine();
        System.out.println("Enter Book Subject : ");
        subject = objString.nextLine();
        System.out.println("------------------");
        System.out.println("New Book Record Created");
        System.out.println("------------------\n");

        Records obj = new Records(code, name, author, subject);

        return obj;
    }

    public static Students getSingleStudent() {

        Scanner objInt = new Scanner(System.in);
        Scanner objString = new Scanner(System.in);
        int code = 0;
        String name = "", st_class = "", father = "";
        // int stu_id, String name, String stu_class, String fathername
        System.out.println("Enter Student ID : ");
        code = objInt.nextInt();
        System.out.println("Enter Student Name : ");
        name = objString.nextLine();
        System.out.println("Enter Student Class : ");
        st_class = objString.nextLine();
        System.out.println("Enter Student's Father Name : ");
        father = objString.nextLine();
        System.out.println("------------------");
        System.out.println("New Student Record Created");
        System.out.println("------------------\n");

        Students obj = new Students(code, name, st_class, father);

        return obj;
    }

    public static void showBooks(Records[] aryRecords) {
        System.out.println("########### LIST OF BOOKS ############");
        int emp = 0;
        for (int x = 0; x < aryRecords.length; x++) {

            if (aryRecords[x] != null) {
                System.out.println("Book Code :: " + aryRecords[x].getbook_code());
                System.out.println("Book Name :: " + aryRecords[x].getname());
                System.out.println("Book Author :: " + aryRecords[x].getauthor());
                System.out.println("Book Subject :: " + aryRecords[x].getsubject());
                System.out.println("------------------------- ");
            } else {
                emp = emp + 1;
            }

        }

        if (emp == 10) {
            System.out.println("_____________________\n");
            System.out.println("No book added yet in the List");
            System.out.println("_____________________");

        }

    }

    public static void showStudents(Students[] aryStudents) {
        System.out.println("########### LIST OF STUDENTS ############");
        int emp = 0;
        for (int x = 0; x < aryStudents.length; x++) {

            if (aryStudents[x] != null) {
                System.out.println("Student ID :: " + aryStudents[x].getstu_id());
                System.out.println("Student Name :: " + aryStudents[x].getname());
                System.out.println("Student Class :: " + aryStudents[x].getstu_class());
                System.out.println("Student's Father name :: " + aryStudents[x].getfathername());
                System.out.println("------------------------- ");
            } else {
                emp = emp + 1;
            }

        }

        if (emp == 10) {
            System.out.println("_____________________\n");
            System.out.println("No Students added yet in the List");
            System.out.println("_____________________");

        }

    }

    public static Booking getSingleBooking() {

        Scanner objInt = new Scanner(System.in);
        Scanner objString = new Scanner(System.in);
        int bookCode = 0, studentID = 0;
        LocalDate currentDate, returnDate;

        System.out.println("Enter Book Code");
        bookCode = objInt.nextInt();

        System.out.println("Enter Student ID");
        studentID = objInt.nextInt();

        currentDate = LocalDate.now();
        returnDate = currentDate.plusDays(14);

        Booking objBooking = new Booking(studentID, bookCode, studentID, currentDate, returnDate);
        System.out.println("------------------");
        System.out.println("New Booking Record Created");
        System.out.println("------------------\n");

        return objBooking;
    }

    public static void showBooking(Booking[] aryBookings, Records[] aryRecords, Students[] aryStudents) {
        System.out.println("########### List of Students ############");
        int emp = 0;
        for (int x = 0; x < aryBookings.length; x++) {

            if (aryBookings[x] != null) {

                System.out.println("Book code :: " + aryBookings[x].getbook_code_bk());
                System.out.println("Book Name :: " + bookName(aryBookings[x].getbook_code_bk(), aryRecords));
                System.out.println("Student Id :: " + aryBookings[x].getstu_id_bk());
                System.out.println("Student Name :: " + studentName(aryBookings[x].getstu_id_bk(), aryStudents));
                System.out.println("Issued Date :: " + aryBookings[x].getdated());
                System.out.println("Return Date :: " + aryBookings[x].getreturndated());
                System.out.println("------------------------- ");
            } else {
                emp = emp + 1;
            }
        }

        if (emp == 10) {
            System.out.println("No Booking added yet in the List");
        }

    }

    public static String bookName(int bookCode, Records[] aryRecords) {
        int x = 0;
        String name = "";
        for (x = 0; x < aryRecords.length; x++) {
            if (bookCode == aryRecords[x].getbook_code()) {
                name = aryRecords[x].getname();
                break;
            }
        }

        return name;
    }

    public static String studentName(int student_id, Students[] aryStudents) {
        int x = 0;
        String name = "";
        for (x = 0; x < aryStudents.length; x++) {
            if (student_id == aryStudents[x].getstu_id()) {
                name = aryStudents[x].getname();
                break;
            }
        }

        return name;
    }

    public static void searchStudentByName(String name, Students[] aryStudents) {
        int x = 0;
        int res = 0;
        for (x = 0; x < aryStudents.length; x++) {
            if (aryStudents[x] != null) {

                if (name.equals(aryStudents[x].getname())) {
                    System.out.println("############### Student Found ################");
                    System.out.println("Student ID :: " + aryStudents[x].getstu_id());
                    System.out.println("Name :: " + name);
                    System.out.println("Class :: " + aryStudents[x].getstu_class());
                    System.out.println("Father Name :: " + aryStudents[x].getfathername());
                    System.out.println("--------------------------------");
                    res = 1;
                }
            }
        }

        if (res == 0) {
            System.out.println("##### Student not found as per name given #####");
        }
    }

    public static void searchBookByName(String name, Records[] aryRecords) {
        int x = 0;
        int res = 0;
        for (x = 0; x < aryRecords.length; x++) {
            if (aryRecords[x] != null) {

                if (name.equals(aryRecords[x].getname())) {
                    System.out.println("############### Book Found ################");
                    System.out.println("Book Code :: " + aryRecords[x].getbook_code());
                    System.out.println("Name :: " + name);
                    System.out.println("Author :: " + aryRecords[x].getauthor());
                    System.out.println("Subject :: " + aryRecords[x].getsubject());
                    System.out.println("--------------------------------");
                    res = 1;
                }
            }
        }

        if (res == 0) {
            System.out.println("##### Book not found as per name given #####");
        }
    }

    public static void searchBookingByStudentName(String stName, Booking[] aryBookings, Students[] aryStudents,
            Records[] aryRecords) {

        int x = 0;
        int stuID = 0;
        for (x = 0; x < aryStudents.length; x++) {
            if (aryStudents[x] != null) {

                if (stName.equals(aryStudents[x].getname())) {
                    stuID = aryStudents[x].getstu_id();

                }
            }
        }

        if (stuID == 0) {
            System.out.println("##### Student Not Found #####");

        } else {
            // get Booking by Student ID

            int emp = 0;
            for (x = 0; x < aryBookings.length; x++) {

                if (aryBookings[x] != null) {
                    if (aryBookings[x].getstu_id_bk() == stuID) {
                        System.out.println("Book code :: " + aryBookings[x].getbook_code_bk());
                        System.out.println("Book Name :: " + bookName(aryBookings[x].getbook_code_bk(), aryRecords));
                        System.out.println("Student Id :: " + aryBookings[x].getstu_id_bk());
                        System.out
                                .println("Student Name :: " + studentName(aryBookings[x].getstu_id_bk(), aryStudents));
                        System.out.println("Issued Date :: " + aryBookings[x].getdated());
                        System.out.println("Return Date :: " + aryBookings[x].getreturndated());
                        System.out.println("------------------------- ");
                    }
                }
            }
        }
    }

}
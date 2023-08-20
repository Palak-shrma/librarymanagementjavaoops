public class Students {

    private int stu_id;
    private String name;
    private String stu_class;
    private String fathername;

    // Constructor
    public Students(int stu_id, String name, String stu_class, String fathername) {
        this.stu_id = stu_id;
        this.name = name;
        this.stu_class = stu_class;
        this.fathername = fathername;
    }

    // Getter and Setter methods (optional)

    public int getstu_id() {
        return stu_id;
    }

    public void setstu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getstu_class() {
        return stu_class;
    }

    public void setstu_class(String stu_class) {
        this.stu_class = stu_class;
    }

    public String getfathername() {
        return fathername;
    }

    public void setfathername(String fathername) {
        this.fathername = fathername;
    }
}

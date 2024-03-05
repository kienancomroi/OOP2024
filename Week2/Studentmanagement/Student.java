package Week2.Studentmanagement;

public class Student {

    private String name;    // Tên sinh viên
    private String id;      // Mã sinh viên
    private String group;   // Lớp học
    private String email;   // Email sinh viên

    /**
     * Constructor mặc định.
     */
    Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2.
     * @param name  Tên sinh viên
     * @param id    Mã sinh viên
     * @param email Email sinh viên
     */
    Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    /**
     * Constructor 3.
     * @param s Đối tượng Student
     */
    Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    /**
     * Constructor 4.
     * @param name  Tên sinh viên
     * @param id    Mã sinh viên
     * @param group Lớp học
     * @param email Email sinh viên
     */
    public Student(String name, String id, String group, String email) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    public String getEmail() {
        return email;
    }

    /**
     * Trả về thông tin của sinh viên dưới dạng chuỗi.
     * @return Chuỗi thông tin sinh viên
     */
    String getInfo() {
        return String.format("%s - %s - %s - %s", getName(), getId(), getGroup(), getEmail());
    }
}
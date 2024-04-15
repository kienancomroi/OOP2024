
public class StudentManagement {
    private Student[] students = new Student[100]; // Mảng chứa các đối tượng sinh viên (tối đa 100)
    private int totalStudent = 0;

    public StudentManagement() {
    }

    /**
     * Kiểm tra hai sinh viên có cùng lớp hay không.
     *
     * @param s1 sinh viên thứ nhất
     * @param s2 sinh viên thứ hai
     * @return true nếu cùng lớp, ngược lại trả về false
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * Thêm sinh viên mới vào mảng.
     *
     * @param newStudent sinh viên mới
     */
    public void addStudent(Student newStudent) {
        students[totalStudent] = new Student(newStudent);
        totalStudent++;
    }

    /**
     * Sắp xếp danh sách sinh viên theo lớp.
     *
     * @return chuỗi danh sách sinh viên theo lớp
     */
    public String studentsByGroup() {
        if (students[0] == null) {
            return "";
        }

        // Sắp xếp theo thuật toán DFS
        int n = totalStudent;
        boolean[] visited = new boolean[100];
        String result = "";

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            String grp = students[i].getGroup();
            result = result + grp + "\n";
            for (int j = i; j < n; j++) {
                if (students[j].getGroup().equals(grp)) {
                    visited[j] = true;
                    result = result + students[j].getInfo() + "\n";
                }
            }
        }
        return result;
    }

    /**
     * Xóa sinh viên theo ID.
     *
     * @param id ID của sinh viên cần xóa
     */
    public void removeStudent(String id) {
        int flag = -1;
        for (int i = 0; i < totalStudent; i++) {
            if (students[i].getId().equals(id)) {
                flag = i;
                break;
            }
        }

        if (flag == -1) {
            System.err.println("Not found");
            return;
        }

        for (int i = flag; i < totalStudent - 1; i++) {
            students[i] = students[i + 1];
        }
        totalStudent--;
    }

    /**
     * ham main chay chuong trinh.
     * @param args quan ly may thang em
     */
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        Student s1 = new Student("Nguyen Van An", "17020001", "K62CC", "17020001@vnu.edu.vn");
        Student s2 = new Student("Nguyen Van B", "17020002", "K62CC", "17020002@vnu.edu.vn");
        Student s3 = new Student("Nguyen Van C", "17020003", "K62CB", "17020003@vnu.edu.vn");
        Student s4 = new Student("Nguyen Van D", "17020004", "K62CB", "17020004@vnu.edu.vn");
        studentManagement.addStudent(s1);
        studentManagement.addStudent(s2);
        studentManagement.addStudent(s3);
        studentManagement.addStudent(s4);
        System.out.println(studentManagement.studentsByGroup());
    }
}
import java.util.Arrays;

public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.group.equals(s2.group);
    }

    @Override
    public String toString() {
        return name + " - " + id + " – " + group + " – " + email;
    }
}

public class StudentManagement {
    private Student[] students;
    private int count;

    public StudentManagement() {
        students = new Student[100];
        count = 0;
    }

    public void addStudent(Student newStudent) {
        if (count < students.length) {
            students[count] = newStudent;
            count++;
        } else {
            System.out.println("Mảng sinh viên đã đầy.");
        }
    }

    public String studentsByGroup() {
        StringBuilder sb = new StringBuilder();
        boolean[] groups = new boolean[100];
        for (int i = 0; i < count; i++) {
            if (!groups[students[i].group.hashCode()]) {
                sb.append(students[i].group).append("\n");
                groups[students[i].group.hashCode()] = true;
            }
        }
        Arrays.sort(students, 0, count, (s1, s2) -> s1.group.compareTo(s2.group));
        for (int i = 0; i < count; i++) {
            sb.append(students[i]).append("\n");
        }
        return sb.toString();
    }

    public void removeStudent(String id) {
        for (int i = 0; i < count; i++) {
            if (students[i].id.equals(id)) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                count--;
                break;
            }
        }
    }

    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        sm.addStudent(new Student("Nguyen Van An", "17020001", "17020001@vnu.edu.vn"));
        sm.addStudent(new Student("Nguyen Van B", "17020002", "17020002@vnu.edu.vn"));
        sm.addStudent(new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn"));
        sm.addStudent(new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn"));
        System.out.println(sm.studentsByGroup());
        sm.removeStudent("17020002");
        System.out.println(sm.studentsByGroup());
    }
}

package Student;

import java.util.Scanner;

public class FileStudent extends Student {

    //Danh sách thuộc tính
    private String classOfStudent;
    private byte course;
    private byte semester;
    private String informationStudent;

    //Constructor
    public FileStudent() {
    }

    public FileStudent(String classOfStudent, byte course, byte semester, String informationStudent) {
        this.classOfStudent = classOfStudent;
        this.course = course;
        this.semester = semester;
        this.informationStudent = informationStudent;
    }

    public FileStudent(String name, String birthday, String country, String classOfStudent, byte course, byte semester, String informationStudent) {
        super(name, birthday, country);
        this.classOfStudent = classOfStudent;
        this.course = course;
        this.semester = semester;
        this.informationStudent = informationStudent;
    }

    //Getter and Setter
    public String getClassOfStudent() {
        return classOfStudent;
    }

    public void setClassOfStudent(String classOfStudent) {
        this.classOfStudent = classOfStudent;
    }

    public byte getCourse() {
        return course;
    }

    public void setCourse(byte course) {
        this.course = course;
    }

    public byte getSemester() {
        return semester;
    }

    public void setSemester(byte semester) {
        this.semester = semester;
    }

    public String getInformationStudent() {
        return informationStudent;
    }

    public void setInformationStudent(String informationStudent) {
        this.informationStudent = informationStudent;
    }

    //Danh sách phương thức
    public void addFileStudent() {
        super.addStudent();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập lớp của học sinh: ");
        classOfStudent = scanner1.nextLine();
        System.out.println("Nhập khóa học: ");
        course = scanner.nextByte();
        System.out.println("Nhập kỳ học: ");
        semester = scanner.nextByte();
        System.out.println("Nhập thông tin của học sinh: ");
        informationStudent = scanner1.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "{ Hồ sơ học sinh }" + "\n" +
                "Lớp: " + classOfStudent + "\n" +
                "Khóa học: " + course + "\n" +
                "Học kỳ: " + semester + "\n" +
                "Thông tin cá nhân: " + informationStudent;
    }

}

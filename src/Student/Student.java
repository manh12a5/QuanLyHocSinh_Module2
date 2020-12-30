package Student;

import java.util.Scanner;

public class Student {

    //Danh sách thuộc tính
    private String name;
    private String birthday;
    private String country;

    //Constructor
    public Student() {
    }

    public Student(String name, String birthday, String country) {
        this.name = name;
        this.birthday = birthday;
        this.country = country;
    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    //Danh sách phương thức
    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập họ tên học sinh: ");
        name = scanner.nextLine();
        do {
            System.out.println("Nhập ngày sinh học sinh (dd/MM/yyyy): ");
            birthday = scanner1.nextLine();
        } while (birthday.length() < 8);
        System.out.println("Nhập quê quán của học sinh: ");
        country = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "{ Thông tin học sinh }" + "\n" +
                "Họ tên: " + name + "\n" +
                "Ngày sinh: " + birthday + "\n" +
                "Quê quán: " + country + "\n" +
                "--------------------";
    }

}

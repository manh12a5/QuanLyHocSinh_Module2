import Student.FileStudent;

import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class ManagerStudent {
    public static Scanner scanner = new Scanner(System.in);
    public static FileStudent fileStudent = new FileStudent();

    //Danh sách thuộc tính
    List<FileStudent> arrStudents = new LinkedList<>();

    //Danh sách phương thức
    public void addNewStudent() {
        fileStudent.addFileStudent();
        arrStudents.add(fileStudent);
    }

    public void displayYearAndCountry() {
        boolean check = false;
        for (int i = 0; i < arrStudents.size(); i++) {
            if (arrStudents.get(i).getCountry().equalsIgnoreCase("Thái Nguyên") && arrStudents.get(i).getBirthday().startsWith("1985", 4)
                    || arrStudents.get(i).getCountry().equalsIgnoreCase("Thái Nguyên") && arrStudents.get(i).getBirthday().startsWith("1985", 5)
                    || arrStudents.get(i).getCountry().equalsIgnoreCase("Thái Nguyên") && arrStudents.get(i).getBirthday().startsWith("1985", 6)) {
                System.out.println(arrStudents.get(i));
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không có sinh viên theo yêu cầu");
        }
    }

    public void displayClass10A1() {
        byte count = 0;
        for (int i = 0; i < arrStudents.size(); i++) {
            if (arrStudents.get(i).getClassOfStudent().equalsIgnoreCase("10A1")) {
                System.out.println(arrStudents.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có sinh viên theo yêu cầu");
        }
    }

}

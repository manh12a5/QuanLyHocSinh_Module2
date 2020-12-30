import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static ManagerStudent managerStudent = new ManagerStudent();

    public static void main(String[] args) {
        System.out.println("---- Quản Lý Học Sinh ----");
        byte choice;
        do {
            listChoice();
            choice = scanner.nextByte();
            switch (choice) {
                case 1:
                    //Nhập thông tin
                    managerStudent.addNewStudent();
                    break;
                case 2:
                    //Display year: 1985 and Country: Thái Nguyên
                    managerStudent.displayYearAndCountry();
                    break;
                case 3:
                    //Display class: 10A1
                    managerStudent.displayClass10A1();
                    break;
            }
        } while (choice != 0);
    }

    private static void listChoice() {
        System.out.println("1. Nhập thông tin học sinh");
        System.out.println("2. Hiển thị những học sinh sinh năm 1985 và quê ở Thái Nguyên");
        System.out.println("3. Hiển thị những học sinh của lớp 10A1");
        System.out.println("0. Exit");
        System.out.print("Choice number: ");
    }

}

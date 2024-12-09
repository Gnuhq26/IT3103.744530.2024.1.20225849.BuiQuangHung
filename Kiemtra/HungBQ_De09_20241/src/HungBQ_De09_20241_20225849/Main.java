package HungBQ_De09_20241_20225849;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        SchoolManagement_20225849 school = new SchoolManagement_20225849();
        Scanner scanner = new Scanner(System.in);

        school.addChild_20225849(new Preschooler_20225849("Tuan Hung", 3, "3a1", "Nguyen Van A"));
        school.addChild_20225849(new Kindergarten_20225849("Quang Hung", 5, "5a1", "Bup be"));
        school.addChild_20225849(new Preschooler_20225849("An Long", 2, "2a1", "Le Van B"));
        school.addChild_20225849(new Kindergarten_20225849("Cuong Kien", 4, "4a1", "Sieu nhan"));
        school.addChild_20225849(new Preschooler_20225849("An Khanh", 3, "3a2", "Pham Van C"));
        while (true) {
            System.out.println("\nQuan li cac chau truong mam non - 20225849 - Bui Quang Hung - Ky 2024.1 - Ngay 09:");
            System.out.println("1. Them chau");
            System.out.println("2. Hien thi danh sach tat ca cac chau");
            System.out.println("3. Tim kiem va hien thi thong tin Chau theo ten duoc nhap tu ban phim");
            System.out.println("4. Thoat - Bui Quang Hung - 744530");
            System.out.print("Nhap lua chon cua ban: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 :
                    System.out.println("Nhap du lieu - Bui Quang Hung - 20225849");
                    System.out.println("a) Them Preschooler_20225849");
                    System.out.println("b) Them Kindegarten_20225849");
                    System.out.printf("Lua chon cua ban: ");
                    String inputChoice = scanner.nextLine();
                    if(inputChoice.compareTo("a") == 0){
                        System.out.println("Bui Quang Hung - 20225849");
                        System.out.print("Ho ten_20225849: ");
                        String name = scanner.nextLine();
                        System.out.print("Tuoi_20225849: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Lop_20225849: ");
                        String className = scanner.nextLine();
                        System.out.print("Nguoi giam ho_20225849: ");
                        String guardian = scanner.nextLine();
                        school.addChild_20225849(new Preschooler_20225849(name, age, className, guardian));
                    } else if (inputChoice.compareTo("b") == 0) {
                        System.out.println("Bui Quang Hung - 20225849");
                        System.out.print("Ho ten_20225849: ");
                        String name = scanner.nextLine();
                        System.out.print("Tuoi_20225849: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Lop_20225849: ");
                        String className = scanner.nextLine();
                        System.out.print("Do choi yeu thich_20225849: ");
                        String favorite = scanner.nextLine();
                        school.addChild_20225849(new Kindergarten_20225849(name, age, className, favorite));
                    }
                    break;
                case 2:
                    System.out.println("Hien thi thong tin - Bui Quang Hung - 20225849");
                    school.displayAll_20225849();
                    break;
                case 3:
                    System.out.println("Tiem kiem - Bui Quang Hung - 20225849");
                    System.out.print("Nhap Tenchau_20225849 can tim: ");
                    String name = scanner.nextLine();
                    school.searchByName_20225849(name);
                    break;
                case 4:
                    System.out.println("Thoat khoi chuong trinh - Bui Quang Hung - 744530");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int number = 1;
        while(number !=0){
            System.out.println("ẤN 1 để thêm sinh viên");
            System.out.println("ẤN 2 để xem thông tin sinh viên muốn xem");
            System.out.println("ẤN 3 để xoá thông tin 1 sinh viên");
            System.out.println("ẤN 4 để xem thông tin tất cả sinh viên");
            System.out.println("ẤN 0 ĐỂ THOÁT chương trình");
            int numbers = sc.nextInt();
            switch (numbers){
                case 1:
                    sc.nextLine();
                    System.out.println("Nhập tên sinh viên");
                    String name = sc.nextLine();
                    System.out.println("Nhập tên khối thi");
                    String gradeName = sc.nextLine();
                    System.out.println("Nhập môn thi thứ 1");
                    String object1 = sc.nextLine();
                    System.out.println("Nhập môn thi thứ 2");
                    String object2 = sc.nextLine();
                    System.out.println("Nhập môn thi thứ 3");
                    String object3 = sc.nextLine();
                    System.out.println("Nhập số báo danh");
                    String  identificationNumber = sc.nextLine();
                    System.out.println("Nhập địa chỉ");
                    String address = sc.nextLine();
                    System.out.println("Nhập diện ưu tiên");
                    String priorityArea = sc.nextLine();
                    Grade grade = new Grade(gradeName,object1,object2,object3);
                    Student student = new Student(name,grade,identificationNumber,address,priorityArea);
                    manager.addStudent(student);
                    break;
                case 2:
                    System.out.println("Nhập số báo danh sinh viên bạn muốn xem");
                    String name1 = sc.nextLine();
                    manager.showStudent(manager.getIndexbyIdentificationNumber(name1));
                    break;
                case 3:
                    System.out.println("Nhập số báo danh sinh viên bạn muốn xoá");
                    String name2 = sc.nextLine();
                    manager.deleteStudent(manager.getIndexbyIdentificationNumber(name2));
                    break;
                case 4:
                    manager.showAll();
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("NO CHOICE");
                    break;

            }
        }
    }
}
